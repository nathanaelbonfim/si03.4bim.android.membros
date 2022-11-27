package com.si03.android.membros.Model

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Pessoa::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun pessoaDao(): PessoaDao
}