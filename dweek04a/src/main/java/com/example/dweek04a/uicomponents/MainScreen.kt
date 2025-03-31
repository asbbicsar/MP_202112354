package com.example.dweek04a.uicomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dweek04a.model.Item
import com.example.dweek04a.model.TodoItemFactory

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val todoList = remember {
        //mutableStateListOf<Item>()
        TodoItemFactory.makeTodoList()
    }

    Column {
        TodoListTitle()
        TodoList(todoList)
        TodoItemInput(TodoItemFactory.makeTodoList())
    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    MainScreen()
}