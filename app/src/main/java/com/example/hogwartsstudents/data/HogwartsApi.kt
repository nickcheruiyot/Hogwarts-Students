package com.example.hogwartsstudents.data

import com.example.hogwartsstudents.data.dto.HogwartsResponseDto
import retrofit2.http.GET

interface HogwartsApi {
    @GET("students")
    suspend fun getCharacters():HogwartsResponseDto
}