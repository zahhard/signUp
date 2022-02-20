package com.example.signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isEmpty
import com.example.signup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setHide(binding.root)

        binding.button.setOnClickListener(::onButtonClick)
        binding.button2.setOnClickListener(::setVisible)
        binding.button3.setOnClickListener(::setHide)
    }


    fun onButtonClick(view: View){
        var isTrue = true

        if (binding.myEditText1.text.toString().isBlank()) {
            binding.myEditText1.error = "Empty!"
            isTrue = false
        }

        if (binding.myEditText2.text.toString().isBlank()) {
            binding.myEditText2.error = "Empty!"
            isTrue = false
        }

        if (binding.myEditText3.text.toString().isBlank()) {
            binding.myEditText3.error = "Empty!"
            isTrue = false
        }

        if (binding.myEditText5.text.toString().isBlank()) {
            binding.myEditText5.error = "Empty!"
            isTrue = false
        }

        if (binding.myEditText4.text.toString().isBlank()) {
            binding.myEditText4.error = "Empty!"
            isTrue = false
        }

        if (binding.myEditText4.text.toString() != binding.myEditText5.text.toString()) {
            binding.myEditText4.error = "Not valid"
            isTrue = false
        }



        if (isTrue){
            Toast.makeText(this, "Register",Toast.LENGTH_SHORT).show()

            binding.textView1.text = binding.myEditText1.text.toString()
            binding.textView2.text = binding.myEditText2.text.toString()
            binding.textView3.text = binding.myEditText3.text.toString()
            binding.textView4.text = binding.myEditText5.text.toString()
            binding.myEditText1.setText("")
            binding.myEditText2.setText("")
            binding.myEditText3.setText("")
            binding.myEditText4.setText("")
            binding.myEditText5.setText("")

            if (binding.radioButton2.text.isBlank())
                binding.textView5.text = binding.radioButton3.text.toString()
            else
                binding.textView5.text = binding.radioButton2.text.toString()
        }
    }

    fun setVisible(view: View){
        Toast.makeText(this, "Show Info",Toast.LENGTH_SHORT).show()
        binding.textView1.visibility = View.VISIBLE
        binding.textView2.visibility = View.VISIBLE
        binding.textView3.visibility = View.VISIBLE
        binding.textView4.visibility = View.VISIBLE
        binding.textView5.visibility = View.VISIBLE
        binding.button3.visibility = View.VISIBLE
    }

    fun setHide(view: View){
        binding.textView1.visibility = View.INVISIBLE
        binding.textView2.visibility = View.INVISIBLE
        binding.textView3.visibility = View.INVISIBLE
        binding.textView4.visibility = View.INVISIBLE
        binding.textView5.visibility = View.INVISIBLE
        binding.button3.visibility = View.INVISIBLE

    }
}