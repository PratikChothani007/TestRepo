package com.example.app.modules.profileedit.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivityProfileEditBinding
import com.example.app.modules.profileedit.`data`.viewmodel.ProfileEditVM
import kotlin.String
import kotlin.Unit

public class ProfileEditActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileEditBinding

    private val viewModel: ProfileEditVM by viewModels<ProfileEditVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_profile_edit)
        binding.lifecycleOwner = this
        binding.profileEditVM = viewModel
    }

    public companion object {
        public const val TAG: String = "PROFILE_EDIT_ACTIVITY"
    }
}
