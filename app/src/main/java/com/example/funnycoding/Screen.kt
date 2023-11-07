package com.example.funnycoding

sealed class Screen(val route: String) {
    object Main : Screen("main")
}
