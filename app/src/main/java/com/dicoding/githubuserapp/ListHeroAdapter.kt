package com.dicoding.githubuserapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ListHeroAdapter(private val listHero: ArrayList<Hero>) : RecyclerView.Adapter<ListHeroAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_hero, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, username, skill,follower, following, company, location, repository, photo) = listHero[position]
        holder.imgPhoto.setImageResource(photo)
        holder.tvName.text = name
        holder.tvUsername.text = username
        holder.tvSkill.text = skill
        holder.tvFollower.text = follower
        holder.tvFollowing.text = following
        holder.tvCompany.text = company
        holder.tvLocation.text = location
        holder.tvRepository.text = repository
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listHero[holder.adapterPosition])
        }

    }

    override fun getItemCount(): Int = listHero.size

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvUsername: TextView = itemView.findViewById(R.id.tv_item_username)
        var tvSkill: TextView = itemView.findViewById(R.id.tv_item_skill)
        var tvFollower: TextView = itemView.findViewById(R.id.tv_item_follower)
        var tvFollowing: TextView = itemView.findViewById(R.id.tv_item_following)
        var tvCompany: TextView = itemView.findViewById(R.id.tv_item_company)
        var tvLocation: TextView = itemView.findViewById(R.id.tv_item_location)
        var tvRepository: TextView = itemView.findViewById(R.id.tv_item_repository)

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Hero)
    }

}

