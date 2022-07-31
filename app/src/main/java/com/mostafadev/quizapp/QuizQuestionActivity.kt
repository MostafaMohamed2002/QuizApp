package com.mostafadev.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.*
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quiz_question.*
import kotlin.math.log

class QuizQuestionActivity : AppCompatActivity(),View.OnClickListener {

    private var mCurrentPosition:Int=1
    private var mQuestionsList :ArrayList<Question>? =null
    private var mSelectedOption : Int = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        mQuestionsList=Constants.getQuestions()
        setQuestion()


    }

    private fun setQuestion() {

        i("Questions List size is", "${mQuestionsList?.size}")


        for (i in mQuestionsList!!) {
            e("Questions", i.question)
        }


        val question: Question = mQuestionsList!![mCurrentPosition]

        progressbar?.progress = mCurrentPosition
        var prosressmax = progressbar.max
        prosressmax = mQuestionsList!!.size
        progressbartext?.text = "$mCurrentPosition / ${prosressmax}"
        textviewtop?.text = question.question
        textViewoption1?.text = question.optionOne
        textViewoption2?.text = question.optionTwo
        textViewoption3?.text = question.optionThree
        textViewoption4?.text = question.optionFour

        if (mCurrentPosition == mQuestionsList!!.size){
            btn?.text="FINISH"
        }
        else{
            btn?.text="SUBMIT"
        }
    }

    fun defaultOptionView(){
        
    }


    override fun onClick(p0: View?) {

    }
}