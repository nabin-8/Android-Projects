package com.example.gnzcalculator

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.example.gnzcalculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder
import kotlin.Exception

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var lastNumberic =false
    var stateError = false
    var lastDot = false
    private lateinit var expression: Expression

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    fun onAllclearClick(view: View) {
        binding.dataTv.text = ""
        binding.resultTv.text = ""
        stateError = false
        lastDot = false
        lastNumberic = false
        binding.resultTv.visibility = View.GONE

    }

    fun onEqualClick(view: View) {
        binding.dataTv.text = binding.resultTv.text.toString().drop(1)
    }

    fun onDigitClick(view: View) {

        if (stateError){
            binding.dataTv.text= (view as Button).text
            stateError= false
        }else{
            binding.dataTv.append((view as Button).text)
        }
        lastNumberic = true
        onEqual()
    }

    fun onOperatorClick(view: View) {
        if (!stateError && lastNumberic){
            binding.dataTv.append((view as Button).text)
            lastDot = false
            lastNumberic = false
            onEqual()
        }

    }

    fun onBackClick(view: View) {
        binding.dataTv.text = binding.dataTv.text.toString().dropLast(1)

        try {
            val lastChar = binding.dataTv.text.toString().last()

            if (lastChar.isDigit()){
                onEqual()
            }
        }catch (e : Exception){
            binding.resultTv.visibility = View.GONE
            Log.e("last char error",e.toString())
        }
    }

    fun onClearClick(view: View) {
        binding.dataTv.text = ""
        lastNumberic = false
    }
    fun onEqual(){
        if (lastNumberic && !stateError){
            val txt = binding.dataTv.text.toString()

            expression= ExpressionBuilder(txt).build()

            try {
                val result = expression.evaluate()

                binding.resultTv.visibility= View.VISIBLE
                binding.resultTv.text= "=" +result.toString()

            }catch (ex : ArithmeticException){

                Log.e("evalute error",ex.toString())
                binding.resultTv.text= "Error"
                stateError = true
                lastNumberic = false
            }
        }
    }
}