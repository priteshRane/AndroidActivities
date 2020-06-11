package com.ransoft.androidactivities.ui.main

import android.view.View
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var mainListener: MainListener? = null

    fun onSecondActivityClick(view: View) {
        mainListener?.goToSecondActivity()
    }

    fun onInstanceActivityClick(view: View) {
        mainListener?.goToInstanceActivity()
    }
}