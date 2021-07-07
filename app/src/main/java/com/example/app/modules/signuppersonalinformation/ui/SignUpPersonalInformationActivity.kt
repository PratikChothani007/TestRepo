package com.example.app.modules.signuppersonalinformation.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivitySignUpPersonalInformationBinding
import com.example.app.modules.signuppersonalinformation.`data`.viewmodel.SignUpPersonalInformationVM
import kotlin.String
import kotlin.Unit

public class SignUpPersonalInformationActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpPersonalInformationBinding

    private val viewModel: SignUpPersonalInformationVM by viewModels<SignUpPersonalInformationVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding =
                DataBindingUtil.setContentView(this,R.layout.activity_sign_up_personal_information)
        binding.lifecycleOwner = this
        binding.signUpPersonalInformationVM = viewModel
    }

    public companion object {
        public const val TAG: String = "SIGN_UP_PERSONAL_INFORMATION_ACTIVITY"
    }
}
