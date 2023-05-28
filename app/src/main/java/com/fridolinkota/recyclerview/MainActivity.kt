package com.fridolinkota.recyclerview

import android.app.Activity
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.fridolinkota.recyclerview.adapter.AdapterTeamBola
import com.fridolinkota.recyclerview.databinding.ActivityMainBinding
import com.fridolinkota.recyclerview.model.Pemain

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ListPemain = ArrayList<Pemain>()
        ListPemain.add(Pemain("Thibaut Courtois",R.drawable.Courtois,"Penjaga Gawang","2.00 m","Bree (Belgia)","11 Mei 1992"))
        ListPemain.add(Pemain("Karim Benzema",R.drawable.Benzema,"Penyerang","1,85 m","Lyon (Perancis)","19 Desember 1987"))
        ListPemain.add(Pemain("Marcelo Vieira da Silva",R.drawable.Marcello,"Belakang","1,74 m","Rio de Janeiro (Brasil)","12 Mei 1988"))
        ListPemain.add(Pemain("Sergio Ramos García",R.drawable.Ramos,"Belakang","1,84 m","Camas (Sevilla)","30 Maret 1986"))
        ListPemain.add(Pemain("Zinedine Yazid Zidane",R.drawable.Zidan,"Pelatih","1,85 m","Marseille (Prancis)","23 Juni 1972"))

        binding.list.adapter = AdapterTeamBola(this,ListPemain,object :AdapterTeamBola.OnClickListener{
            override fun DetailData(item: Pemain?) {
                TODO("Not yet implemented")
            }

        })
    }
