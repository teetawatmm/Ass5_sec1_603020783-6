package com.example.ass5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var radioGroup: RadioGroup
    lateinit var btn_show : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

radioGroup = findViewById(R.id.radioGroup)

    }
    fun onClickShowDetail(v: View) {
        var value = radioGroup.checkedRadioButtonId
        var rb = findViewById<RadioButton>(value)
        val intent = Intent (  this, SecondActivity::class.java)
        intent.putExtra ("stData", Employee(edit_name.text.toString() ,email.text.toString(),rb.text.toString(),salary.text.toString()))
        startActivity(intent)
    }
    fun reset(v:View){
        edit_name.text.clear()
        radioGroup.clearCheck()
        email.text.clear()
        salary.text.clear()
    }
}
