package com.arnedo.jcmvvm.memes.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.arnedo.jcmvvm.R
import com.arnedo.jcmvvm.entities.Meme
import com.arnedo.jcmvvm.ui.components.MyCoilImage
import com.arnedo.jcmvvm.ui.theme.Typography
import com.arnedo.jcmvvm.ui.theme.WhiteTransparent

@Preview(showBackground = true)
@Composable
fun ItemMemeViewPreview() {
    ItemMemeView (meme = Meme(1, "Test", "Test", 1, 1, 1))
}

@Composable
fun ItemMemeView(meme: Meme) {
    Box(contentAlignment = Alignment.BottomCenter){
        MyCoilImage(
            url = meme.url,
            shape = RectangleShape,
            modifier = Modifier.size(dimensionResource(R.dimen.img_grid_size))
        )

        Card(
            Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = WhiteTransparent)
            ){
            Text(
                text = meme.name,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(horizontal = dimensionResource(R.dimen.common_padding_min)),
                style = Typography.titleMedium
                )
        }
    }
}