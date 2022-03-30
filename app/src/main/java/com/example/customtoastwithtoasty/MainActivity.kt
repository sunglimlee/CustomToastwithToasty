package com.example.customtoastwithtoasty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import es.dmoral.toasty.Toasty

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buttonClick(v : View) {
        when (v.id) {
            R.id.button_error -> { Toasty.error(this, "This is error Toast", Toast.LENGTH_SHORT).show() }
            R.id.button_info -> { Toasty.info(this, "This is info Toasty", Toast.LENGTH_SHORT).show() }
            R.id.button_normal_with_icon -> {Toasty.normal(this, "this is Normal Toast with Icon", ContextCompat.getDrawable(this, R.drawable.ic_airplane)).show() }
            R.id.button_success -> { Toasty.success(this, "this is success Toasty").show() }
            R.id.button_warning -> { Toasty.warning(this, "this is warning Toasty").show() }
        }
    }
}