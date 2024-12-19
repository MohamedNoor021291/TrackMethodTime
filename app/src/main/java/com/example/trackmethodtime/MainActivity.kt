package com.example.trackmethodtime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mylibrary.AnnotationExecutor
import com.example.mylibrary.MeasureExecutionTime

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Automatically execute all annotated methods
        AnnotationExecutor.executeAnnotatedMethods(this);
        firstMethod()
        secondMethod()
        thirdMethod()
    }

    @MeasureExecutionTime
    fun firstMethod() {
        Thread.sleep(500)
        Log.d("MainActivity", "firstMethod completed.")
    }

    @MeasureExecutionTime
    fun secondMethod() {
        Thread.sleep(1000)
        Log.d("MainActivity", "firstMethod completed.")
    }

    @MeasureExecutionTime
    fun thirdMethod() {
        Thread.sleep(1500)
        Log.d("MainActivity", "firstMethod completed.")
    }

}