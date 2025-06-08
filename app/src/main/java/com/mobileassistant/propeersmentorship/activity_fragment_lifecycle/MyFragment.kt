package com.mobileassistant.propeersmentorship.activity_fragment_lifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.mobileassistant.propeersmentorship.R

private const val MY_FRAGMENT_TAG = "Demo-MyFragment"

class MyFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(MY_FRAGMENT_TAG, getString(R.string.my_fragment_on_create_msg))
        Toast.makeText(activity, getString(R.string.my_fragment_on_create_msg), Toast.LENGTH_SHORT)
            .show()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d(MY_FRAGMENT_TAG, getString(R.string.my_fragment_on_create_view_msg))
        Toast.makeText(
            activity, getString(R.string.my_fragment_on_create_view_msg), Toast.LENGTH_SHORT
        ).show()
        return inflater.inflate(R.layout.fragment_my, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(MY_FRAGMENT_TAG, getString(R.string.my_fragment_on_attach_msg))
        Toast.makeText(
            activity, getString(R.string.my_fragment_on_attach_msg), Toast.LENGTH_SHORT
        ).show()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(MY_FRAGMENT_TAG, getString(R.string.my_fragment_on_activity_created_msg))
        Toast.makeText(
            activity, getString(R.string.my_fragment_on_activity_created_msg), Toast.LENGTH_SHORT
        ).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d(MY_FRAGMENT_TAG, getString(R.string.my_fragment_on_start_msg))
        Toast.makeText(
            activity, getString(R.string.my_fragment_on_start_msg), Toast.LENGTH_SHORT
        ).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d(MY_FRAGMENT_TAG, getString(R.string.my_fragment_on_resume_msg))
        Toast.makeText(
            activity, getString(R.string.my_fragment_on_resume_msg), Toast.LENGTH_SHORT
        )
    }

    override fun onPause() {
        super.onPause()
        Log.d(MY_FRAGMENT_TAG, getString(R.string.my_fragment_on_pause_msg))
        Toast.makeText(
            activity, getString(R.string.my_fragment_on_pause_msg), Toast.LENGTH_SHORT
        ).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d(MY_FRAGMENT_TAG, getString(R.string.my_fragment_on_stop_msg))
        Toast.makeText(
            activity, getString(R.string.my_fragment_on_stop_msg), Toast.LENGTH_SHORT
        ).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(MY_FRAGMENT_TAG, getString(R.string.my_fragment_on_destroy_view_msg))
        Toast.makeText(
            activity, getString(R.string.my_fragment_on_destroy_view_msg), Toast.LENGTH_SHORT
        ).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MY_FRAGMENT_TAG, getString(R.string.my_fragment_on_destroy_msg))
        Toast.makeText(
            activity, getString(R.string.my_fragment_on_destroy_msg), Toast.LENGTH_SHORT
        ).show()
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(MY_FRAGMENT_TAG, getString(R.string.my_fragment_on_detach_msg))
        Toast.makeText(
            activity, getString(R.string.my_fragment_on_detach_msg), Toast.LENGTH_SHORT
        ).show()
    }
}