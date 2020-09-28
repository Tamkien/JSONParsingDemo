package com.kienct.jsonparsingdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(private val posts: List<Post>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_layout, parent, false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int {
        return posts.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is PostViewHolder) {
            holder.bind(posts[position])
        }
    }

    inner class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(post: Post) {
            val id: TextView = itemView.findViewById(R.id.textViewID)
            val userId: TextView = itemView.findViewById(R.id.textViewUserID)
            val title: TextView = itemView.findViewById(R.id.textViewTitle)
            val body: TextView = itemView.findViewById(R.id.textViewBody)
            id.text = post.id.toString()
            userId.text = post.userId.toString()
            title.text = post.title
            body.text = post.body
        }
    }
}