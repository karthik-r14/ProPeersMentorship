package com.mobileassistant.propeersmentorship.activity_fragment_lifecycle

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mobileassistant.propeersmentorship.R

private const val HOST_ACTIVITY_TAG = "Demo-HostActivity"

class HostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_host)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.d(HOST_ACTIVITY_TAG, getString(R.string.host_activity_on_create_msg))
        Toast.makeText(
            this, getString(R.string.host_activity_on_create_msg), Toast.LENGTH_SHORT
        ).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d(HOST_ACTIVITY_TAG, getString(R.string.host_activity_on_start_msg))
        Toast.makeText(
            this, getString(R.string.host_activity_on_start_msg), Toast.LENGTH_SHORT
        ).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d(HOST_ACTIVITY_TAG, getString(R.string.host_activity_on_resume_msg))

        Toast.makeText(
            this, getString(R.string.host_activity_on_resume_msg), Toast.LENGTH_SHORT
        ).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d(HOST_ACTIVITY_TAG, getString(R.string.host_activity_on_pause_msg))

        Toast.makeText(
            this, getString(R.string.host_activity_on_pause_msg), Toast.LENGTH_SHORT
        ).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d(HOST_ACTIVITY_TAG, getString(R.string.host_activity_on_stop_msg))
        Toast.makeText(
            this, getString(R.string.host_activity_on_stop_msg), Toast.LENGTH_SHORT
        ).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(HOST_ACTIVITY_TAG, getString(R.string.host_activity_on_restart_msg))
        Toast.makeText(
            this, getString(R.string.host_activity_on_restart_msg), Toast.LENGTH_SHORT
        ).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(HOST_ACTIVITY_TAG, getString(R.string.host_activity_on_destroy_msg))
        Toast.makeText(
            this, getString(R.string.host_activity_on_destroy_msg), Toast.LENGTH_SHORT
        ).show()
    }

}