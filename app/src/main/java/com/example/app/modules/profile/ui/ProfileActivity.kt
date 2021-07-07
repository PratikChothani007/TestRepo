package com.example.app.modules.profile.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivityProfileBinding
import com.example.app.modules.profile.`data`.viewmodel.ProfileVM
import kotlin.String
import kotlin.Unit

public class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding

    private val viewModel: ProfileVM by viewModels<ProfileVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_profile)
        binding.lifecycleOwner = this
        binding.profileVM = viewModel
    }

    public companion object {
        public const val TAG: String = "PROFILE_ACTIVITY"
    }
}
