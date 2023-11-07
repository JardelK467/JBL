package com.example.jbl.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Division(
    @PrimaryKey  val id: String?,
    @ColumnInfo (name = "div_name") val divName: String?,
    @ColumnInfo (name = "teams") val teams: List<Team>,
    @ColumnInfo (name = "games_played") val GP: String?,
    @ColumnInfo (name = "wins") val wins: Int?,
    @ColumnInfo (name = "losses") val losses: Int?,
    @ColumnInfo (name = "win_loss") val winLoss: Double?
)