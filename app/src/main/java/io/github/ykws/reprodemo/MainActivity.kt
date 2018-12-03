package io.github.ykws.reprodemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.repro.android.Repro

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        Repro.track("MainActivity")
    }
}
