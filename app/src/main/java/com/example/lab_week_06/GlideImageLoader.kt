package com.example.lab_week_06

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import java.net.URL

class GlideImageLoader(private val context: Context) : ImageLoader {
    override fun loadImage(imageUrl: String, imageView: ImageView){
        Glide.with(context)
            .load(imageUrl)
            .centerCrop()
            .into(imageView)
    }
}