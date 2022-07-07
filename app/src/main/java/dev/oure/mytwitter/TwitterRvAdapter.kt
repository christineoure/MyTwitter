package dev.oure.mytwitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class TwitterRvAdapter(var twitterList: List<Twitter>):
    RecyclerView.Adapter<TwitterViewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitterViewholder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.twitter_item_list, parent, false)
        return TwitterViewholder(itemView)
    }

    override fun onBindViewHolder(holder: TwitterViewholder, position: Int) {
        var currentTweet = twitterList.get(position)
        holder.tvName.text = currentTweet.name
        holder.tvMsg.text = currentTweet.msg
        holder.tvLikes.text = currentTweet.likes
        holder.tvShare.text = currentTweet.share
        holder.tvRetweet.text = currentTweet.retweet
        holder.tvHandle.text = currentTweet.handle
        holder.tvTweet.text = currentTweet.tweet
    }

    override fun getItemCount(): Int {
        return twitterList.size
    }
}

class TwitterViewholder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvMsg = itemView.findViewById<TextView>(R.id.tvMsg)
    var tvLikes = itemView.findViewById<TextView>(R.id.tvLikes)
    var tvShare = itemView.findViewById<TextView>(R.id.tvShare)
    var tvRetweet = itemView.findViewById<TextView>(R.id.tvRetweet)
    var tvHandle = itemView.findViewById<TextView>(R.id.tvHandle)
    var tvTweet = itemView.findViewById<TextView>(R.id.tvTweet)
}