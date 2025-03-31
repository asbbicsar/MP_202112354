package com.example.dweek04a.uicomponents

import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TodoCheckbox(
    checked: Boolean,
    modifier: Modifier = Modifier,
    onCheckedChange: (Boolean) -> Unit
) {
    Checkbox(
        checked = true,
        onCheckedChange = { isChecked ->
            onCheckedChange(isChecked)
        }
    )
}

@Preview
@Composable
private fun TodoCheckboxPreview() {
    TodoCheckbox(checked = true){

    }
}