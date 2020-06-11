package com.ransoft.androidactivities.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.ransoft.androidactivities.R
import com.ransoft.androidactivities.databinding.ActivityMainBinding
import com.ransoft.androidactivities.ui.instancestate.InstanceStateActivity
import com.ransoft.androidactivities.ui.second.SecondActivity
import com.ransoft.androidactivities.util.toast

class MainActivity : AppCompatActivity(), MainListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.viewmodel = viewModel

        viewModel.mainListener = this
    }

    override fun goToSecondActivity() {
        toast("Go to second activity")
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    override fun goToInstanceActivity() {
        toast("Go to Instance activity")
        val intent = Intent(this, InstanceStateActivity::class.java)
        startActivity(intent)
    }


}
