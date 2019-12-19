package com.example.bakingapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recipe_ViewHolder extends RecyclerView.ViewHolder {


     TextView recipeTitle;

    public recipe_ViewHolder ( @NonNull View itemView ) {
        super ( itemView );

        this.recipeTitle=itemView.findViewById ( R.id.recipe_Title );
    }
}
