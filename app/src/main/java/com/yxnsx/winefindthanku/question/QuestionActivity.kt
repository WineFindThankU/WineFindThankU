package com.yxnsx.winefindthanku.question

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yxnsx.winefindthanku.databinding.ActivityQuestionBinding


class QuestionActivity : AppCompatActivity() {

    private var _viewBinding: ActivityQuestionBinding? = null
    private val viewBinding get() = _viewBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewBinding()
    }

    private fun initViewBinding() {
        _viewBinding = ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }
}