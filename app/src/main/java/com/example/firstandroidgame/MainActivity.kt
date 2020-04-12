package com.example.firstandroidgame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var count = 0;
    var rand = Random.nextInt(25)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nCount.text = rand.toString()
    }
    fun getCountPush(view: View){
        count++
        countBox.text = count.toString()
    }

    fun getAccess(view: View) {
        if (count === rand) {
            answer.text = "Верно"
        } else {
            answer.text = "Не верно"
        }
        count = 0;
        countBox.text = count.toString()
    }
}
