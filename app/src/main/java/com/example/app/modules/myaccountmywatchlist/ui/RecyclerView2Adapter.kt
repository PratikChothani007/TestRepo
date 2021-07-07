package com.example.app.modules.myaccountmywatchlist.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app.R
import com.example.app.databinding.RowMyAccountMyWatchlist2Binding
import com.example.app.modules.myaccountmywatchlist.`data`.model.MyAccountMyWatchlist2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView2Adapter(
  public val list: List<MyAccountMyWatchlist2RowModel>
) : RecyclerView.Adapter<RecyclerView2Adapter.RowMyAccountMyWatchlist2VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowMyAccountMyWatchlist2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_my_account_my_watchlist2,parent,false)
    return RowMyAccountMyWatchlist2VH(view)
  }

  public override fun onBindViewHolder(holder: RowMyAccountMyWatchlist2VH, position: Int): Unit {
    val myAccountMyWatchlist2RowModel = list[position]
    holder.binding.myAccountMyWatchlist2RowModel = myAccountMyWatchlist2RowModel
    holder.itemView.setOnClickListener {
      clickListener?.onItemClick(it, position, myAccountMyWatchlist2RowModel)
    }
  }

  public override fun getItemCount(): Int = list.size

  public class RowMyAccountMyWatchlist2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowMyAccountMyWatchlist2Binding =
        RowMyAccountMyWatchlist2Binding.bind(itemView)
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: MyAccountMyWatchlist2RowModel
    ): Unit {
    }
  }
}
