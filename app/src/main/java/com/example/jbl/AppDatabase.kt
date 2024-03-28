package com.example.jbl

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.jbl.dao.DivisionDao
import com.example.jbl.dao.PlayerDao
import com.example.jbl.dao.TeamDao
import com.example.jbl.data.Player
import com.example.jbl.data.Team

@Database(entities = [Player::class, Team::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): PlayerDao

    abstract fun teamDao(): TeamDao

    abstract fun divisionDao(): DivisionDao
}
