package com.example.app.modules.quicksearch.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivityQuickSearchBinding
import com.example.app.modules.quicksearch.`data`.viewmodel.QuickSearchVM
import kotlin.String
import kotlin.Unit

public class QuickSearchActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuickSearchBinding

    private val viewModel: QuickSearchVM by viewModels<QuickSearchVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_quick_search)
        binding.lifecycleOwner = this
        binding.quickSearchVM = viewModel
    }

    public companion object {
        public const val TAG: String = "QUICK_SEARCH_ACTIVITY"
    }
}
