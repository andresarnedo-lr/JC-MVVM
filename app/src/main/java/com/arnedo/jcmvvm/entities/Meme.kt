package com.arnedo.jcmvvm.entities

data class Meme(
    val id: Long,
    val name: String,
    val url: String,
    val width: Int,
    val height: Int,
    val box_count: Int
)
