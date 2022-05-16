package com.umvini.studybasickotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.umvini.studybasickotlin.phase.adapter.AdapterItemListActivity
import com.umvini.studybasickotlin.phase.adapter.ItemListActivity
import com.umvini.studybasickotlin.phase.onecodelab.OneCodeLabActivity
import com.umvini.studybasickotlin.phase.twocodelab.TwoCodeLabActivity


class MainActivity : AppCompatActivity(), AdapterItemListActivity.OnClick {

    private lateinit var itemListActivities: ArrayList<ItemListActivity>
    private lateinit var rvListActivities: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        initListActivities()
        initRecyclerView()
    }

    private fun initViews() {
        rvListActivities = findViewById(R.id.rv_list_activities)
    }

    private fun initListActivities() {
        itemListActivities = ArrayList()
        itemListActivities.add(ItemListActivity("One Code Lab", OneCodeLabActivity::class.java))
        itemListActivities.add(ItemListActivity("Two Code Lab", TwoCodeLabActivity::class.java))
    }

    private fun initRecyclerView() {
        rvListActivities.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = AdapterItemListActivity(itemListActivities, this@MainActivity)
        }
    }

    override fun onItemClick(activity: Class<*>?) {
        startActivity(Intent(this@MainActivity, activity))
    }
}