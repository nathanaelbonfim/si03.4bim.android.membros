package com.si03.android.membros.Model

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PessoaDao {
    @Query("SELECT * FROM pessoa")
    fun getAll(): List<Pessoa>

    @Query("SELECT * FROM pessoa WHERE id IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Pessoa>

    @Query("SELECT * FROM pessoa WHERE nome LIKE :name LIMIT 1")
    fun findByName(name: String): Pessoa

    @Insert
    fun insertAll(vararg users: Pessoa)

    @Delete
    fun delete(user: Pessoa)
}