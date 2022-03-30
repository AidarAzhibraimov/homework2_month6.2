package com.kg.geektech.homework2_month62.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImg(url: String) {
    Glide.with(this)
        .load(url)
        .into(this)
}