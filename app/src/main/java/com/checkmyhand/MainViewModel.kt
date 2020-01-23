package com.checkmyhand

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var handValue: MutableLiveData<String>
    private var firstCard: MutableLiveData<Card>
    private var secondCard: MutableLiveData<Card>

    init {
        Log.d("CheckItHere", "here")
        handValue = MutableLiveData("None")
        firstCard = MutableLiveData(Card(Figure.NONE, Color.NONE))
        secondCard = MutableLiveData(Card(Figure.NONE, Color.NONE))
    }
    fun setHandValue(updatedHandValue: String) = handValue.apply { updatedHandValue }
    fun getHandValue() = handValue.value
}