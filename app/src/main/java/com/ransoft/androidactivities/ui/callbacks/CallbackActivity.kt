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

    override fun onStart() {
        super.onStart()
        toast("onStart() state")
    }

    override fun onResume() {
        super.onResume()
        toast("onResume() state")
    }

    override fun onPause() {
        super.onPause()
        toast("onPause() state")
    }

    override fun onStop() {
        super.onStop()
        toast("onStop() state")
    }

    override fun onRestart() {
        super.onRestart()
        toast("onRestart() state")
    }

    override fun onDestroy() {
        super.onDestroy()
        toast("onDestroy() state")
    }

    override fun exit() {
        toast("Exit from activity")
        finish()
    }
}
