package com.example.app.modules.searchdiamondsbasic.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivitySearchDiamondsBasicBinding
import com.example.app.modules.searchdiamondsbasic.`data`.viewmodel.SearchDiamondsBasicVM
import kotlin.String
import kotlin.Unit

public class SearchDiamondsBasicActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchDiamondsBasicBinding

    private val viewModel: SearchDiamondsBasicVM by viewModels<SearchDiamondsBasicVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_search_diamonds_basic)
        binding.lifecycleOwner = this
        binding.searchDiamondsBasicVM = viewModel
    }

    public companion object {
        public const val TAG: String = "SEARCH_DIAMONDS_BASIC_ACTIVITY"
    }
}
