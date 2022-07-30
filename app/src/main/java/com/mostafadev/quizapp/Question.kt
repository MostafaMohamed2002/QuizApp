package com.mostafadev.quizapp


data class Question(
    var id : Int,
    var question:String,
    var optionOne:String,
    var optionTwo:String,
    var optionThree:String,
    var optionFour:String,
    var correctAnswer:Int
)
