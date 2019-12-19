package com.example.bakingapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bakingapp.Models.recipeModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @BindView ( R.id.recipe_Title )
    TextView title;

    private List<recipeModel> recipesList;
    @Override
    public void onCreate ( @Nullable Bundle savedInstanceState  ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        ButterKnife.bind ( this );
        title=findViewById ( R.id.recipe_Title );


        RecyclerView recyclerView=findViewById ( R.id.recyclerView );
        recyclerView.setLayoutManager ( new LinearLayoutManager ( this ) );

        com.example.bakingapp.recipeAdapter recipeAdapter=new recipeAdapter ( this , getRecipeList () );
        recyclerView.setAdapter ( recipeAdapter );
    }

    private List<recipeModel> getRecipeList () {

        /*Build retrofit object*/
        Retrofit retrofit = RetrofitClientInstance.getRetrofit ();

        getService getService = retrofit.create ( getService.class );

        Call<List<recipeModel>> call = getService.getRecipes ();

        call.enqueue ( new Callback<List<recipeModel>> () {

            @Override
            public void onResponse ( Call<List<recipeModel>> call , Response<List<recipeModel>> response ) {
                if (!response.isSuccessful ()){

                    return;
                }
                recipesList = response.body ();
                recipeModel recipe=new recipeModel ();
                //for(int i=0; i<recipesList.size ();i++){}


                title.setText ( recipe.getTitle () );
                recipesList.add ( recipe );
            }


            @Override
            public void onFailure ( Call<List<recipeModel>> call , Throwable t ) {
                Toast.makeText ( getApplicationContext () , t.getMessage () , Toast.LENGTH_SHORT ).show ();
            }
        } );

        return recipesList;
    }



}
