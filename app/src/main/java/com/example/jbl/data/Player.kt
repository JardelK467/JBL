package com.example.jbl.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Player(
    @PrimaryKey val id: Int?,
    @ColumnInfo (name = "first_name") val firstName: String?,
    @ColumnInfo (name = "last_name") val lastName: String?,
    @ColumnInfo (name = "height") val height: String?,
    @ColumnInfo (name = "team_assigned") val assignedTeam: String?
)
