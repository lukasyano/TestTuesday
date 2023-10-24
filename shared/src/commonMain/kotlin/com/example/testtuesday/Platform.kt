package com.example.testtuesday

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform