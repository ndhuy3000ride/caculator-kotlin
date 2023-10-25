package com.example.caculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.caculator.ui.theme.CaculatorTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numberButtons = arrayOf(
            findViewById<Button>(R.id.zeroButton),
            findViewById<Button>(R.id.oneButton),
            findViewById<Button>(R.id.twoButton),
            findViewById<Button>(R.id.threeButton),
            findViewById<Button>(R.id.fourButton),
            findViewById<Button>(R.id.fiveButton),
            findViewById<Button>(R.id.sixButton),
            findViewById<Button>(R.id.sevenButton),
            findViewById<Button>(R.id.eightButton),
            findViewById<Button>(R.id.nineButton)
        )

        val ceButton: Button = findViewById(R.id.ceButton)
        val cButton: Button = findViewById(R.id.cButton)
        val bsButton: Button = findViewById(R.id.bsButton)
        val plusButton: Button = findViewById(R.id.plusButton)
        val minusButton: Button = findViewById(R.id.minusButton)
        val multiplyButton: Button = findViewById(R.id.multiplyButton)
        val divideButton: Button = findViewById(R.id.divideButton)
        val equalButton: Button = findViewById(R.id.equalButton)
        val negativeButton: Button = findViewById(R.id.negativeButton)
        val bigText: TextView = findViewById(R.id.bigText)
        val smallText: TextView = findViewById(R.id.smallText)
        var preNumber: Float = 0F

        fun numberPressed(number: Int) {
            bigText.setText(bigText.text.toString() + number.toString())
        }
        fun equalPressed(){
            if(smallText.text.toString().contains("+")){
                smallText.setText(smallText.text.toString() + bigText.text.toString() + "=")
                bigText.setText((preNumber + Integer.parseInt(bigText.text.toString())).toString())
            }
            if(smallText.text.toString().contains("-")){
                smallText.setText(smallText.text.toString() + bigText.text.toString() + "=")
                bigText.setText((preNumber - Integer.parseInt(bigText.text.toString())).toString())
            }
            if(smallText.text.toString().contains("x")){
                smallText.setText(smallText.text.toString() + bigText.text.toString() + "=")
                bigText.setText((preNumber * Integer.parseInt(bigText.text.toString())).toString())
            }
            if(smallText.text.toString().contains("/")){
                smallText.setText(smallText.text.toString() + bigText.text.toString() + "=")
                bigText.setText((preNumber / Integer.parseInt(bigText.text.toString())).toString())
            }
        }
        fun plusPressed(){
            if(smallText.text.toString().contains("+") && !smallText.text.toString().contains("=")) {
                preNumber = smallText.text.toString().substring(0, smallText.text.toString().length - 1).toFloat() + bigText.text.toString().toFloat()
                smallText.setText(preNumber.toString() + "+")
                bigText.setText("")
            }
            if(smallText.text.toString().contains("-") && !smallText.text.toString().contains("=")) {
                preNumber = smallText.text.toString().substring(0, smallText.text.toString().length - 1).toFloat() - bigText.text.toString().toFloat()
                smallText.setText(preNumber.toString() + "+")
                bigText.setText("")
            }
            if(smallText.text.toString().contains("x") && !smallText.text.toString().contains("=")) {
                preNumber = smallText.text.toString().substring(0, smallText.text.toString().length - 1).toFloat() * bigText.text.toString().toFloat()
                smallText.setText(preNumber.toString() + "+")
                bigText.setText("")
            }
            if(smallText.text.toString().contains("/") && !smallText.text.toString().contains("=")) {
                preNumber = smallText.text.toString().substring(0, smallText.text.toString().length - 1).toFloat() / bigText.text.toString().toFloat()
                smallText.setText(preNumber.toString() + "+")
                bigText.setText("")
            }
            if(smallText.text.toString().contains("=")){
                preNumber = bigText.text.toString().toFloat()
                smallText.setText(preNumber.toString() + "+")
                bigText.setText("")
            }
            if(!smallText.text.toString().contains("+") && !smallText.text.toString().contains("-") && !smallText.text.toString().contains("x") && !smallText.text.toString().contains("/") && !smallText.text.toString().contains("=")){
                preNumber = bigText.text.toString().toFloat()
                smallText.setText(smallText.text.toString() + bigText.text.toString() + "+")
                bigText.setText("")
            }
        }
        fun minusPressed(){
            if(smallText.text.toString().contains("+") && !smallText.text.toString().contains("=")) {
                preNumber = smallText.text.toString().substring(0, smallText.text.toString().length - 1).toFloat() + bigText.text.toString().toFloat()
                smallText.setText(preNumber.toString() + "-")
                bigText.setText("")
            }
            if(smallText.text.toString().contains("-") && !smallText.text.toString().contains("=")) {
                preNumber = smallText.text.toString().substring(0, smallText.text.toString().length - 1).toFloat() - bigText.text.toString().toFloat()
                smallText.setText(preNumber.toString() + "-")
                bigText.setText("")
            }
            if(smallText.text.toString().contains("x") && !smallText.text.toString().contains("=")) {
                preNumber = smallText.text.toString().substring(0, smallText.text.toString().length - 1).toFloat() * bigText.text.toString().toFloat()
                smallText.setText(preNumber.toString() + "-")
                bigText.setText("")
            }
            if(smallText.text.toString().contains("/") && !smallText.text.toString().contains("=")) {
                preNumber = smallText.text.toString().substring(0, smallText.text.toString().length - 1).toFloat() / bigText.text.toString().toFloat()
                smallText.setText(preNumber.toString() + "-")
                bigText.setText("")
            }
            if(smallText.text.toString().contains("=")){
                preNumber = bigText.text.toString().toFloat()
                smallText.setText(preNumber.toString() + "-")
                bigText.setText("")
            }
            if(!smallText.text.toString().contains("+") && !smallText.text.toString().contains("-") && !smallText.text.toString().contains("x") && !smallText.text.toString().contains("/") && !smallText.text.toString().contains("=")){
                preNumber = bigText.text.toString().toFloat()
                smallText.setText(smallText.text.toString() + bigText.text.toString() + "-")
                bigText.setText("")
            }
        }
        fun multiplyPressed(){
            if(smallText.text.toString().contains("+") && !smallText.text.toString().contains("=")) {
                preNumber = smallText.text.toString().substring(0, smallText.text.toString().length - 1).toFloat() + bigText.text.toString().toFloat()
                smallText.setText(preNumber.toString() + "x")
                bigText.setText("")
            }
            if(smallText.text.toString().contains("-") && !smallText.text.toString().contains("=")) {
                preNumber = smallText.text.toString().substring(0, smallText.text.toString().length - 1).toFloat() - bigText.text.toString().toFloat()
                smallText.setText(preNumber.toString() + "x")
                bigText.setText("")
            }
            if(smallText.text.toString().contains("x") && !smallText.text.toString().contains("=")) {
                preNumber = smallText.text.toString().substring(0, smallText.text.toString().length - 1).toFloat() * bigText.text.toString().toFloat()
                smallText.setText(preNumber.toString() + "x")
                bigText.setText("")
            }
            if(smallText.text.toString().contains("/") && !smallText.text.toString().contains("=")) {
                preNumber = smallText.text.toString().substring(0, smallText.text.toString().length - 1).toFloat() / bigText.text.toString().toFloat()
                smallText.setText(preNumber.toString() + "x")
                bigText.setText("")
            }
            if(smallText.text.toString().contains("=")){
                preNumber = bigText.text.toString().toFloat()
                smallText.setText(preNumber.toString() + "x")
                bigText.setText("")
            }
            if(!smallText.text.toString().contains("+") && !smallText.text.toString().contains("-") && !smallText.text.toString().contains("x") && !smallText.text.toString().contains("/") && !smallText.text.toString().contains("=")){
                preNumber = bigText.text.toString().toFloat()
                smallText.setText(smallText.text.toString() + bigText.text.toString() + "x")
                bigText.setText("")
            }
        }
        fun dividePressed(){
            if(smallText.text.toString().contains("+") && !smallText.text.toString().contains("=")) {
                preNumber = smallText.text.toString().substring(0, smallText.text.toString().length - 1).toFloat() + bigText.text.toString().toFloat()
                smallText.setText(preNumber.toString() + "/")
                bigText.setText("")
            }
            if(smallText.text.toString().contains("-") && !smallText.text.toString().contains("=")) {
                preNumber = smallText.text.toString().substring(0, smallText.text.toString().length - 1).toFloat() - bigText.text.toString().toFloat()
                smallText.setText(preNumber.toString() + "/")
                bigText.setText("")
            }
            if(smallText.text.toString().contains("x") && !smallText.text.toString().contains("=")) {
                preNumber = smallText.text.toString().substring(0, smallText.text.toString().length - 1).toFloat() * bigText.text.toString().toFloat()
                smallText.setText(preNumber.toString() + "/")
                bigText.setText("")
            }
            if(smallText.text.toString().contains("/") && !smallText.text.toString().contains("=")) {
                preNumber = smallText.text.toString().substring(0, smallText.text.toString().length - 1).toFloat() / bigText.text.toString().toFloat()
                smallText.setText(preNumber.toString() + "/")
                bigText.setText("")
            }
            if(smallText.text.toString().contains("=")){
                preNumber = bigText.text.toString().toFloat()
                smallText.setText(preNumber.toString() + "/")
                bigText.setText("")
            }
            if(!smallText.text.toString().contains("+") && !smallText.text.toString().contains("-") && !smallText.text.toString().contains("x") && !smallText.text.toString().contains("/") && !smallText.text.toString().contains("=")){
                preNumber = bigText.text.toString().toFloat()
                smallText.setText(smallText.text.toString() + bigText.text.toString() + "/")
                bigText.setText("")
            }
        }
        for (i in 0..9) {
            numberButtons[i].setOnClickListener {
                if(smallText.text.toString().contains("=")){
                    smallText.setText("")
                    bigText.setText("")
                }
                numberPressed(i)
            }
        }

        ceButton.setOnClickListener {
            bigText.setText("")
            smallText.setText("")
            preNumber = 0f
        }
        cButton.setOnClickListener {
            bigText.setText("")
            smallText.setText("")
            preNumber = 0f
        }
        bsButton.setOnClickListener {
            bigText.setText(bigText.text.toString().substring(0, bigText.text.toString().length - 1))
        }
        plusButton.setOnClickListener {
            plusPressed()
        }
        minusButton.setOnClickListener {
            minusPressed()
        }
        multiplyButton.setOnClickListener {
            multiplyPressed()
        }
        divideButton.setOnClickListener {
            dividePressed()
        }
        equalButton.setOnClickListener {
            equalPressed()
        }
        negativeButton.setOnClickListener {
            bigText.setText((bigText.text.toString().toFloat() * -1).toString())
        }
    }
}


