package com.dicoding.githubuserapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_user)

        val data = intent.getParcelableExtra<Hero>("DATA")

        Log.d("Detail Data", data?.name.toString())

        val name = data?.name.toString()
        val userName = data?.username.toString()
        val skill = data?.skill.toString()
        val follower = data?.follower.toString()
        val following = data?.following.toString()
        val company = data?.company.toString()
        val location = data?.location.toString()
        val repository = data?.repository.toString()
        val avatar = data?.photo.toString()

        val avatarImageView = findViewById<ImageView>(R.id.image_person)
        avatarImageView.setImageResource(avatar.toInt())
        val nameText = findViewById<TextView>(R.id.text_person)
        nameText.text = name
        val userNameText = findViewById<TextView>(R.id.text_username)
        userNameText.text = userName
        val skillText = findViewById<TextView>(R.id.text_skill)
        skillText.text = skill
        val followerText = findViewById<TextView>(R.id.text_follower)
        followerText.text = follower
        val followingText = findViewById<TextView>(R.id.text_following)
        followingText.text = following
        val companyText = findViewById<TextView>(R.id.text_company)
        companyText.text = company
        val locationText = findViewById<TextView>(R.id.text_location)
        locationText.text = location
        val repositoryText = findViewById<TextView>(R.id.text_repository)
        repositoryText.text = repository
    }
}