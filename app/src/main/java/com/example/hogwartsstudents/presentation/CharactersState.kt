package com.example.hogwartsstudents.presentation

import com.example.hogwartsstudents.domain.model.Hogwarts

data class CharactersState(
    val isLoading:Boolean = false,
    val error: String? = null,
    val characters:ArrayList<Hogwarts> = ArrayList()
)
