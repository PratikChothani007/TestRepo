package com.example.app.modules.forgotpasswordotpverification.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivityForgotPasswordOtpVerificationBinding
import com.example.app.modules.forgotpasswordotpverification.`data`.viewmodel.ForgotPasswordOtpVerificationVM
import kotlin.String
import kotlin.Unit

public class ForgotPasswordOtpVerificationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityForgotPasswordOtpVerificationBinding

    private val viewModel: ForgotPasswordOtpVerificationVM by
            viewModels<ForgotPasswordOtpVerificationVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding =
                DataBindingUtil.setContentView(this,R.layout.activity_forgot_password_otp_verification)
        binding.lifecycleOwner = this
        binding.forgotPasswordOtpVerificationVM = viewModel
    }

    public companion object {
        public const val TAG: String = "FORGOT_PASSWORD_OTP_VERIFICATION_ACTIVITY"
    }
}
