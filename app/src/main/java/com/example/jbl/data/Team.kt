package com.example.jbl.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Team(
    @PrimaryKey val id: Int?,
    @ColumnInfo (name = "team_name") val teamName: String?,
    @ColumnInfo (name = "league") val league: String?,
    @ColumnInfo (name = "total_players") val totalPlayers: String?,
    @ColumnInfo (name = "coach") val coach: String?,
    @ColumnInfo (name = "venue") val venue: String?
)
