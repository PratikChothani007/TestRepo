package com.example.app.modules.searchresultlisting.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivitySearchResultListingBinding
import com.example.app.modules.searchresultlisting.`data`.viewmodel.SearchResultListingVM
import kotlin.String
import kotlin.Unit

public class SearchResultListingActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchResultListingBinding

    private val viewModel: SearchResultListingVM by viewModels<SearchResultListingVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_search_result_listing)
        binding.lifecycleOwner = this
        binding.searchResultListingVM = viewModel
    }

    public companion object {
        public const val TAG: String = "SEARCH_RESULT_LISTING_ACTIVITY"
    }
}
