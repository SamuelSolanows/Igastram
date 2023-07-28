package com.example.igastram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.igastram.databinding.ActivityInicioBinding

class Inicio : AppCompatActivity() {
    lateinit var binding: ActivityInicioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)
        LlamarFragmento(savedInstanceState)

    }

    private fun LlamarFragmento(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<Notificaciones>(R.id.fragmentContainerView2)
            }
        }
    }
}