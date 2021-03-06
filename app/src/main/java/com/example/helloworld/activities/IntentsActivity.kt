package com.example.helloworld.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.R
import kotlinx.android.synthetic.main.activity_intents.*

class IntentsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intents)

        btnIntentExtras.setOnClickListener { intentExtras() }
        btnIntentFlags.setOnClickListener { intentFlags() }
        btnIntentObjects.setOnClickListener { intentObjects() }
    }

    private fun intentExtras() {
        val intent = Intent(this, IntentExtrasActivity::class.java)
        intent.putExtra("name", "José")
        intent.putExtra("lastName", "Tejada")
        intent.putExtra("age", 36)
        intent.putExtra("developer", false)
        startActivity(intent)
    }

    private fun intentFlags() {
        val intent = Intent(this, IntentExtrasActivity::class.java)
        startActivity(intent)
    }

    private fun intentObjects() {
        val intent = Intent(this, IntentExtrasActivity::class.java)
        startActivity(intent)
    }
}
