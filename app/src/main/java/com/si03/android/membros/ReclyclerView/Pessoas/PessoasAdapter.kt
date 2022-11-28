package com.si03.android.membros.ReclyclerView.Pessoas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.si03.android.membros.Model.Pessoa
import com.si03.android.membros.R

class PessoasAdapter(private val membros: List<Pessoa>) {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val id: TextView = view.findViewById(R.id.id)
        val status: TextView = view.findViewById(R.id.status)
        val modalidade: TextView = view.findViewById(R.id.modalidade)
        val nome: TextView = view.findViewById(R.id.nome)
        val email: TextView = view.findViewById(R.id.email)
        val telefone: TextView = view.findViewById(R.id.telefone)
        val observacao: TextView = view.findViewById(R.id.observacao)
    }

    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.pessoas_card, parent, false)
        return ViewHolder(view)
    }
}