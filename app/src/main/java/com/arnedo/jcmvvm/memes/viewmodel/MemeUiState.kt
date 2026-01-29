package com.arnedo.jcmvvm.memes.viewmodel

import com.arnedo.jcmvvm.entities.Meme

data class MemeUiState(
    val items: List<Meme> = emptyList(),
    val inProgress : Boolean = false
)
