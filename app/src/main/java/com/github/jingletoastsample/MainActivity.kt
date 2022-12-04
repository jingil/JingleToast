package com.github.jingletoastsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.github.jingletoast.JingleToast
import com.github.jingletoast.JingleToast.makeToast

class MainActivity : AppCompatActivity() {
    var success: Button? = null
    var failure: Button? = null
    var info: Button? = null
    var warning: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        success = findViewById<View>(R.id.success) as Button
        failure = findViewById<View>(R.id.failure) as Button
        info = findViewById<View>(R.id.info) as Button
        warning = findViewById<View>(R.id.warning) as Button
        success!!.setOnClickListener {
            makeToast(
                this@MainActivity,
                "This is a sample success toast!",
                JingleToast.LENGTH_LONG,
                JingleToast.SUCCESS,
                JingleToast.TOP
            ).show()
        }
        failure!!.setOnClickListener {
            makeToast(
                this@MainActivity,
                "This is a sample failure toast!",
                JingleToast.LENGTH_LONG,
                JingleToast.FAILURE,
                JingleToast.BOTTOM
            ).show()
        }
        warning!!.setOnClickListener {
            makeToast(
                this@MainActivity,
                "This is a sample warning toast!",
                JingleToast.LENGTH_LONG,
                JingleToast.WARNING,
                JingleToast.CENTER
            ).show()
        }
        info!!.setOnClickListener {
            makeToast(
                this@MainActivity,
                "This is a sample info toast!",
                JingleToast.LENGTH_LONG,
                JingleToast.INFO,
                JingleToast.TOP
            ).show()
        }
    }
}