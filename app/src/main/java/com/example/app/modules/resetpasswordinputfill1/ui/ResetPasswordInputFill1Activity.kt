package com.example.app.modules.resetpasswordinputfill1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivityResetPasswordInputFill1Binding
import com.example.app.modules.resetpasswordinputfill1.`data`.viewmodel.ResetPasswordInputFill1VM
import kotlin.String
import kotlin.Unit

public class ResetPasswordInputFill1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityResetPasswordInputFill1Binding

    private val viewModel: ResetPasswordInputFill1VM by viewModels<ResetPasswordInputFill1VM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_reset_password_input_fill_1)
        binding.lifecycleOwner = this
        binding.resetPasswordInputFill1VM = viewModel
    }

    public companion object {
        public const val TAG: String = "RESET_PASSWORD_INPUT_FILL1ACTIVITY"
    }
}
