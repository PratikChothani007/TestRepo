package com.example.app.modules.searchresultlistingplaceanofferaddoffervalid.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import com.example.app.databinding.DialogSearchResultListingPlaceAnOfferAddOfferValidBinding
import com.example.app.modules.searchresultlistingplaceanofferaddoffervalid.`data`.viewmodel.SearchResultListingPlaceAnOfferAddOfferValidVM
import kotlin.String

public class SearchResultListingPlaceAnOfferAddOfferValidDialog(
    private val mContext: Context
) : DialogFragment() {
    private lateinit var binding: DialogSearchResultListingPlaceAnOfferAddOfferValidBinding

    private val viewModel: SearchResultListingPlaceAnOfferAddOfferValidVM by
            viewModels<SearchResultListingPlaceAnOfferAddOfferValidVM>()

    public override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DialogSearchResultListingPlaceAnOfferAddOfferValidBinding.inflate(inflater)
        binding.lifecycleOwner = requireActivity()
        binding.searchResultListingPlaceAnOfferAddOfferValidVM = viewModel
        return binding.root
    }

    public companion object {
        public const val TAG: String = "SEARCH_RESULT_LISTING_PLACE_AN_OFFER_ADD_OFFER_VALID_DIALOG"
    }
}
