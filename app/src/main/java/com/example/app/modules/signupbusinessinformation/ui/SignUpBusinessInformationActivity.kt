package com.example.app.modules.signupbusinessinformation.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivitySignUpBusinessInformationBinding
import com.example.app.modules.signupbusinessinformation.`data`.viewmodel.SignUpBusinessInformationVM
import kotlin.String
import kotlin.Unit

public class SignUpBusinessInformationActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBusinessInformationBinding

    private val viewModel: SignUpBusinessInformationVM by viewModels<SignUpBusinessInformationVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding =
                DataBindingUtil.setContentView(this,R.layout.activity_sign_up_business_information)
        binding.lifecycleOwner = this
        binding.signUpBusinessInformationVM = viewModel
    }

    public companion object {
        public const val TAG: String = "SIGN_UP_BUSINESS_INFORMATION_ACTIVITY"
    }
}
