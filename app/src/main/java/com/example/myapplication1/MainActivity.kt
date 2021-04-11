package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var res = 0.0
    fun radioButtonClick(view: View) {
        val numberofprints = editTextNumber.text.toString().toDouble()
        if (view.id == R.id.radioButton) {
            Toast.makeText(this,"4 x 6 (19 cents)",Toast.LENGTH_SHORT).show()
            res = numberofprints * 0.19
        }
        if (view.id == R.id.radioButton2) {
            Toast.makeText(this,"5 x 7 (49 cents)",Toast.LENGTH_SHORT).show()
            res = numberofprints * 0.49
        }
        if (view.id == R.id.radioButton3) {
            Toast.makeText(this,"8 x 10 (79 cents)",Toast.LENGTH_SHORT).show()
            res = numberofprints * 0.79
        }
    }
    fun click(view: View) {
        textView.text = "The cost is $ " + res
    }
}
//var result = 0.0
//    }
//    fun radioButtonClick(view: View) {
//        //same as view.id == R.id.rb1
//        val num = pageNumber.text.toString().toDouble()   //first text view
//        //var result=0
//        if (view.id == R.id.r1) {
//            result=num*0.19
//        }
//        if (view.id == R.id.r2) {
//            result=num*0.49
//        }
//        if (view.id == R.id.r3) {
//            result=num*0.79
//        }
//        //answer.append(result.toString())
//            }
//fun click(view: View){
//        answer.text = "The order cost is $ "+result