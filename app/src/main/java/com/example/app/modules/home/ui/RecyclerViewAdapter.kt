package com.example.app.modules.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app.R
import com.example.app.databinding.RowHomeBinding
import com.example.app.modules.home.`data`.model.HomeRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<HomeRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowHomeVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHomeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home,parent,false)
    return RowHomeVH(view)
  }

  public override fun onBindViewHolder(holder: RowHomeVH, position: Int): Unit {
    val homeRowModel = list[position]
    holder.binding.homeRowModel = homeRowModel
    holder.itemView.setOnClickListener {
      clickListener?.onItemClick(it, position, homeRowModel)
    }
  }

  public override fun getItemCount(): Int = list.size

  public class RowHomeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHomeBinding = RowHomeBinding.bind(itemView)
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: HomeRowModel
    ): Unit {
    }
  }
}
