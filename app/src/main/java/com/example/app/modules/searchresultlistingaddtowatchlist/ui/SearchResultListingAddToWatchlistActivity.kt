package com.example.app.modules.searchresultlistingaddtowatchlist.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivitySearchResultListingAddToWatchlistBinding
import com.example.app.modules.searchresultlistingaddtowatchlist.`data`.viewmodel.SearchResultListingAddToWatchlistVM
import kotlin.String
import kotlin.Unit

public class SearchResultListingAddToWatchlistActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchResultListingAddToWatchlistBinding

    private val viewModel: SearchResultListingAddToWatchlistVM by
            viewModels<SearchResultListingAddToWatchlistVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding =
                DataBindingUtil.setContentView(this,R.layout.activity_search_result_listing_add_to_watchlist)
        binding.lifecycleOwner = this
        binding.searchResultListingAddToWatchlistVM = viewModel
    }

    public companion object {
        public const val TAG: String = "SEARCH_RESULT_LISTING_ADD_TO_WATCHLIST_ACTIVITY"
    }
}
