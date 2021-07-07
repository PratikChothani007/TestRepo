package com.example.app.modules.searchresultlistingplaceanofferpopup.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import com.example.app.databinding.DialogSearchResultListingPlaceAnOfferPopupBinding
import com.example.app.modules.searchresultlistingplaceanofferpopup.`data`.viewmodel.SearchResultListingPlaceAnOfferPopupVM
import kotlin.String

public class SearchResultListingPlaceAnOfferPopupDialog(
    private val mContext: Context
) : DialogFragment() {
    private lateinit var binding: DialogSearchResultListingPlaceAnOfferPopupBinding

    private val viewModel: SearchResultListingPlaceAnOfferPopupVM by
            viewModels<SearchResultListingPlaceAnOfferPopupVM>()

    public override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DialogSearchResultListingPlaceAnOfferPopupBinding.inflate(inflater)
        binding.lifecycleOwner = requireActivity()
        binding.searchResultListingPlaceAnOfferPopupVM = viewModel
        return binding.root
    }

    public companion object {
        public const val TAG: String = "SEARCH_RESULT_LISTING_PLACE_AN_OFFER_POPUP_DIALOG"
    }
}
