package com.betafy.feature.auth.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.betafy.betafyapp.core.uikit.theme.BetafySizes

@Composable
fun AuthPrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isLoading: Boolean = false,
    enabled: Boolean = true
) {
    Button(
        onClick = onClick,
        enabled = enabled && !isLoading,
        modifier = modifier
            .fillMaxWidth()
            .height(BetafySizes.buttonHeight),
        shape = MaterialTheme.shapes.medium,
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 0.dp,
            pressedElevation = 0.dp,
            focusedElevation = 0.dp,
            hoveredElevation = 0.dp,
            disabledElevation = 0.dp
        )
    ) {
        if (isLoading) {
            CircularProgressIndicator(
                modifier = Modifier.size(22.dp),
                color = MaterialTheme.colorScheme.onPrimary,
                strokeWidth = 2.5.dp
            )
        } else {
            Text(
                text = text,
                style = MaterialTheme.typography.labelLarge
            )
        }
    }
}

@Composable
fun AuthSecondaryButton(
    question: String,
    actionText: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    TextButton(
        onClick = onClick,
        modifier = modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.small
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = question,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                style = MaterialTheme.typography.bodyMedium
            )

            Text(
                text = actionText,
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.labelLarge
            )
        }
    }
}