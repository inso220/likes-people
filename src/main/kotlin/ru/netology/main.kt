package ru.netology

fun main () {
    val likes = 1011

    var line = "Понравилось " + likes + if (likes % 10 == 1 && likes % 100 != 11) " человеку" else " людям"
    println(line)
}