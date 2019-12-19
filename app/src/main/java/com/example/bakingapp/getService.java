package com.example.bakingapp;

import com.example.bakingapp.Models.recipeModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

interface getService {

    String BASE_URL="https://d17h27t6h515a5.cloudfront.net/";

    /*second part of url*/
    @GET("topher/2017/May/59121517_baking/baking.json")
    Call<List<recipeModel>> getRecipes ( );

}
