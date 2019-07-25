package com.catprogrammer.radiosettings

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(Intent.ACTION_MAIN)
        intent.setClassName("com.android.settings", "com.android.settings.RadioInfo")
        startActivity(intent)

        this.finish()
    }
}
