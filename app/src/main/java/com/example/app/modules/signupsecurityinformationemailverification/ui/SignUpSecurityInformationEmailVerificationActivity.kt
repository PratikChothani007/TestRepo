package com.example.app.modules.signupsecurityinformationemailverification.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivitySignUpSecurityInformationEmailVerificationBinding
import com.example.app.modules.signupsecurityinformationemailverification.`data`.viewmodel.SignUpSecurityInformationEmailVerificationVM
import kotlin.String
import kotlin.Unit

public class SignUpSecurityInformationEmailVerificationActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpSecurityInformationEmailVerificationBinding

    private val viewModel: SignUpSecurityInformationEmailVerificationVM by
            viewModels<SignUpSecurityInformationEmailVerificationVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding =
                DataBindingUtil.setContentView(this,R.layout.activity_sign_up_security_information_email_verification)
        binding.lifecycleOwner = this
        binding.signUpSecurityInformationEmailVerificationVM = viewModel
    }

    public companion object {
        public const val TAG: String = "SIGN_UP_SECURITY_INFORMATION_EMAIL_VERIFICATION_ACTIVITY"
    }
}
