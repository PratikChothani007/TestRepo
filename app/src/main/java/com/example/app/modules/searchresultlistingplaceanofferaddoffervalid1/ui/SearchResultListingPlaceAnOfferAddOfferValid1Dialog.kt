package com.example.app.modules.searchresultlistingplaceanofferaddoffervalid1.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import com.example.app.databinding.DialogSearchResultListingPlaceAnOfferAddOfferValid1Binding
import com.example.app.modules.searchresultlistingplaceanofferaddoffervalid1.`data`.viewmodel.SearchResultListingPlaceAnOfferAddOfferValid1VM
import kotlin.String

public class SearchResultListingPlaceAnOfferAddOfferValid1Dialog(
    private val mContext: Context
) : DialogFragment() {
    private lateinit var binding: DialogSearchResultListingPlaceAnOfferAddOfferValid1Binding

    private val viewModel: SearchResultListingPlaceAnOfferAddOfferValid1VM by
            viewModels<SearchResultListingPlaceAnOfferAddOfferValid1VM>()

    public override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DialogSearchResultListingPlaceAnOfferAddOfferValid1Binding.inflate(inflater)
        binding.lifecycleOwner = requireActivity()
        binding.searchResultListingPlaceAnOfferAddOfferValid1VM = viewModel
        return binding.root
    }

    public companion object {
        public const val TAG: String = "SEARCH_RESULT_LISTING_PLACE_AN_OFFER_ADD_OFFER_VALID1DIALOG"
    }
}
