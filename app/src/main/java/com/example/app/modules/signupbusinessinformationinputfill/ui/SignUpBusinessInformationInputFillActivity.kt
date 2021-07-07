package com.example.app.modules.signupbusinessinformationinputfill.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivitySignUpBusinessInformationInputFillBinding
import com.example.app.modules.signupbusinessinformationinputfill.`data`.viewmodel.SignUpBusinessInformationInputFillVM
import kotlin.String
import kotlin.Unit

public class SignUpBusinessInformationInputFillActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBusinessInformationInputFillBinding

    private val viewModel: SignUpBusinessInformationInputFillVM by
            viewModels<SignUpBusinessInformationInputFillVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding =
                DataBindingUtil.setContentView(this,R.layout.activity_sign_up_business_information_input_fill)
        binding.lifecycleOwner = this
        binding.signUpBusinessInformationInputFillVM = viewModel
    }

    public companion object {
        public const val TAG: String = "SIGN_UP_BUSINESS_INFORMATION_INPUT_FILL_ACTIVITY"
    }
}
