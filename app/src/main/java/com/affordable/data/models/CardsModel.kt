package com.affordable.data.models

data class CardsModel(
    val cardId: Int,
    val cardType: String,
    val cardCVC: String,
    var isSelected: Boolean
)
