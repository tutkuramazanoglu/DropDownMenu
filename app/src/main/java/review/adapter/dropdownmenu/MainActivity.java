package review.adapter.dropdownmenu;


//1-define dropdown
//What is the data that you want to show in the dropdown
//what is the layout of each individual row in the dropdown
//2-GET THE SPINNER FROM your xml file (findViewById)
//3-set the spinners adapter to the adapter to created in #1

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner pokemonSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pokemonSpinner=findViewById(R.id.spinnerPokemon);

        ArrayList<Pokemon>pokemonList=Utils.getPokemon();
        //Define adapter
        //line 27 is a wrong because pokemon variable is array list in line 24. Because consructor
        // wants to array of string as third parameter want but that take bunch of pokemon
//        ArrayAdapter<String>pokemonAdapter=new ArrayAdapter<String>(this,android.R.layout.
//                simple_spinner_item,pokemonList);

        //get pokemon name
//        ArrayAdapter<String>pokemonAdapter=new ArrayAdapter<String>(this,android.R.layout.
//                simple_spinner_item,Utils.getPokemonNames(pokemonList));

        //@To Do take two different variable that name and type

        PokemonAdapter pokemonAdapter=new PokemonAdapter(this,
                R.layout.spinner_row_layout_names_and_types, //how display each row
                pokemonList); //what display each row

        pokemonSpinner.setAdapter(pokemonAdapter);



    }
}