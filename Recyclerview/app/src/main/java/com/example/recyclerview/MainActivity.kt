package com.example.recyclerview

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myListData = listOf(
            MyListData("Email", android.R.drawable.ic_dialog_email),
            MyListData("Info", android.R.drawable.ic_dialog_info),
            MyListData("Dialer", android.R.drawable.ic_dialog_dialer),
            MyListData("Alert", android.R.drawable.ic_dialog_alert),
            MyListData("Map", android.R.drawable.ic_dialog_map),
            MyListData("Email", android.R.drawable.ic_dialog_email),
            MyListData("Info", android.R.drawable.ic_dialog_info),
            MyListData("Dialer", android.R.drawable.ic_dialog_dialer),
            MyListData("Alert", android.R.drawable.ic_dialog_alert),
            MyListData("Map", android.R.drawable.ic_dialog_map)
        )
        val recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        val adapter = MyListAdapter(myListData)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}