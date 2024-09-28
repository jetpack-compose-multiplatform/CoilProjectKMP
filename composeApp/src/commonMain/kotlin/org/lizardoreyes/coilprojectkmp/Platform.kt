package org.lizardoreyes.coilprojectkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform