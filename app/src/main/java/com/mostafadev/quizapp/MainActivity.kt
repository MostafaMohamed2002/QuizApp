package com.mostafadev.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {

            if(edittextview.text!!.isEmpty()){
                Toast.makeText(this,"Please enter your name",Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this,QuizQuestionActivity::class.java)
                startActivity(intent)
                Toast.makeText(this,"Welcome ${edittextview.text}",Toast.LENGTH_LONG).show()
                finish()
            }

        }

    }
}

