package com.betafy.betafyapp.core.uikit.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import com.betafy.betafyapp.core.uikit.R

@Composable
fun BetafyLogo(
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.primary,
    showWordmark: Boolean = true
) {
    val resId = if (showWordmark) R.drawable.ic_betafy_logo_vertical else R.drawable.ic_betafy_mark
    val ratio = if (showWordmark) 576f / 550f else 575f / 415f

    Image(
        painter = painterResource(resId),
        contentDescription = "Betafy",
        modifier = modifier.aspectRatio(ratio),
        colorFilter = ColorFilter.tint(color)
    )
}