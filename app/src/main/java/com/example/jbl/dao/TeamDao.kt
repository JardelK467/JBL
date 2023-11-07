package com.example.jbl.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.jbl.data.Team

@Dao
interface TeamDao {
    @Query("SELECT * FROM team")
    fun getAll(): List<Team>

    @Query("SELECT * FROM team WHERE id IN (:teamIds)")
    fun loadAllByIds(teamIds: IntArray): List<Team>

    @Query("SELECT * FROM team WHERE team_name IN (:teamName)")
    fun findByTeamName(teamName: String?): Team

    @Insert
    fun insertAll(vararg team: Team)

    @Delete
    fun delete(team: Team)
}
