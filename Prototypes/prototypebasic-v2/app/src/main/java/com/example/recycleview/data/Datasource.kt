package com.example.recycleview.data
import com.example.recycleview.R
import com.example.recycleview.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.array.demo_task)

        )
    }
}