package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var btnLogIn: MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    fun initViews(){
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        btnLogIn = findViewById(R.id.btnLogIn)

        startSplash()
    }

    private fun startSplash(){
        btnLogIn.setOnClickListener {
            if (email.text.isNotEmpty() && password.text.isNotEmpty()){
                val intent = Intent(this@MainActivity, SplashScreenActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Please enter email address and password!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}