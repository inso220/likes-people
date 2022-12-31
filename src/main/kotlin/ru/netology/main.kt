package ru.netology

fun main () {
    val likes = 10002

    var line = "Понравилось " + likes + if (likes % 10 == 1) " человеку" else " людям"
    println(line)
}