package org.jetbrains

import io.ktor.websocket.*
import java.util.concurrent.atomic.AtomicInteger

class ChatConnection(val session: DefaultWebSocketSession) {
    companion object {
        val id = AtomicInteger()
    }
    val name = "User-${id.getAndIncrement()}"
}