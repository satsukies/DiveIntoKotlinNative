package net.ddns.satsukies.diveintokotlinnative.common

expect fun platformName(): String

fun createApplicationScreenMessage(): String {
    return "Kotlin Rocks on ${platformName()}"
}