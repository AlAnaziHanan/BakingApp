package com.example.bakingapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class RetrofitClientInstance {

    private static Retrofit retrofit;
    //return instance
    public static  Retrofit getRetrofit(){
        /*Build retrofit object*/
        if(retrofit==null){
            Retrofit retrofit= new Retrofit.Builder ()
                    .baseUrl ( getService.BASE_URL )
                    .addConverterFactory ( GsonConverterFactory.create () )
                    .build ();
        }
        return retrofit;
    }

}
