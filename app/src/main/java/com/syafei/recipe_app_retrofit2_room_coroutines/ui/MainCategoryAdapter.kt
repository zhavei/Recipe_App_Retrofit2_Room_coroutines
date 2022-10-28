package com.syafei.recipe_app_retrofit2_room_coroutines.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syafei.recipe_app_retrofit2_room_coroutines.R
import com.syafei.recipe_app_retrofit2_room_coroutines.data.local.Recipes

class MainCategoryAdapter(val context: Context) :
    RecyclerView.Adapter<MainCategoryAdapter.MainViewHolder>() {

    var arrMainCategory = ArrayList<Recipes>()

    inner class MainViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    fun setData(arrData: List<Recipes>){
        arrMainCategory = arrData as ArrayList<Recipes> /* = java.util.ArrayList<com.syafei.recipe_app_retrofit2_room_coroutines.data.local.Recipes> */
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_rv_main_category, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = arrMainCategory.size

}