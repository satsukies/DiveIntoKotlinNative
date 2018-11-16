package net.ddns.satsukies.diveintokotlinnative

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import net.ddns.satsukies.diveintokotlinnative.common.createApplicationScreenMessage

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text_view)
        textView.text = createApplicationScreenMessage()
        textView.textSize = 24f
    }
}
