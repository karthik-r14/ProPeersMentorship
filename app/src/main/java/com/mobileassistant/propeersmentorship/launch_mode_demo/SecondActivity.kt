package com.mobileassistant.propeersmentorship.launch_mode_demo

import android.app.ComponentCaller
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mobileassistant.propeersmentorship.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        findViewById<Button>(R.id.launch_second_activity).setOnClickListener {
            Intent(applicationContext, SecondActivity::class.java).also {
                startActivity(it)
            }
        }

        Toast.makeText(this,
            getString(R.string.second_activity_on_create_msg), Toast.LENGTH_SHORT).show()

    }

    override fun onNewIntent(intent: Intent, caller: ComponentCaller) {
        super.onNewIntent(intent, caller)
        Toast.makeText(this,
            getString(R.string.second_activity_on_newintent_msg), Toast.LENGTH_SHORT).show()
    }
}