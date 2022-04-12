package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        val userName=intent.getStringExtra(setData.name)
        val score=intent.getStringExtra(setData.score)
        val totalQuestion=intent.getStringExtra("total size")

        findViewById<TextView>(R.id.congo).text="Congratulations ${userName} !!"
        findViewById<TextView>(R.id.Score).text="${score} / ${totalQuestion}"
        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
}