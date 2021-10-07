package com.example.a071021

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var wynik = 0;
        var napis = wynik.toString()



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       findViewById<Button>(R.id.bt0).setOnClickListener {
          findViewById<TextView>(R.id.wynik).text = "0"
       }
        findViewById<Button>(R.id.bt1).setOnClickListener {
            findViewById<TextView>(R.id.wynik).text = "1"
        }
        findViewById<Button>(R.id.bt2).setOnClickListener {
            findViewById<TextView>(R.id.wynik).text = "2"
        }
        findViewById<Button>(R.id.bt3).setOnClickListener {
            findViewById<TextView>(R.id.wynik).text = "3"
        }
        findViewById<Button>(R.id.bt4).setOnClickListener {
            findViewById<TextView>(R.id.wynik).text = "4"
        }
        findViewById<Button>(R.id.bt5).setOnClickListener {
            findViewById<TextView>(R.id.wynik).text = "5"
        }
        findViewById<Button>(R.id.bt6).setOnClickListener {
            findViewById<TextView>(R.id.wynik).text = "6"
        }
        findViewById<Button>(R.id.bt7).setOnClickListener {
            findViewById<TextView>(R.id.wynik).text = "7"
        }
        findViewById<Button>(R.id.bt8).setOnClickListener {
            findViewById<TextView>(R.id.wynik).text = "8"
        }
        findViewById<Button>(R.id.bt9).setOnClickListener {
            findViewById<TextView>(R.id.wynik).text = "9"
        }
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}