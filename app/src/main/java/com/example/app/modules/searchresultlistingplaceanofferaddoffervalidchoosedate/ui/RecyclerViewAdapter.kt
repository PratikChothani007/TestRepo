package com.example.app.modules.searchresultlistingplaceanofferaddoffervalidchoosedate.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app.R
import com.example.app.databinding.RowSearchResultListingPlaceAnOfferAddOfferValidChooseDateBinding
import com.example.app.modules.searchresultlistingplaceanofferaddoffervalidchoosedate.`data`.model.SearchResultListingPlaceAnOfferAddOfferValidChooseDateRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<SearchResultListingPlaceAnOfferAddOfferValidChooseDateRowModel>
) :
    RecyclerView.Adapter<RecyclerViewAdapter.RowSearchResultListingPlaceAnOfferAddOfferValidChooseDateVH>()
    {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowSearchResultListingPlaceAnOfferAddOfferValidChooseDateVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_search_result_listing_place_an_offer_add_offer_valid_choose_date,parent,false)
    return RowSearchResultListingPlaceAnOfferAddOfferValidChooseDateVH(view)
  }

  public override
      fun onBindViewHolder(holder: RowSearchResultListingPlaceAnOfferAddOfferValidChooseDateVH,
      position: Int): Unit {
    val searchResultListingPlaceAnOfferAddOfferValidChooseDateRowModel = list[position]
    holder.binding.searchResultListingPlaceAnOfferAddOfferValidChooseDateRowModel =
        searchResultListingPlaceAnOfferAddOfferValidChooseDateRowModel
    holder.itemView.setOnClickListener {
      clickListener?.onItemClick(it, position,
          searchResultListingPlaceAnOfferAddOfferValidChooseDateRowModel)
    }
  }

  public override fun getItemCount(): Int = list.size

  public class RowSearchResultListingPlaceAnOfferAddOfferValidChooseDateVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSearchResultListingPlaceAnOfferAddOfferValidChooseDateBinding =
        RowSearchResultListingPlaceAnOfferAddOfferValidChooseDateBinding.bind(itemView)
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: SearchResultListingPlaceAnOfferAddOfferValidChooseDateRowModel
    ): Unit {
    }
  }
}
