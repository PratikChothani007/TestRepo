package com.example.app.modules.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app.R
import com.example.app.databinding.RowHome1Binding
import com.example.app.modules.home.`data`.model.Home1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView1Adapter(
  public val list: List<Home1RowModel>
) : RecyclerView.Adapter<RecyclerView1Adapter.RowHome1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHome1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home1,parent,false)
    return RowHome1VH(view)
  }

  public override fun onBindViewHolder(holder: RowHome1VH, position: Int): Unit {
    val home1RowModel = list[position]
    holder.binding.home1RowModel = home1RowModel
    holder.itemView.setOnClickListener {
      clickListener?.onItemClick(it, position, home1RowModel)
    }
  }

  public override fun getItemCount(): Int = list.size

  public class RowHome1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHome1Binding = RowHome1Binding.bind(itemView)
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Home1RowModel
    ): Unit {
    }
  }
}
