package com.arnedo.jcmvvm.memes.model

import com.arnedo.jcmvvm.entities.MemeResponse
import com.arnedo.jcmvvm.utils.Constants
import retrofit2.http.GET

interface MemeService {
    @GET(Constants.PATH_MEMES)
    suspend fun getAllMemes(): MemeResponse

}