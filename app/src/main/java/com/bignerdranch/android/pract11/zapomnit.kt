package com.bignerdranch.android.pract11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class zapomnit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zapomnit)
        val toast = Toast.makeText(applicationContext, "Запомнили)", Toast.LENGTH_SHORT)
        val b3 = findViewById<Button>(R.id.button2)
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val editText1 = findViewById<EditText>(R.id.editTextTextPersonName3)
        val editText2 = findViewById<EditText>(R.id.editTextNumber)
        val intent = Intent(this, spisok :: class.java)
        b3.setOnClickListener{
            val preferences = getSharedPreferences("str", MODE_PRIVATE)
            val preferences1 = getSharedPreferences("lol", MODE_PRIVATE)
            val preferences2 = getSharedPreferences("zxc", MODE_PRIVATE)
            val pref = getSharedPreferences("kniga", MODE_PRIVATE)
            val prefs = getSharedPreferences("nazv", MODE_PRIVATE)
            val prefes = getSharedPreferences("avtor", MODE_PRIVATE)
            val prefies = getSharedPreferences("kolvo", MODE_PRIVATE)
            val pre = getSharedPreferences("razd", MODE_PRIVATE)
            Log.d("Preferences", pre.getString("razd", "----------------------------------------------").toString())
            Log.d("Preferences", pref.getString("kniga", "Книга:").toString())
            Log.d("Preferences", prefs.getString("nazv", "Название:").toString())
            Log.d("Preferences", preferences.getString("str", editText.text.toString()).toString())
            Log.d("Preferences", prefes.getString("avtor", "Автор:").toString())
            Log.d("Preferences", preferences1.getString("lol", editText1.text.toString()).toString())
            Log.d("Preferences", prefies.getString("kolvo", "Количество страниц:").toString())
            Log.d("Preferences", preferences2.getString("zxc", editText2.text.toString()).toString())
            val edit = preferences.edit()
            val edit1 = preferences1.edit()
            val edit2 = preferences2.edit()
            edit.putString("str", editText.text.toString())
            intent.putExtra("nazvanie", editText.text.toString())
            edit1.putString("lol", editText1.text.toString())
            intent.putExtra("avtor", editText1.text.toString())
            edit2.putString("zxc", editText2.text.toString())
            intent.putExtra("kolichestvo", editText2.text.toString())
            edit.apply()
            edit1.apply()
            edit2.apply()
            toast.show()
        }
    }
}