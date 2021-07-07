package com.example.app.modules.signininputfill1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivitySignInInputFill1Binding
import com.example.app.modules.signininputfill1.`data`.viewmodel.SignInInputFill1VM
import kotlin.String
import kotlin.Unit

public class SignInInputFill1Activity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInInputFill1Binding

    private val viewModel: SignInInputFill1VM by viewModels<SignInInputFill1VM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_sign_in_input_fill_1)
        binding.lifecycleOwner = this
        binding.signInInputFill1VM = viewModel
    }

    public companion object {
        public const val TAG: String = "SIGN_IN_INPUT_FILL1ACTIVITY"
    }
}
