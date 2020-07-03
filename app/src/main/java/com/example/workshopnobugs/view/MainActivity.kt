package com.example.workshopnobugs.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.workshopnobugs.R

class MainActivity : AppCompatActivity() {

    /*
    *
    * Não atuaremos aqui. Sem propósito.
    *
    * */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}