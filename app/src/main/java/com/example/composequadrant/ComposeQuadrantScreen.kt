package com.example.composequadrant

import android.support.v4.os.IResultReceiver.Default
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview("ComposeQuadrantScreen")
@Composable
fun ComposeQuadrantScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        ComposeQuadrantScreenUpperPart()
        ComposeQuadrantScreenLowerPart()
    }
}

/**
 * 画面上半分
 */
@Preview("ComposeQuadrantScreenUpperPart")
@Composable
fun ComposeQuadrantScreenUpperPart() {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Card(
            color = Color.Green,
            textTitle = stringResource(R.string.green_text_title),
            textBody = stringResource(
                R.string.green_text_body
            )
        )
        Card(
            color = Color.Yellow,
            textTitle = stringResource(R.string.yellow_text_title),
            textBody = stringResource(R.string.yellow_text_body)
        )
    }
}

/**
 * 画面下半分
 */
@Composable
fun ComposeQuadrantScreenLowerPart() {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Card(
            color = Color.Cyan,
            textTitle = stringResource(R.string.cyan_text_title),
            textBody = stringResource(R.string.cyan_text_body)
        )
        Card(
            color = Color.LightGray,
            textTitle = stringResource(R.string.lightgray_text_title),
            textBody = stringResource(R.string.lightgray_text_body)
        )
    }

}

/**
 * Card
 */
@Composable
fun Card(
    modifier: Modifier = Modifier,
    color: Color,
    textTitle: String,
    textBody: String,
) {
    val screenHeight = LocalConfiguration.current.screenHeightDp / 2
    val screenWidth = LocalConfiguration.current.screenWidthDp / 2
    Box(
        modifier = modifier
            .height(screenHeight.dp)
            .width(screenWidth.dp)
            .background(color)
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = textTitle,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp),
            )
            Text(text = textBody)
        }
    }
}

@Preview("CardPreview")
@Composable
fun CardPreview() {
    Card(
        color = Color.Green,
        textTitle = "Text composable",
        textBody = "Displays text and follows Material Design guidelines."
    )
}

