package com.example.app.modules.forgotpasswordinputfill.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivityForgotPasswordInputFillBinding
import com.example.app.modules.forgotpasswordinputfill.`data`.viewmodel.ForgotPasswordInputFillVM
import kotlin.String
import kotlin.Unit

public class ForgotPasswordInputFillActivity : AppCompatActivity() {
    private lateinit var binding: ActivityForgotPasswordInputFillBinding

    private val viewModel: ForgotPasswordInputFillVM by viewModels<ForgotPasswordInputFillVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_forgot_password_input_fill)
        binding.lifecycleOwner = this
        binding.forgotPasswordInputFillVM = viewModel
    }

    public companion object {
        public const val TAG: String = "FORGOT_PASSWORD_INPUT_FILL_ACTIVITY"
    }
}
