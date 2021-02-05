package com.dinastiasoft.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        done_Button.setOnClickListener(){
            addNickName()
        }

        nickname_TextView.setOnClickListener(){
            displayView()
        }
    }

    private fun addNickName(){
        val nickName = nickname_EditText.text.toString()
        nickname_TextView.setText(nickName)
        nickname_TextView.visibility = View.VISIBLE
        nickname_TextView.text = "My nickname is $nickName"
        updateName()

    }

    private fun updateName(){
        done_Button.visibility = View.GONE
        nickname_EditText.visibility = View.GONE

    }

    private fun displayView(){
        nickname_EditText.visibility = View.VISIBLE
        done_Button.visibility = View.VISIBLE
        nickname_TextView.visibility = View.GONE
    }




}

