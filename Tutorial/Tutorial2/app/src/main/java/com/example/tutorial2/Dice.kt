package com.example.tutorial2

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}