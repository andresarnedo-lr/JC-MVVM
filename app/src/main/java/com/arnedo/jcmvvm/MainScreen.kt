package com.arnedo.jcmvvm

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.arnedo.jcmvvm.ui.components.MyProgressFullScreen
import com.arnedo.jcmvvm.ui.components.MyTextTitle

@Preview(showBackground = true)
@Composable
fun MainViewPreview() {
    MainView(Modifier)
}


@Composable
fun MainView(modifier : Modifier) {
    Box(modifier){
        Column(){
            MyTextTitle(R.string.app_name)
        }

        AnimatedVisibility(visible = false) { MyProgressFullScreen() }
    }
}