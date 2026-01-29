package com.arnedo.jcmvvm.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.arnedo.jcmvvm.R
import com.arnedo.jcmvvm.ui.theme.Typography

@Composable

fun MyTextTitle( titleRes: Int) {
    Text(
        stringResource(titleRes),
        style = Typography.headlineMedium,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth()
    )
}