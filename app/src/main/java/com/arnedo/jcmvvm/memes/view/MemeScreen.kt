package com.arnedo.jcmvvm.memes.view

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.arnedo.jcmvvm.R
import com.arnedo.jcmvvm.ui.components.MyProgressFullScreen
import com.arnedo.jcmvvm.ui.components.MyTextTitle


@Composable
fun MainView(modifier : Modifier) {
    Box(modifier){
        Column(){
            MyTextTitle(R.string.app_name)

            LazyVerticalGrid(columns = GridCells.Adaptive(
                minSize = dimensionResource(R.dimen.img_grid_size)
            )){
            }
        }

        AnimatedVisibility(visible = false) { MyProgressFullScreen() }
    }
}




@Preview(showBackground = true)
@Composable
fun MainViewPreview() {
    MainView(Modifier)
}
