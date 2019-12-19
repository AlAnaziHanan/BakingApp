package com.example.bakingapp.Models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class recipeModel  {
    @SerializedName ( "id" )
    @Expose
    private int Id;
    @SerializedName ( "name" )
    @Expose
    private String title;
    @SerializedName ( "ingredients" )
    @Expose
    private ArrayList<ingredients> ingredients;
    @SerializedName ( "steps" )
    @Expose
    private ArrayList<steps> steps;
    @SerializedName ( "servings" )
    @Expose
    private int servings;
    @SerializedName ( "image" )
    @Expose
    private String image;


    public recipeModel ( int id , String title , ArrayList<com.example.bakingapp.Models.ingredients> ingredients , ArrayList<com.example.bakingapp.Models.steps> steps , int servings , String image ) {
        Id=id;
        this.title=title;
        this.ingredients=ingredients;
        this.steps=steps;
        this.servings=servings;
        this.image=image;
    }

    /*Constructors*/
    public recipeModel ( int id , String title , int servings , String image , ArrayList<ingredients> ingredients , ArrayList<steps> steps ) {
        Id=id;
        this.title=title;
        this.servings=servings;
        this.image=image;
        this.ingredients=ingredients;
        this.steps=steps;
    }

    public recipeModel (  ) {

    }

    /*Setter and Getter*/

    public int getId () {
        return Id;
    }

    public void setId ( int id ) {
        Id=id;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle ( String title ) {
        this.title=title;
    }

    public ArrayList<com.example.bakingapp.Models.ingredients> getIngredients () {
        return ingredients;
    }

    public void setIngredients ( ArrayList<com.example.bakingapp.Models.ingredients> ingredients ) {
        this.ingredients=ingredients;
    }

    public ArrayList<com.example.bakingapp.Models.steps> getSteps () {
        return steps;
    }

    public void setSteps ( ArrayList<com.example.bakingapp.Models.steps> steps ) {
        this.steps=steps;
    }

    public int getServings () {
        return servings;
    }

    public void setServings ( int servings ) {
        this.servings=servings;
    }

    public String getImage () {
        return image;
    }

    public void setImage ( String image ) {
        this.image=image;
    }
}
