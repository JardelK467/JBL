package com.example.jbl.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Team(
    @PrimaryKey val id: Int?,
    @SerializedName("team_name")
    @ColumnInfo(name = "team_name")
    val teamName: String?,
    @SerializedName("league")
    @ColumnInfo(name = "league")
    val league: String?,
    @SerializedName("total_players")
    @ColumnInfo(name = "total_players")
    val totalPlayers: String?,
    @SerializedName("coach")
    @ColumnInfo(name = "coach")
    val coach: String?,
    @SerializedName("venue")
    @ColumnInfo(name = "venue")
    val venue: String?,
)
