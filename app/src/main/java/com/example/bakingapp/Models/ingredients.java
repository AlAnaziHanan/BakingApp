package com.example.bakingapp.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class ingredients {
    @SerializedName( "quantity" )
    @Expose
    private int quantity;

    @SerializedName( "measure" )
    @Expose
    private String measure;

    @SerializedName( "ingredient" )
    @Expose
    private String ingredient;


    public ingredients ( int quantity , String measure , String ingredient ) {
        this.quantity=quantity;
        this.measure=measure;
        this.ingredient=ingredient;
    }

    public int getQuantity () {
        return quantity;
    }

    public void setQuantity ( int quantity ) {
        this.quantity=quantity;
    }

    public String getMeasure () {
        return measure;
    }

    public void setMeasure ( String measure ) {
        this.measure=measure;
    }

    public String getIngredient () {
        return ingredient;
    }

    public void setIngredient ( String ingredient ) {
        this.ingredient=ingredient;
    }
}
