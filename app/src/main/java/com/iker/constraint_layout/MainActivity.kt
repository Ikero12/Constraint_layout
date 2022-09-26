package com.iker.constraint_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionManager
import androidx.constraintlayout.widget.ConstraintSet

class MainActivity : AppCompatActivity() {
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.keyframe1)
        constraintLayout = findViewById(R.id.constraint_layout) // member variable
    }

    fun animateToKeyframeTwo() {
        val constraintSet = ConstraintSet()
        constraintSet.load(this, R.layout.keyframe2)
        TransitionManager.beginDelayedTransition()
        constraintSet.applyTo(constraintLayout)
    }

}