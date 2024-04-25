package com.example.hogwartsstudents.data.repository

import com.example.hogwartsstudents.data.HogwartsApi
import com.example.hogwartsstudents.data.mapper.toDomain
import com.example.hogwartsstudents.domain.model.Hogwarts
import com.example.hogwartsstudents.domain.repository.HogwartsRepository
import com.swayy.trainapp.util.Resource
import com.swayy.trainapp.util.safeApiCall
import kotlinx.coroutines.Dispatchers

class HogwartsRepositoryImpl(
    private val api: HogwartsApi
) : HogwartsRepository {
    override suspend fun getHogwarts(): Resource<ArrayList<Hogwarts>> {
        return safeApiCall(Dispatchers.IO) {
            val response = api.getCharacters()

            val result = response.map { it.toDomain() }

            ArrayList(result)
        }
    }
}