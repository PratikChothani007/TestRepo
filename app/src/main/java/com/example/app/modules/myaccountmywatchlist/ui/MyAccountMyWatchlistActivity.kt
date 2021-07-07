package com.example.app.modules.myaccountmywatchlist.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivityMyAccountMyWatchlistBinding
import com.example.app.modules.myaccountmywatchlist.`data`.model.MyAccountMyWatchlist1RowModel
import com.example.app.modules.myaccountmywatchlist.`data`.model.MyAccountMyWatchlist2RowModel
import com.example.app.modules.myaccountmywatchlist.`data`.model.MyAccountMyWatchlistRowModel
import com.example.app.modules.myaccountmywatchlist.`data`.viewmodel.MyAccountMyWatchlistVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class MyAccountMyWatchlistActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMyAccountMyWatchlistBinding

    private val viewModel: MyAccountMyWatchlistVM by viewModels<MyAccountMyWatchlistVM>()

    public fun onClickRecyclerView(
        view: View,
        position: Int,
        item: MyAccountMyWatchlistRowModel
    ): Unit {
    }

    public fun onClickRecyclerView1(
        view: View,
        position: Int,
        item: MyAccountMyWatchlist1RowModel
    ): Unit {
    }

    public fun onClickRecyclerView2(
        view: View,
        position: Int,
        item: MyAccountMyWatchlist2RowModel
    ): Unit {
    }

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_my_account_my_watchlist)
        val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
        binding.recyclerView.adapter = recyclerViewAdapter
        recyclerViewAdapter.setOnItemClickListener(
        object : RecyclerViewAdapter.OnItemClickListener {
            override fun onItemClick(view:View, position:Int, item : MyAccountMyWatchlistRowModel) {
                onClickRecyclerView(view, position, item)
            }
        }
        )
        val recyclerView1Adapter = RecyclerView1Adapter(arrayListOf())
        binding.recyclerView1.adapter = recyclerView1Adapter
        recyclerView1Adapter.setOnItemClickListener(
        object : RecyclerView1Adapter.OnItemClickListener {
            override fun onItemClick(view:View, position:Int, item :
                    MyAccountMyWatchlist1RowModel) {
                onClickRecyclerView1(view, position, item)
            }
        }
        )
        val recyclerView2Adapter = RecyclerView2Adapter(arrayListOf())
        binding.recyclerView2.adapter = recyclerView2Adapter
        recyclerView2Adapter.setOnItemClickListener(
        object : RecyclerView2Adapter.OnItemClickListener {
            override fun onItemClick(view:View, position:Int, item :
                    MyAccountMyWatchlist2RowModel) {
                onClickRecyclerView2(view, position, item)
            }
        }
        )
        binding.lifecycleOwner = this
        binding.myAccountMyWatchlistVM = viewModel
    }

    public companion object {
        public const val TAG: String = "MY_ACCOUNT_MY_WATCHLIST_ACTIVITY"
    }
}
