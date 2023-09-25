package com.example.panoroma.ui.showinfo

import android.R.attr.button
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.panoroma.R
import com.example.panoroma.ui.map.map_colosseo


class info_col : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_col)
        setTitle("Colosseo")

        // calling the action bar
        var actionBar = getSupportActionBar()

        // showing the back button in action bar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
        }

        val button = findViewById<Button>(R.id.button_map_col) as ImageButton
        button.setOnClickListener{
            val intent = Intent(this, map_colosseo::class.java)
            startActivity(intent)
        }
    }

    // this event will enable the back
    // function to the button on press
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}