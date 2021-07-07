package com.example.app.modules.signupsecurityinformationinputfill.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivitySignUpSecurityInformationInputFillBinding
import com.example.app.modules.signupsecurityinformationinputfill.`data`.viewmodel.SignUpSecurityInformationInputFillVM
import kotlin.String
import kotlin.Unit

public class SignUpSecurityInformationInputFillActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpSecurityInformationInputFillBinding

    private val viewModel: SignUpSecurityInformationInputFillVM by
            viewModels<SignUpSecurityInformationInputFillVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding =
                DataBindingUtil.setContentView(this,R.layout.activity_sign_up_security_information_input_fill)
        binding.lifecycleOwner = this
        binding.signUpSecurityInformationInputFillVM = viewModel
    }

    public companion object {
        public const val TAG: String = "SIGN_UP_SECURITY_INFORMATION_INPUT_FILL_ACTIVITY"
    }
}
