package com.example.app.modules.resetpasswordsuccess.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivityResetPasswordSuccessBinding
import com.example.app.modules.resetpasswordsuccess.`data`.viewmodel.ResetPasswordSuccessVM
import kotlin.String
import kotlin.Unit

public class ResetPasswordSuccessActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResetPasswordSuccessBinding

    private val viewModel: ResetPasswordSuccessVM by viewModels<ResetPasswordSuccessVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_reset_password_success)
        binding.lifecycleOwner = this
        binding.resetPasswordSuccessVM = viewModel
    }

    public companion object {
        public const val TAG: String = "RESET_PASSWORD_SUCCESS_ACTIVITY"
    }
}
