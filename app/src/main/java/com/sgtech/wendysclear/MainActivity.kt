package com.sgtech.wendysclear

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to all views
        val et_user_name = findViewById<EditText>(R.id.et_user_name)
        val et_password = findViewById<EditText>(R.id.et_password)
        val btn_reset = findViewById<Button>(R.id.btn_reset)
        val btn_submit = findViewById<Button>(R.id.btn_submit)

        btn_reset.setOnClickListener {
            // clearing user_name and password edit text views on reset button click
            et_user_name.setText("")
            et_password.setText("")
        }

        // set on-click listener
        btn_submit.setOnClickListener {
            val username = et_user_name.text;
            val password = et_password.text;
            Toast.makeText(this@MainActivity, username, Toast.LENGTH_LONG).show()

            // your code to validate the user_name and password combination
            // and verify the same

        }
    }
}