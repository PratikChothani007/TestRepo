package com.example.app.modules.resetpassword.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivityResetPasswordBinding
import com.example.app.modules.resetpassword.`data`.viewmodel.ResetPasswordVM
import kotlin.String
import kotlin.Unit

public class ResetPasswordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResetPasswordBinding

    private val viewModel: ResetPasswordVM by viewModels<ResetPasswordVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_reset_password)
        binding.lifecycleOwner = this
        binding.resetPasswordVM = viewModel
    }

    public companion object {
        public const val TAG: String = "RESET_PASSWORD_ACTIVITY"
    }
}
