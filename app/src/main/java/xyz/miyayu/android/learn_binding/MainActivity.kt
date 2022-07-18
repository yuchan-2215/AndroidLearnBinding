package xyz.miyayu.android.learn_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import xyz.miyayu.android.learn_binding.databinding.ActivityMainRenamedBinding
import xyz.miyayu.android.learn_binding.viewmodel.SampleViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainRenamedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(application).create(SampleViewModel().javaClass)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main_renamed)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        setContentView(binding.root)
    }
}