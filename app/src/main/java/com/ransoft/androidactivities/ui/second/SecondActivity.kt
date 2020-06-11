package com.ransoft.androidactivities.ui.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.ransoft.androidactivities.R
import com.ransoft.androidactivities.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivitySecondBinding = DataBindingUtil.setContentView(this, R.layout.activity_second)
        val viewModel = ViewModelProvider(this).get(SecondViewModel::class.java)

        binding.viewmodel = viewModel

        viewModel.message = "Default message"
    }
}
