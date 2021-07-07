package com.example.app.modules.comparestonesshowonlydifference.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivityCompareStonesShowOnlyDifferenceBinding
import com.example.app.modules.comparestonesshowonlydifference.`data`.viewmodel.CompareStonesShowOnlyDifferenceVM
import kotlin.String
import kotlin.Unit

public class CompareStonesShowOnlyDifferenceActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCompareStonesShowOnlyDifferenceBinding

    private val viewModel: CompareStonesShowOnlyDifferenceVM by
            viewModels<CompareStonesShowOnlyDifferenceVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding =
                DataBindingUtil.setContentView(this,R.layout.activity_compare_stones_show_only_difference)
        binding.lifecycleOwner = this
        binding.compareStonesShowOnlyDifferenceVM = viewModel
    }

    public companion object {
        public const val TAG: String = "COMPARE_STONES_SHOW_ONLY_DIFFERENCE_ACTIVITY"
    }
}
