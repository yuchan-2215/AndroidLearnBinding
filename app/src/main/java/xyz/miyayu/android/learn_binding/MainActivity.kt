package xyz.miyayu.android.learn_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import xyz.miyayu.android.learn_binding.databinding.ActivityMainRenamedBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainRenamedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainRenamedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.text.text = getString(R.string.replaced_text)
        binding.button.setOnClickListener {
            binding.text.text = getString(R.string.clicked_text)
        }
    }
}