package com.example.app.modules.forgotpassword.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivityForgotPasswordBinding
import com.example.app.modules.forgotpassword.`data`.viewmodel.ForgotPasswordVM
import kotlin.String
import kotlin.Unit

public class ForgotPasswordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityForgotPasswordBinding

    private val viewModel: ForgotPasswordVM by viewModels<ForgotPasswordVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_forgot_password)
        binding.lifecycleOwner = this
        binding.forgotPasswordVM = viewModel
    }

    public companion object {
        public const val TAG: String = "FORGOT_PASSWORD_ACTIVITY"
    }
}
