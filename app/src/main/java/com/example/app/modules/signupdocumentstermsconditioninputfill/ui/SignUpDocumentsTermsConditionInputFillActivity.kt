package com.example.app.modules.signupdocumentstermsconditioninputfill.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivitySignUpDocumentsTermsConditionInputFillBinding
import com.example.app.modules.signupdocumentstermsconditioninputfill.`data`.viewmodel.SignUpDocumentsTermsConditionInputFillVM
import kotlin.String
import kotlin.Unit

public class SignUpDocumentsTermsConditionInputFillActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpDocumentsTermsConditionInputFillBinding

    private val viewModel: SignUpDocumentsTermsConditionInputFillVM by
            viewModels<SignUpDocumentsTermsConditionInputFillVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding =
                DataBindingUtil.setContentView(this,R.layout.activity_sign_up_documents_terms_condition_input_fill)
        binding.lifecycleOwner = this
        binding.signUpDocumentsTermsConditionInputFillVM = viewModel
    }

    public companion object {
        public const val TAG: String = "SIGN_UP_DOCUMENTS_TERMS_CONDITION_INPUT_FILL_ACTIVITY"
    }
}
