package com.example.analisebancaria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvList: RecyclerView
    private var adapter = MenuItemAdpter()

    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciarViews()
        setItemLista()
    }

    private fun iniciarViews(){

        rvList = findViewById(R.id.rv_list)
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this,2)

    }

    private fun setItemLista(){
        adapter.setItemList(
            arrayListOf(
                MenuItemModel(
                    "Saldo"
                ),
                MenuItemModel(
                    "Extratos"
                ),
                MenuItemModel(
                    "Cartao de credito"
                ),
                MenuItemModel(
                    "fazer transferências"
                ),
                MenuItemModel(
                    "Meus Agendamentos"
                ),
                MenuItemModel(
                    "Meus Comprovantes"
                ),
                MenuItemModel(
                    "Investimentos"
                ),
                MenuItemModel(
                    "Portabilidade de Salario"
                ),
                MenuItemModel(
                    "Emprestimos"
                )
            )
        )

    }


}