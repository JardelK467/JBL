package com.example.jbl.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.jbl.data.Player

@Dao
interface PlayerDao {
    @Query("SELECT * FROM player")
    fun getAll(): List<Player>

    @Query("SELECT * FROM team WHERE id IN (:playerIds)")
    fun loadAllByIds(playerIds: IntArray): List<Player>

    @Query(
        "SELECT * FROM player WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1",
    )
    fun findByName(
        first: String,
        last: String,
    ): Player

    @Insert
    fun insertAll(vararg players: Player)

    @Delete
    fun delete(player: Player)
}
