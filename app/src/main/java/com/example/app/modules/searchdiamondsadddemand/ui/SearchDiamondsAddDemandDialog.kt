package com.example.app.modules.searchdiamondsadddemand.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import com.example.app.databinding.DialogSearchDiamondsAddDemandBinding
import com.example.app.modules.searchdiamondsadddemand.`data`.model.SearchDiamondsAddDemandRowModel
import com.example.app.modules.searchdiamondsadddemand.`data`.viewmodel.SearchDiamondsAddDemandVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class SearchDiamondsAddDemandDialog(
    private val mContext: Context
) : DialogFragment() {
    private lateinit var binding: DialogSearchDiamondsAddDemandBinding

    private val viewModel: SearchDiamondsAddDemandVM by viewModels<SearchDiamondsAddDemandVM>()

    public fun onClickRecyclerView(
        view: View,
        position: Int,
        item: SearchDiamondsAddDemandRowModel
    ): Unit {
    }

    public override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DialogSearchDiamondsAddDemandBinding.inflate(inflater)
        val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
        binding.recyclerView.adapter = recyclerViewAdapter
        recyclerViewAdapter.setOnItemClickListener(
        object : RecyclerViewAdapter.OnItemClickListener {
            override fun onItemClick(view:View, position:Int, item :
                    SearchDiamondsAddDemandRowModel) {
                onClickRecyclerView(view, position, item)
            }
        }
        )
        binding.lifecycleOwner = requireActivity()
        binding.searchDiamondsAddDemandVM = viewModel
        return binding.root
    }

    public companion object {
        public const val TAG: String = "SEARCH_DIAMONDS_ADD_DEMAND_DIALOG"
    }
}
