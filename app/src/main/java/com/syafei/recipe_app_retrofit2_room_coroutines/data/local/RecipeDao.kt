package com.syafei.recipe_app_retrofit2_room_coroutines.data.local

import androidx.room.Query

interface RecipeDao {

    @Query("SELECT * FROM recipes ORDER BY id DESC")
    suspend fun getAllRecipes(): List<Recipes>

}