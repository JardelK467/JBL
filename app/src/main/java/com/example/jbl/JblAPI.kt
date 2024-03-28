package com.example.jbl

import com.example.jbl.data.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/** **/
interface JblAPI {
    @GET("/players")
    suspend fun getAllPlayers(): List<Player>

    @GET("/teams")
    suspend fun getAllTeams(): List<Team>

    @GET("/divisions")
    suspend fun getAllDivisions(): List<Division>

    @GET("players/{id}")
    suspend fun getPlayerById(
        @Path("id")playerId: Int,
    ): Call<Player>

    @GET("teams/{id}")
    suspend fun getTeamById(
        @Path("id")teamId: Int,
    ): Call<Team>

    @GET("divisions/{id}")
    suspend fun getDivisionById(
        @Path("id")divisionId: Int,
    ): Call<Division>

    companion object {
        const val BASE_URL = "http://localhost:8080"
    }
}
