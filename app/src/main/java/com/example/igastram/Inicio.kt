package com.example.igastram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.igastram.databinding.ActivityInicioBinding

class Inicio : AppCompatActivity() {
    lateinit var binding: ActivityInicioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)
        FragmentoHome(savedInstanceState)
        binding.apply {
            Search.setOnClickListener {
                FragmentoSearch(savedInstanceState)
            }
            Home.setOnClickListener {
                FragmentoHome(savedInstanceState)
            }
        }

    }


    private fun FragmentoHome(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace<Home>(R.id.fragmentContainerView2)
            }
        }
    }

    private fun FragmentoSearch(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace<Search>(R.id.fragmentContainerView2)
            }
        }
    }
}