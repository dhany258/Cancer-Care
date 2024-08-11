package com.dicoding.asclepius.view

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.asclepius.R
import com.dicoding.asclepius.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // TODO: Menampilkan hasil gambar, prediksi, dan confidence score.
        val imageUri = intent.getParcelableExtra<Uri>(EXTRA_IMAGE_URI)
        val resulText = intent.getStringExtra(EXTRA_RESULT_TEXT)

        binding.resultText.text = resulText
        imageUri?.let {
            binding.resultImage.setImageURI(it)
        }
    }


    companion object {
        const val EXTRA_RESULT_TEXT = "extra_result_text"
        const val EXTRA_IMAGE_URI = "extra_image_uri"
    }

}