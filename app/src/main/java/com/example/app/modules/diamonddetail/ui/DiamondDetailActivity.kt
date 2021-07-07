package com.example.app.modules.diamonddetail.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivityDiamondDetailBinding
import com.example.app.modules.diamonddetail.`data`.model.DiamondDetailRowModel
import com.example.app.modules.diamonddetail.`data`.viewmodel.DiamondDetailVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class DiamondDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDiamondDetailBinding

    private val viewModel: DiamondDetailVM by viewModels<DiamondDetailVM>()

    public fun onClickRecyclerView(
        view: View,
        position: Int,
        item: DiamondDetailRowModel
    ): Unit {
    }

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_diamond_detail)
        val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
        binding.recyclerView.adapter = recyclerViewAdapter
        recyclerViewAdapter.setOnItemClickListener(
        object : RecyclerViewAdapter.OnItemClickListener {
            override fun onItemClick(view:View, position:Int, item : DiamondDetailRowModel) {
                onClickRecyclerView(view, position, item)
            }
        }
        )
        binding.lifecycleOwner = this
        binding.diamondDetailVM = viewModel
    }

    public companion object {
        public const val TAG: String = "DIAMOND_DETAIL_ACTIVITY"
    }
}
