package dev.oure.mytwitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        holder.tvName.text
    }

    override fun getItemCount(): Int {

    }
}

class TwitterViewholder(itemView: View): RecyclerView.ViewHolder(itemView){

}