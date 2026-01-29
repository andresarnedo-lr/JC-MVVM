package com.arnedo.jcmvvm.memes.view

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.arnedo.jcmvvm.R
import com.arnedo.jcmvvm.entities.Meme
import com.arnedo.jcmvvm.memes.viewmodel.MemeViewModel
import com.arnedo.jcmvvm.ui.components.MyProgressFullScreen
import com.arnedo.jcmvvm.ui.components.MyTextTitle


@Composable
fun MainView(modifier : Modifier, viewModel : MemeViewModel = viewModel()) {
    val uiState by viewModel.uiState.collectAsState()



    Box(modifier){
        Column{
            MyTextTitle(R.string.app_name)

            LazyVerticalGrid(columns = GridCells.Adaptive(
                minSize = dimensionResource(R.dimen.img_grid_size)
            )){
                items(uiState.items.size) { index ->
                    val meme = uiState.items[index]
                    ItemMemeView(meme)
                }

            }
        }

        AnimatedVisibility(visible = uiState.inProgress) { MyProgressFullScreen() }
    }
}




@Preview(showBackground = true)
@Composable
fun MainViewPreview() {
    MainView(Modifier)
}
