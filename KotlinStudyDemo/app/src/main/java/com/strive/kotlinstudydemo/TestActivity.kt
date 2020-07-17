package com.strive.kotlinstudydemo

import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

/**
 * Author:    Xiao_Tian
 * Version    V1.0
 * Date:      2020/7/15 2:33 PM
 * Description:
 * Why & What is modified:
 */
 class TestActivity : AppCompatActivity() {
  private lateinit var view: View


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view = findViewById(R.id.tv_test)
        view.setBackgroundColor(Color.RED)
        test(view)
    }

    fun test(view: View?){
        println(view?.id)

    }
}