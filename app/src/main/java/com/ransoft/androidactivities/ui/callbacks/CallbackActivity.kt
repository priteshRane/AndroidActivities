package com.ransoft.androidactivities.ui.callbacks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.ransoft.androidactivities.R
import com.ransoft.androidactivities.databinding.ActivityCallbackBinding
import com.ransoft.androidactivities.util.toast

class CallbackActivity : AppCompatActivity(), CallbackListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityCallbackBinding = DataBindingUtil.setContentView(this, R.layout.activity_callback)
        val viewModel = ViewModelProvider(this).get(CallbackViewModel::class.java)

        binding.callbackviewmodel = viewModel

        viewModel.callbackListener = this

        toast("onCreate() state")
    }

    override fun exit() {
        toast("Exit from activity")
        finish()
    }
}
