package com.ransoft.androidactivities.ui.callbacks

import android.view.View
import androidx.lifecycle.ViewModel

class CallbackViewModel : ViewModel() {
    var callbackListener: CallbackListener? = null

    fun onExitClick(view: View) {
        callbackListener?.exit()
    }
}