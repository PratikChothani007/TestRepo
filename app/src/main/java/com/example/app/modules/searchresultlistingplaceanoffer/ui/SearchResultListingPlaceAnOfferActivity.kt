package com.example.app.modules.searchresultlistingplaceanoffer.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivitySearchResultListingPlaceAnOfferBinding
import com.example.app.modules.searchresultlistingplaceanoffer.`data`.viewmodel.SearchResultListingPlaceAnOfferVM
import kotlin.String
import kotlin.Unit

public class SearchResultListingPlaceAnOfferActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchResultListingPlaceAnOfferBinding

    private val viewModel: SearchResultListingPlaceAnOfferVM by
            viewModels<SearchResultListingPlaceAnOfferVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding =
                DataBindingUtil.setContentView(this,R.layout.activity_search_result_listing_place_an_offer)
        binding.lifecycleOwner = this
        binding.searchResultListingPlaceAnOfferVM = viewModel
    }

    public companion object {
        public const val TAG: String = "SEARCH_RESULT_LISTING_PLACE_AN_OFFER_ACTIVITY"
    }
}
