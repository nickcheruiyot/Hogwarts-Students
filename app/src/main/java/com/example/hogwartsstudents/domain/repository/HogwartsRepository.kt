package com.example.hogwartsstudents.domain.repository

import com.example.hogwartsstudents.domain.model.Hogwarts
import com.swayy.trainapp.util.Resource

interface HogwartsRepository {
    suspend fun getHogwarts(): Resource<ArrayList<Hogwarts>>
}