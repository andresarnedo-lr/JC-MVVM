package com.arnedo.jcmvvm.memes.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arnedo.jcmvvm.memes.model.RemoteDatabase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MemeViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(MemeUiState())
    val uiState : StateFlow<MemeUiState> = _uiState.asStateFlow()

    private fun getAllMemes(){
        val db = RemoteDatabase()
        viewModelScope.launch {
            db.getAllMemes { result ->
                if(result != null){
                    _uiState.value = MemeUiState(items = result)
                }
            }
        }
    }
}