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
        var wynik = 0
        var napis = wynik.toString()
        var LiczbaPierwsza = 0
        var LiczbaDruga = 0
        var dzialanie = 0
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.wynik).text = "0"

       findViewById<Button>(R.id.bt0).setOnClickListener {
          findViewById<TextView>(R.id.wynik).text =
              findViewById<TextView>(R.id.wynik).text.toString() + "0"
       }
        findViewById<Button>(R.id.bt1).setOnClickListener {
            findViewById<TextView>(R.id.wynik).text =
               findViewById<TextView>(R.id.wynik).text.toString() + "1"
        }
        findViewById<Button>(R.id.bt2).setOnClickListener {
            findViewById<TextView>(R.id.wynik).text =
               findViewById<TextView>(R.id.wynik).text.toString() + "2"
        }
        findViewById<Button>(R.id.bt3).setOnClickListener {
            findViewById<TextView>(R.id.wynik).text =
               findViewById<TextView>(R.id.wynik).text.toString() + "3"
        }
        findViewById<Button>(R.id.bt4).setOnClickListener {
            findViewById<TextView>(R.id.wynik).text =
               findViewById<TextView>(R.id.wynik).text.toString() + "4"
        }
        findViewById<Button>(R.id.bt5).setOnClickListener {
            findViewById<TextView>(R.id.wynik).text =
               findViewById<TextView>(R.id.wynik).text.toString() + "5"
        }
        findViewById<Button>(R.id.bt6).setOnClickListener {
            findViewById<TextView>(R.id.wynik).text =
                findViewById<TextView>(R.id.wynik).text.toString() + "6"

        }
        findViewById<Button>(R.id.bt7).setOnClickListener {
            findViewById<TextView>(R.id.wynik).text =
               findViewById<TextView>(R.id.wynik).text.toString() + "7"
        }
        findViewById<Button>(R.id.bt8).setOnClickListener {
            findViewById<TextView>(R.id.wynik).text =
                findViewById<TextView>(R.id.wynik).text.toString() + "8"
        }
        findViewById<Button>(R.id.bt9).setOnClickListener {
            findViewById<TextView>(R.id.wynik).text =
                findViewById<TextView>(R.id.wynik).text.toString() + "9"
        }

        findViewById<Button>(R.id.dodac).setOnClickListener {
           dzialanie = 1
            LiczbaPierwsza = findViewById<TextView>(R.id.wynik).text.toString().toInt()
            findViewById<TextView>(R.id.wynik).text = ""

        }
            findViewById<Button>(R.id.odjac).setOnClickListener {
                dzialanie = 2
                 LiczbaPierwsza = findViewById<TextView>(R.id.wynik).text.toString().toInt()
                 findViewById<TextView>(R.id.wynik).text = ""

        }
        findViewById<Button>(R.id.iloczyn).setOnClickListener {
            dzialanie = 3
            LiczbaPierwsza = findViewById<TextView>(R.id.wynik).text.toString().toInt()
            findViewById<TextView>(R.id.wynik).text = ""
        }
        findViewById<Button>(R.id.iloraz).setOnClickListener {
            dzialanie = 4
            LiczbaPierwsza = findViewById<TextView>(R.id.wynik).text.toString().toInt()
            findViewById<TextView>(R.id.wynik).text = ""
        }
        findViewById<Button>(R.id.rowna).setOnClickListener {
            LiczbaDruga = findViewById<TextView>(R.id.wynik).text.toString().toInt()
            wynik = LiczbaPierwsza + LiczbaDruga
            findViewById<TextView>(R.id.wynik).text = wynik.toString()
            if (dzialanie == 1) {
                wynik = LiczbaPierwsza + LiczbaDruga
            } else if (dzialanie == 2) {
                wynik = LiczbaPierwsza - LiczbaDruga
            } else if (dzialanie == 3) {
                wynik = LiczbaPierwsza * LiczbaDruga
            } else if (dzialanie == 4) {

                if (LiczbaDruga == 0) {
                    findViewById<TextView>(R.id.wynik).text = "Nie dziel przez 0"
                }
                else  {
                    wynik = LiczbaPierwsza / LiczbaDruga
                }
            }
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