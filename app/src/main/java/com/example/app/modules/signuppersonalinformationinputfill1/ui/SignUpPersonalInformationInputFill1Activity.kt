package com.example.app.modules.signuppersonalinformationinputfill1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivitySignUpPersonalInformationInputFill1Binding
import com.example.app.modules.signuppersonalinformationinputfill1.`data`.viewmodel.SignUpPersonalInformationInputFill1VM
import kotlin.String
import kotlin.Unit

public class SignUpPersonalInformationInputFill1Activity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpPersonalInformationInputFill1Binding

    private val viewModel: SignUpPersonalInformationInputFill1VM by
            viewModels<SignUpPersonalInformationInputFill1VM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding =
                DataBindingUtil.setContentView(this,R.layout.activity_sign_up_personal_information_input_fill_1)
        binding.lifecycleOwner = this
        binding.signUpPersonalInformationInputFill1VM = viewModel
    }

    public companion object {
        public const val TAG: String = "SIGN_UP_PERSONAL_INFORMATION_INPUT_FILL1ACTIVITY"
    }
}
