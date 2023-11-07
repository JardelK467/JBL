package com.example.jbl.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.jbl.data.Division

@Dao
interface DivisionDao {
    @Query("SELECT * FROM player")
    fun getAll(): List<Division>

    @Query("SELECT * FROM division WHERE id IN (:divIds)")
    fun loadAllByIds(divIds: IntArray): List<Division>

    @Query("SELECT * FROM division WHERE div_name IN (:divName)")
    fun findByName(divName: String?): Division

    @Insert
    fun insertAll(vararg divisions: Division)

    @Delete
    fun delete(division: Division)
}
