package com.shouexample.k.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }
    override fun onClick(v: View){
        if (v.id==R.id.button1){
            showTimePickerDialog()
        }
    }

     private fun showTimePickerDialog(){
        var TimePickerDialog=TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener{ view, hour, minute ->
                Log.d("UI_PARTS","$hour:$minute")

         var text = "$hour"
        if (hour>2){
            textView.text="おはよう"
        } else if(hour>10){
            textView.text="こんにちは"
        } else if(hour>18){
            textView.text="こんばんは"
        }
            },
            13,0,true)


     }
}













