package com.example.hogwartsstudents.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hogwartsstudents.domain.repository.HogwartsRepository
import com.swayy.trainapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor(
    private val repository: HogwartsRepository
):ViewModel(){

    private val _state = mutableStateOf(CharactersState())
    val state: State<CharactersState> = _state

    init {
        getCharacters()
    }

    fun getCharacters() {
        viewModelScope.launch {
            when (val result = repository.getHogwarts()) {
                is Resource.Loading -> {
                    _state.value = CharactersState(isLoading = false, error = result.message)
                }

                is Resource.Success -> {
                    _state.value = CharactersState(isLoading = false, characters = result.data!!)
                }

                else -> {
                    state
                }
            }
        }
    }
}