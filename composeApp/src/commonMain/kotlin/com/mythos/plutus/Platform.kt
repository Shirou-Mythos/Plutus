package com.mythos.plutus

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform