package com.example.signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.signup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener(::onButtonClick)
        binding.button2.setOnClickListener(::setVisible)
        binding.button3.setOnClickListener(::setHide)
    }


    fun onButtonClick(view: View){
        var isTrue = true
        if (binding.myEditText.text.toString().isBlank()) {
            binding.myEditText.error
            isTrue = false
        }

        if (binding.myEditText2.text.toString().isBlank()) {
            binding.myEditText2.error
            isTrue = false
        }

        if (binding.myEditText3.text.toString().isBlank()) {
            binding.myEditText3.error
            isTrue = false
        }

        if (binding.myEditText5.text.toString().isBlank()) {
            binding.myEditText5.error
            isTrue = false
        }

        if (binding.myEditText4.text.toString().isBlank()) {
            binding.myEditText4.error
            isTrue = false
        }

        if (binding.myEditText4.text.toString() != binding.myEditText5.text.toString()) {
            binding.myEditText4.error = "Not valid"
            isTrue = false
        }

        if (binding.radioButton2.text.toString().isBlank() && binding.radioButton3.text.toString().isBlank()) {
            binding.textView6.error
            isTrue = false
        }
        if (isTrue){
            binding.textView1.alpha.plus(100)
            binding.textView1.text = binding.myEditText.text.toString()
            binding.textView2.text = binding.myEditText2.text.toString()
            binding.textView3.text = binding.myEditText3.text.toString()
            binding.textView4.text = binding.myEditText5.text.toString()
            if (binding.radioButton2.text.isBlank())
                binding.textView5.text = binding.radioButton3.text.toString()
            else
                binding.textView5.text = binding.radioButton3.text.toString()
        }
    }

    fun setVisible(view: View){
        binding.textView1.alpha.plus(100)
        binding.textView2.alpha.plus(100)
        binding.textView3.alpha.plus(100)
        binding.textView4.alpha.plus(100)
        binding.textView5.alpha.plus(100)
        binding.button3.alpha.plus(100)
    }

    fun setHide(view: View){
        binding.textView1.alpha.minus(100)
        binding.textView2.alpha.minus(100)
        binding.textView3.alpha.minus(100)
        binding.textView4.alpha.minus(100)
        binding.textView5.alpha.minus(100)
        binding.button3.alpha.minus(100)
    }
}