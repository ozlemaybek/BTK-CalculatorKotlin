package com.ozlem.calculatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
// MainActivity ve xml arasında senkronizasyon sağlamak için:
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //tanımlama:
    // Bölme işleminde ortaya çıkabilecek kesirli sayılardan dolayı double nullable tanımladık:
    var number1 : Double? = null
    var number2 : Double? = null
    var result : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // onClick metodlarını yazalım:

    fun onClickAddition(view : View){
        number1 = plainTextFirstNumberID.text.toString().toDoubleOrNull()
        number2 = plainTextSecondNumberID.text.toString().toDoubleOrNull()

        if(number1 == null || number2 == null){
            textViewID.text = "Don't forget enter number..."
        }else{
            // Değerler double nullable olduğu için null hatası veriyor bu yüzden !! ekledik:
            var result = number1!! + number2!!
            textViewID.text = "Result: ${result}"
        }
    }

    fun onClickSubtraction(view : View){
        number1 = plainTextFirstNumberID.text.toString().toDoubleOrNull()
        number2 = plainTextSecondNumberID.text.toString().toDoubleOrNull()

        if(number1 == null || number2 == null){
            textViewID.text = "Don't forget enter number..."
        }else{
            var result = number1!! - number2!!
            textViewID.text = "Result: ${result}"
        }
    }

    fun onClickMultiplication(view : View){
        number1 = plainTextFirstNumberID.text.toString().toDoubleOrNull()
        number2 = plainTextSecondNumberID.text.toString().toDoubleOrNull()

        if(number1 == null || number2 == null){
            textViewID.text = "Don't forget enter number..."
        }else{
            var result = number1!! * number2!!
            textViewID.text = "Result: ${result}"
        }
    }

    fun onClickDivide(view : View){
        number1 = plainTextFirstNumberID.text.toString().toDoubleOrNull()
        number2 = plainTextSecondNumberID.text.toString().toDoubleOrNull()

        if(number1 == null || number2 == null){
            textViewID.text = "Don't forget enter number..."
        }else{
            var result = number1!! / number2!!
            textViewID.text = "Result: ${result}"
        }
    }
}