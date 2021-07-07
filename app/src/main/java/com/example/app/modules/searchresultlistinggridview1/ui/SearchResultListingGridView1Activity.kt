package com.example.app.modules.searchresultlistinggridview1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivitySearchResultListingGridView1Binding
import com.example.app.modules.searchresultlistinggridview1.`data`.viewmodel.SearchResultListingGridView1VM
import kotlin.String
import kotlin.Unit

public class SearchResultListingGridView1Activity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchResultListingGridView1Binding

    private val viewModel: SearchResultListingGridView1VM by
            viewModels<SearchResultListingGridView1VM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding =
                DataBindingUtil.setContentView(this,R.layout.activity_search_result_listing_grid_view_1)
        binding.lifecycleOwner = this
        binding.searchResultListingGridView1VM = viewModel
    }

    public companion object {
        public const val TAG: String = "SEARCH_RESULT_LISTING_GRID_VIEW1ACTIVITY"
    }
}
