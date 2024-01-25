package com.example.jbl

import com.example.jbl.data.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface JblAPI {

    @GET("/players")
    suspend fun getAllPlayers(): List<Player>

    @GET("/teams")
    suspend fun getAllTeams(): List<Team>

    @GET("/divisions")
    suspend fun getAllDivisions(): List<Division>

    @GET("players/{id}")
    fun getPlayerById(@Path("id")playerId: Int): Call<Player>

    @GET("teams/{id}")
    fun getTeamById(@Path("id")teamId: Int): Call<Team>

    @GET("divisions/{id}")
    fun getDivisionById(@Path("id")divisionId: Int): Call<Division>
}
