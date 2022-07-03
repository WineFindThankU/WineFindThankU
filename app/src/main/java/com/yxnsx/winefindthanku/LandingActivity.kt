package com.yxnsx.winefindthanku

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yxnsx.winefindthanku.databinding.ActivityLandingBinding
import com.yxnsx.winefindthanku.question.QuestionActivity


class LandingActivity : AppCompatActivity() {

    private var _viewBinding: ActivityLandingBinding? = null
    private val viewBinding get() = _viewBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewBinding()
        initClickListener()
    }

    private fun initViewBinding() {
        _viewBinding = ActivityLandingBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }

    private fun initClickListener() {
        viewBinding.buttonStart.setOnClickListener(clickListener)
    }

    private val clickListener = View.OnClickListener {
        when (it.id) {
            viewBinding.buttonStart.id -> setIntentTo(QuestionActivity())
        }
    }

    private fun setIntentTo(activity: Activity) {
        startActivity(
            Intent(this, activity::class.java)
        )
    }
}