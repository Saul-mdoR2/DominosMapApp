package com.r2devpros.dominosmap.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.r2devpros.dominosmap.R
import com.r2devpros.dominosmap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var layout: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layout = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }
}