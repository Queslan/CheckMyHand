package com.checkmyhand

enum class Figure(val figureValue: Int) {
    NONE(0),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14)
}

enum class Color(val color: Int) {
    NONE(0),
    SPADES(1),
    HEARTS(2),
    DIAMONDS(3),
    CLUBS(4)
}

data class Card(val figure: Figure, val color: Color)
