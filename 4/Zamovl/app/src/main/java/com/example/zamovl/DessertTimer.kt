package com.example.zamovl

import android.os.Handler
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import timber.log.Timber

class DessertTimer(lifecycle: Lifecycle) : LifecycleObserver {

    var secondsCount = 0

    @Suppress("DEPRECATION")
    private var handler = Handler()
    private lateinit var runnable: Runnable


    init {
        lifecycle.addObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun startTimer() {
        runnable = Runnable {
            secondsCount++
            Timber.i("Timer is at : $secondsCount")
            handler.postDelayed(runnable, 1000)
        }
        handler.postDelayed(runnable, 1000)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stopTimer() {
        Timber.i("Total usage time : $secondsCount")
        handler.removeCallbacks(runnable)
    }
}
