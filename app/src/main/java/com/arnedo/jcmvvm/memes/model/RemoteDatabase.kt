package com.arnedo.jcmvvm.memes.model

import com.arnedo.jcmvvm.entities.Meme
import com.arnedo.jcmvvm.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RemoteDatabase {
    private fun setupRetrofit() : Retrofit{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun getMemeService(): MemeService {
        return setupRetrofit().create(MemeService::class.java)
    }

    suspend fun getAllMemes(
        onResult : (List<Meme>?) -> Unit
    ) {
        try {
            val result = getMemeService().getAllMemes()
            onResult(result.data.memes)
        }catch (e: Exception) {
            onResult(null)
        }

    }

}