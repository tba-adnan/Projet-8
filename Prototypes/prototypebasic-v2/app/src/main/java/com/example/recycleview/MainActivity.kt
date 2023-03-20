package com.example.recycleview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.widget.Button
import android.widget.TextView
import com.example.recycleview.adapter.ItemAdapter
import com.example.recycleview.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset.toTypedArray())
        recyclerView.setHasFixedSize(true)
        val addAffirmationButton = findViewById<Button>(R.id.MainButton)

        addAffirmationButton.setOnClickListener {
            val affirmations = resources.getStringArray(R.array.demo_task)
            val newAffirmation = "demo affirmation"
            val newAffirmationsList = affirmations.toMutableList()
            newAffirmationsList.add(newAffirmation)
            val newAffirmationsArray = newAffirmationsList.toTypedArray()
            resources.getStringArray(R.array.demo_task).copyInto(newAffirmationsArray)





        }


    }
}
