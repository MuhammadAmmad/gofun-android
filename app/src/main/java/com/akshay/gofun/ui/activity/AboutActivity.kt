package com.akshay.gofun.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.akshay.gofun.BuildConfig
import com.akshay.gofun.R
import com.akshay.gofun.utils.consume
import com.akshay.gofun.utils.openUrl
import kotlinx.android.synthetic.main.activity_about.*
import kotlinx.android.synthetic.main.card_about_development.*
import kotlinx.android.synthetic.main.card_about_general.*
import kotlinx.android.synthetic.main.card_about_team.*

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setSupportActionBar(toolbar)
        about_version.text = BuildConfig.VERSION_NAME

        aboutTeamAkshay.setOnClickListener { openUrl("https://github.com/akshaychordiya/") }
        aboutTeamAditya.setOnClickListener { openUrl("http://www.adityakamble49.com/") }

        about_rate.setOnClickListener { openUrl("http://play.google.com/store/apps/details?id=" + packageName) }
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        android.R.id.home -> consume { finish() }
        else -> super.onOptionsItemSelected(item)
    }
}
