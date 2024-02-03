package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.sqrt

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var addBtn: Button
    lateinit var subBtn: Button
    lateinit var mulBtn: Button
    lateinit var divBtn: Button
    lateinit var powBtn: Button
    lateinit var squBtn: Button
    lateinit var modBtn: Button
    lateinit var facBtn: Button
    lateinit var clrBtn: Button

    lateinit var firstNumberField: EditText
    lateinit var secondNumberField: EditText

    lateinit var resultField: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addBtn = findViewById(R.id.btn_add)
        subBtn = findViewById(R.id.btn_sub)
        mulBtn = findViewById(R.id.btn_mul)
        divBtn = findViewById(R.id.btn_div)
        powBtn = findViewById(R.id.btn_pow)
        squBtn = findViewById(R.id.btn_squ)
        modBtn = findViewById(R.id.btn_mod)
        facBtn = findViewById(R.id.btn_fac)
        clrBtn = findViewById(R.id.btn_clr)

        addBtn.setOnClickListener(this)
        subBtn.setOnClickListener(this)
        mulBtn.setOnClickListener(this)
        divBtn.setOnClickListener(this)
        powBtn.setOnClickListener(this)
        squBtn.setOnClickListener(this)
        modBtn.setOnClickListener(this)
        facBtn.setOnClickListener(this)
        clrBtn.setOnClickListener(this)

        firstNumberField = findViewById(R.id.first_number_field)
        secondNumberField = findViewById(R.id.second_number_field)
        resultField = findViewById(R.id.result_field)
    }

    override fun onClick(v: View?) {
        var firstNumber = firstNumberField.text.toString().toDouble()
        var secondNumber = secondNumberField.text.toString().toDouble()

        var result = 0.0

        when(v?.id) {
            R.id.btn_add -> {
                result = firstNumber + secondNumber
            }

            R.id.btn_sub -> {
                result = firstNumber - secondNumber
            }

            R.id.btn_mul -> {
                result = firstNumber * secondNumber
            }

            R.id.btn_div -> {
                result = firstNumber / secondNumber
            }

            R.id.btn_pow -> {
                result = firstNumber * firstNumber

                secondNumberField.setText("")
            }

            R.id.btn_squ -> {
                result = sqrt(firstNumber)

                secondNumberField.setText("")
            }

            R.id.btn_mod -> {
                result = firstNumber % secondNumber
            }

            R.id.btn_fac -> {
                var factorial: Long = 1

                for (i in 1..firstNumber.toInt()) {
                    factorial *= i.toLong()
                }

                result = factorial.toDouble()
            }

            R.id.btn_clr -> {
                firstNumberField.setText("")
                secondNumberField.setText("")

                resultField.text = ""
            }
        }

        resultField.text = "Result: $result"
    }
}