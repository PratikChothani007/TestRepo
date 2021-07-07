package com.example.app.modules.searchdiamondsadddemand.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app.R
import com.example.app.databinding.RowSearchDiamondsAddDemandBinding
import com.example.app.modules.searchdiamondsadddemand.`data`.model.SearchDiamondsAddDemandRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<SearchDiamondsAddDemandRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowSearchDiamondsAddDemandVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowSearchDiamondsAddDemandVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_search_diamonds_add_demand,parent,false)
    return RowSearchDiamondsAddDemandVH(view)
  }

  public override fun onBindViewHolder(holder: RowSearchDiamondsAddDemandVH, position: Int): Unit {
    val searchDiamondsAddDemandRowModel = list[position]
    holder.binding.searchDiamondsAddDemandRowModel = searchDiamondsAddDemandRowModel
    holder.itemView.setOnClickListener {
      clickListener?.onItemClick(it, position, searchDiamondsAddDemandRowModel)
    }
  }

  public override fun getItemCount(): Int = list.size

  public class RowSearchDiamondsAddDemandVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSearchDiamondsAddDemandBinding =
        RowSearchDiamondsAddDemandBinding.bind(itemView)
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: SearchDiamondsAddDemandRowModel
    ): Unit {
    }
  }
}
