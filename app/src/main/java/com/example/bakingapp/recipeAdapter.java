package com.example.bakingapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bakingapp.Models.recipeModel;

import java.util.List;

class recipeAdapter extends RecyclerView.Adapter<recipe_ViewHolder> {

    private  List<recipeModel> recipe;

    public recipeAdapter ( Context context , List<recipeModel> recipe ) {
        this.recipe=recipe;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView title;

        public ViewHolder ( @NonNull View itemView ) {
            super ( itemView );
        }
    }
    @NonNull
    @Override
    public recipe_ViewHolder onCreateViewHolder ( @NonNull ViewGroup parent , int viewType ) {
        @SuppressLint("InflateParams") View view=LayoutInflater.from ( parent.getContext() ).inflate ( R.layout.row , null);

        return new recipe_ViewHolder ( view );
    }

    @Override
    public void onBindViewHolder ( @NonNull recipe_ViewHolder holder , int position ) {

        holder.recipeTitle.setText ( recipe.get ( position ) .getTitle ());

    }

    @Override
    public int getItemCount () {
        return recipe.size ();
    }
}
