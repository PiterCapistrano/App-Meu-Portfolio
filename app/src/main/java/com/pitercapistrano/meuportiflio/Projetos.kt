package com.pitercapistrano.meuportiflio

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.pitercapistrano.meuportiflio.databinding.ActivityContatoBinding
import com.pitercapistrano.meuportiflio.databinding.ActivityProjetosBinding

class Projetos : AppCompatActivity() {

    private lateinit var binding: ActivityProjetosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityProjetosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.toolbarProjetos.setNavigationOnClickListener {
            finish()
        }

        binding.btDtFpcalculator.setOnClickListener {
            val intent = Intent(this, DetalhesFPCalculator::class.java)
            startActivity(intent)
        }
    }
}