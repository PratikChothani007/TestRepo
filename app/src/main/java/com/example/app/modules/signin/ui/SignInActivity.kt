package com.example.app.modules.signin.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivitySignInBinding
import com.example.app.modules.signin.`data`.viewmodel.SignInVM
import kotlin.String
import kotlin.Unit

public class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding

    private val viewModel: SignInVM by viewModels<SignInVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_sign_in)
        binding.lifecycleOwner = this
        binding.signInVM = viewModel
    }

    public companion object {
        public const val TAG: String = "SIGN_IN_ACTIVITY"
    }
}
