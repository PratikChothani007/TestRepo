package com.example.app.modules.signinguest.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivitySignInGuestBinding
import com.example.app.modules.signinguest.`data`.viewmodel.SignInGuestVM
import kotlin.String
import kotlin.Unit

public class SignInGuestActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInGuestBinding

    private val viewModel: SignInGuestVM by viewModels<SignInGuestVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_sign_in_guest)
        binding.lifecycleOwner = this
        binding.signInGuestVM = viewModel
    }

    public companion object {
        public const val TAG: String = "SIGN_IN_GUEST_ACTIVITY"
    }
}
