package com.example.app.modules.signupsecurityinformation.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivitySignUpSecurityInformationBinding
import com.example.app.modules.signupsecurityinformation.`data`.viewmodel.SignUpSecurityInformationVM
import kotlin.String
import kotlin.Unit

public class SignUpSecurityInformationActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpSecurityInformationBinding

    private val viewModel: SignUpSecurityInformationVM by viewModels<SignUpSecurityInformationVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding =
                DataBindingUtil.setContentView(this,R.layout.activity_sign_up_security_information)
        binding.lifecycleOwner = this
        binding.signUpSecurityInformationVM = viewModel
    }

    public companion object {
        public const val TAG: String = "SIGN_UP_SECURITY_INFORMATION_ACTIVITY"
    }
}
