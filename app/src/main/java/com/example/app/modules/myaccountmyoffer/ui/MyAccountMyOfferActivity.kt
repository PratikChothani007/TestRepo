package com.example.app.modules.myaccountmyoffer.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app.R
import com.example.app.databinding.ActivityMyAccountMyOfferBinding
import com.example.app.modules.myaccountmyoffer.`data`.viewmodel.MyAccountMyOfferVM
import kotlin.String
import kotlin.Unit

public class MyAccountMyOfferActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMyAccountMyOfferBinding

    private val viewModel: MyAccountMyOfferVM by viewModels<MyAccountMyOfferVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_my_account_my_offer)
        binding.lifecycleOwner = this
        binding.myAccountMyOfferVM = viewModel
    }

    public companion object {
        public const val TAG: String = "MY_ACCOUNT_MY_OFFER_ACTIVITY"
    }
}
