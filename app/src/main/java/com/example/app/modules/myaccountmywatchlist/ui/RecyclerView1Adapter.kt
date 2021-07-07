package com.example.app.modules.myaccountmywatchlist.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app.R
import com.example.app.databinding.RowMyAccountMyWatchlist1Binding
import com.example.app.modules.myaccountmywatchlist.`data`.model.MyAccountMyWatchlist1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView1Adapter(
  public val list: List<MyAccountMyWatchlist1RowModel>
) : RecyclerView.Adapter<RecyclerView1Adapter.RowMyAccountMyWatchlist1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowMyAccountMyWatchlist1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_my_account_my_watchlist1,parent,false)
    return RowMyAccountMyWatchlist1VH(view)
  }

  public override fun onBindViewHolder(holder: RowMyAccountMyWatchlist1VH, position: Int): Unit {
    val myAccountMyWatchlist1RowModel = list[position]
    holder.binding.myAccountMyWatchlist1RowModel = myAccountMyWatchlist1RowModel
    holder.itemView.setOnClickListener {
      clickListener?.onItemClick(it, position, myAccountMyWatchlist1RowModel)
    }
  }

  public override fun getItemCount(): Int = list.size

  public class RowMyAccountMyWatchlist1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowMyAccountMyWatchlist1Binding =
        RowMyAccountMyWatchlist1Binding.bind(itemView)
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: MyAccountMyWatchlist1RowModel
    ): Unit {
    }
  }
}
