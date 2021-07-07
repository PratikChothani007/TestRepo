package com.example.app.modules.signinguestinputfill1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivitySignInGuestInputFill1Binding
import com.example.app.modules.signinguestinputfill1.`data`.viewmodel.SignInGuestInputFill1VM
import kotlin.String
import kotlin.Unit

public class SignInGuestInputFill1Activity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInGuestInputFill1Binding

    private val viewModel: SignInGuestInputFill1VM by viewModels<SignInGuestInputFill1VM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_sign_in_guest_input_fill_1)
        binding.lifecycleOwner = this
        binding.signInGuestInputFill1VM = viewModel
    }

    public companion object {
        public const val TAG: String = "SIGN_IN_GUEST_INPUT_FILL1ACTIVITY"
    }
}
