package com.example.app.modules.searchresultlistingplaceanofferaddoffervalidchoosedate.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import com.example.app.databinding.DialogSearchResultListingPlaceAnOfferAddOfferValidChooseDateBinding
import com.example.app.modules.searchresultlistingplaceanofferaddoffervalidchoosedate.`data`.model.SearchResultListingPlaceAnOfferAddOfferValidChooseDateRowModel
import com.example.app.modules.searchresultlistingplaceanofferaddoffervalidchoosedate.`data`.viewmodel.SearchResultListingPlaceAnOfferAddOfferValidChooseDateVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class SearchResultListingPlaceAnOfferAddOfferValidChooseDateDialog(
    private val mContext: Context
) : DialogFragment() {
    private lateinit var binding:
            DialogSearchResultListingPlaceAnOfferAddOfferValidChooseDateBinding

    private val viewModel: SearchResultListingPlaceAnOfferAddOfferValidChooseDateVM by
            viewModels<SearchResultListingPlaceAnOfferAddOfferValidChooseDateVM>()

    public fun onClickRecyclerView(
        view: View,
        position: Int,
        item: SearchResultListingPlaceAnOfferAddOfferValidChooseDateRowModel
    ): Unit {
    }

    public override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
                DialogSearchResultListingPlaceAnOfferAddOfferValidChooseDateBinding.inflate(inflater)
        val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
        binding.recyclerView.adapter = recyclerViewAdapter
        recyclerViewAdapter.setOnItemClickListener(
        object : RecyclerViewAdapter.OnItemClickListener {
            override fun onItemClick(view:View, position:Int, item :
                    SearchResultListingPlaceAnOfferAddOfferValidChooseDateRowModel) {
                onClickRecyclerView(view, position, item)
            }
        }
        )
        binding.lifecycleOwner = requireActivity()
        binding.searchResultListingPlaceAnOfferAddOfferValidChooseDateVM = viewModel
        return binding.root
    }

    public companion object {
        public const val TAG: String =
                "SEARCH_RESULT_LISTING_PLACE_AN_OFFER_ADD_OFFER_VALID_CHOOSE_DATE_DIALOG"
    }
}
