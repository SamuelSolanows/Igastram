package com.example.igastram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.igastram.databinding.ActivityInicioBinding

class Inicio : AppCompatActivity() {
    lateinit var binding: ActivityInicioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}