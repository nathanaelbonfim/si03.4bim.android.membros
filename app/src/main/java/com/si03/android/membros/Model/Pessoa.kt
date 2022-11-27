package com.si03.android.membros.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// An entity class named Pessoa for Room database
// for a members application

@Entity
data class Pessoa(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "status") val status: String?,
    @ColumnInfo(name = "nome") val nome: String?,
    @ColumnInfo(name = "email") val email: String?,
    @ColumnInfo(name = "telefone") val telefone: String?,
    @ColumnInfo(name = "modalidade") val modalidade: String?,
    @ColumnInfo(name = "observacao") val observacao: String?,
)