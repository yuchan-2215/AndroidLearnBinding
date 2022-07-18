package xyz.miyayu.android.learn_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import xyz.miyayu.android.learn_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.text.text = getString(R.string.replaced_text)
        binding.button.setOnClickListener {
            binding.text.text = getString(R.string.clicked_text)
        }
    }
}