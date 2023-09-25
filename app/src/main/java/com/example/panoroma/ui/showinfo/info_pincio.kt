package com.example.panoroma.ui.showinfo

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.panoroma.R

class info_pincio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_pincio)
        setTitle("Terrazza del pincio")

        // calling the action bar
        var actionBar = getSupportActionBar()

        // showing the back button in action bar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
        }
    }

    // this event will enable the back
    // function to the button on press
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}