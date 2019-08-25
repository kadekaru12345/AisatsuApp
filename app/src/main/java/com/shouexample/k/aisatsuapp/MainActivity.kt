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
        val timePickerDialog=TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener{ view, hour, minute ->
                Log.d("UI_PARTS","$hour:$minute")
            },
            13,0,true)
        timePickerDialog.show()

         if(v.id ==R.id."$2:$00".."$9:$59"){
             textView1.text = TimePickerDialog.text.toString()
         } else if (v.id ==R.id."$10:00".."$17:59"){
             textView2.text = TimePickerDialog.text.toString()
         } else if (v.id == R.id."$18:00".."$1:59"){
             textView3.text = TimePickerDialog.text.toString()
         }
     }













}
