package com.example.app.modules.diamonddetail.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app.R
import com.example.app.databinding.RowDiamondDetailBinding
import com.example.app.modules.diamonddetail.`data`.model.DiamondDetailRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<DiamondDetailRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowDiamondDetailVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDiamondDetailVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_diamond_detail,parent,false)
    return RowDiamondDetailVH(view)
  }

  public override fun onBindViewHolder(holder: RowDiamondDetailVH, position: Int): Unit {
    val diamondDetailRowModel = list[position]
    holder.binding.diamondDetailRowModel = diamondDetailRowModel
    holder.itemView.setOnClickListener {
      clickListener?.onItemClick(it, position, diamondDetailRowModel)
    }
  }

  public override fun getItemCount(): Int = list.size

  public class RowDiamondDetailVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowDiamondDetailBinding = RowDiamondDetailBinding.bind(itemView)
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: DiamondDetailRowModel
    ): Unit {
    }
  }
}
