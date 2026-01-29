package com.arnedo.jcmvvm.memes.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arnedo.jcmvvm.memes.model.RemoteDatabase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class MemeViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(MemeUiState())
    val uiState : StateFlow<MemeUiState> = _uiState.asStateFlow()

    init {
        getAllMemes()
    }

    private fun getAllMemes(){
        val db = RemoteDatabase()
        viewModelScope.launch {
            _uiState.update { state ->
                state.copy(inProgress = true)
            }
            db.getAllMemes { result ->
                if(result != null){
//                    _uiState.value = MemeUiState(items = result)
                    _uiState.update { it.copy(items = result)}
                }
                _uiState.update { state ->
                    state.copy(inProgress = false)
                }
            }
        }
    }
}