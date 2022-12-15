package com.sumit.singleadapterrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sumit.singleadapterrv.listComponent.CommonAdapter
import com.sumit.singleadapterrv.listItem.SeparatorContentModel
import com.sumit.singleadapterrv.listItem.ViewOneContentModel
import com.sumit.singleadapterrv.listItem.ViewTwoContentModel

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val adapter = CommonAdapter()
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter


        val list = listOf(
            ViewOneContentModel("View 1"),
            SeparatorContentModel,
            ViewTwoContentModel("View 2"),
            SeparatorContentModel,
            ViewOneContentModel("View 3"),
            SeparatorContentModel,
            ViewOneContentModel("View 4"),
            SeparatorContentModel,
            ViewTwoContentModel("View 5"),
            SeparatorContentModel,
            ViewOneContentModel("View 6"),
            SeparatorContentModel,
            ViewOneContentModel("View 7"),
            SeparatorContentModel,
            ViewTwoContentModel("View 8"),
            SeparatorContentModel,
            ViewOneContentModel("View 9"),
            SeparatorContentModel,
            ViewOneContentModel("View 10"),
            SeparatorContentModel,
            ViewTwoContentModel("View 11"),
            SeparatorContentModel,
            ViewOneContentModel("View 12"),
        )

        adapter.submitList(list)
    }
}