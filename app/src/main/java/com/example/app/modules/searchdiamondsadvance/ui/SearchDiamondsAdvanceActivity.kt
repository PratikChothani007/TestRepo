package com.example.app.modules.searchdiamondsadvance.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivitySearchDiamondsAdvanceBinding
import com.example.app.modules.searchdiamondsadvance.`data`.viewmodel.SearchDiamondsAdvanceVM
import kotlin.String
import kotlin.Unit

public class SearchDiamondsAdvanceActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchDiamondsAdvanceBinding

    private val viewModel: SearchDiamondsAdvanceVM by viewModels<SearchDiamondsAdvanceVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_search_diamonds_advance)
        binding.lifecycleOwner = this
        binding.searchDiamondsAdvanceVM = viewModel
    }

    public companion object {
        public const val TAG: String = "SEARCH_DIAMONDS_ADVANCE_ACTIVITY"
    }
}
