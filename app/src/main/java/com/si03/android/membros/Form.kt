package com.si03.android.membros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import androidx.room.Room
import com.si03.android.membros.Model.AppDatabase
import com.si03.android.membros.Model.Pessoa

class Form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val PessoaDao = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "pessoa"
        ).allowMainThreadQueries().build().pessoaDao()

        var novaPessoa: Pessoa


        val button = findViewById<Button>(R.id.btnSalvar)
        button.setOnClickListener {
            novaPessoa = Pessoa(
                id = 0,
                status = findViewById<Switch>(R.id.inputStatus).isChecked,
                nome = findViewById<EditText>(R.id.inputNome).text.toString(),
                email = findViewById<EditText>(R.id.inputEmail).text.toString(),
                telefone = findViewById<EditText>(R.id.inputTelefone).text.toString(),
                modalidade = findViewById<EditText>(R.id.inputModalidade).text.toString(),
                observacao = findViewById<EditText>(R.id.inputObservacao).text.toString(),
            )

            PessoaDao.insert(novaPessoa)

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }



}