package com.example.app.modules.myaccountmywatchlist.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app.R
import com.example.app.databinding.RowMyAccountMyWatchlistBinding
import com.example.app.modules.myaccountmywatchlist.`data`.model.MyAccountMyWatchlistRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<MyAccountMyWatchlistRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowMyAccountMyWatchlistVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowMyAccountMyWatchlistVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_my_account_my_watchlist,parent,false)
    return RowMyAccountMyWatchlistVH(view)
  }

  public override fun onBindViewHolder(holder: RowMyAccountMyWatchlistVH, position: Int): Unit {
    val myAccountMyWatchlistRowModel = list[position]
    holder.binding.myAccountMyWatchlistRowModel = myAccountMyWatchlistRowModel
    holder.itemView.setOnClickListener {
      clickListener?.onItemClick(it, position, myAccountMyWatchlistRowModel)
    }
  }

  public override fun getItemCount(): Int = list.size

  public class RowMyAccountMyWatchlistVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowMyAccountMyWatchlistBinding =
        RowMyAccountMyWatchlistBinding.bind(itemView)
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: MyAccountMyWatchlistRowModel
    ): Unit {
    }
  }
}
