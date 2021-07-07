package com.example.app.modules.signupdocumentsandtermscondition.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivitySignUpDocumentsAndTermsConditionBinding
import com.example.app.modules.signupdocumentsandtermscondition.`data`.viewmodel.SignUpDocumentsAndTermsConditionVM
import kotlin.String
import kotlin.Unit

public class SignUpDocumentsAndTermsConditionActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpDocumentsAndTermsConditionBinding

    private val viewModel: SignUpDocumentsAndTermsConditionVM by
            viewModels<SignUpDocumentsAndTermsConditionVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding =
                DataBindingUtil.setContentView(this,R.layout.activity_sign_up_documents_and_terms_condition)
        binding.lifecycleOwner = this
        binding.signUpDocumentsAndTermsConditionVM = viewModel
    }

    public companion object {
        public const val TAG: String = "SIGN_UP_DOCUMENTS_AND_TERMS_CONDITION_ACTIVITY"
    }
}
