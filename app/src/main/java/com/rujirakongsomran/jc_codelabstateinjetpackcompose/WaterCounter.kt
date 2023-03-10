package com.rujirakongsomran.jc_codelabstateinjetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rujirakongsomran.jc_codelabstateinjetpackcompose.ui.theme.JC_CodelabStateInJetpackComposeTheme

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var count by rememberSaveable { mutableStateOf(0) }
        if (count > 0) {
            Text(text = "You've had $count glasses.")
        }
        Button(
            onClick = { count++ },
            enabled = count < 10
        ) {
            Text(text = "Add one")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun WaterCounterPreview() {
    JC_CodelabStateInJetpackComposeTheme {
        WaterCounter()
    }
}