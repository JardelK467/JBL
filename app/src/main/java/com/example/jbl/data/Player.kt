package com.example.jbl.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.time.LocalDate

@Entity
data class Player(
    @PrimaryKey val id: Int?,
    @ColumnInfo("first_name")
    @SerializedName("first_name")
    val firstName: String?,
    @ColumnInfo("last_name")
    @SerializedName("last_name")
    val lastName: String?,
    @ColumnInfo("height")
    @SerializedName("height")
    val height: String?,
    @ColumnInfo("weight")
    @SerializedName("weight")
    val weight: Double?,
    @ColumnInfo("dob")
    @SerializedName("dob")
    val dob: LocalDate?,
    @ColumnInfo("playing_number")
    @SerializedName("playing_number")
    val playingNumber: Int?,
    @ColumnInfo("gender")
    @SerializedName("gender")
    val gender: String?,
    @ColumnInfo("team_assigned")
    @SerializedName("team_assigned")
    val assignedTeam: String?,
)
