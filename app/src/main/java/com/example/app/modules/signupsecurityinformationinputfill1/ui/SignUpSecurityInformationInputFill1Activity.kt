package com.example.app.modules.signupsecurityinformationinputfill1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivitySignUpSecurityInformationInputFill1Binding
import com.example.app.modules.signupsecurityinformationinputfill1.`data`.viewmodel.SignUpSecurityInformationInputFill1VM
import kotlin.String
import kotlin.Unit

public class SignUpSecurityInformationInputFill1Activity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpSecurityInformationInputFill1Binding

    private val viewModel: SignUpSecurityInformationInputFill1VM by
            viewModels<SignUpSecurityInformationInputFill1VM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding =
                DataBindingUtil.setContentView(this,R.layout.activity_sign_up_security_information_input_fill_1)
        binding.lifecycleOwner = this
        binding.signUpSecurityInformationInputFill1VM = viewModel
    }

    public companion object {
        public const val TAG: String = "SIGN_UP_SECURITY_INFORMATION_INPUT_FILL1ACTIVITY"
    }
}
