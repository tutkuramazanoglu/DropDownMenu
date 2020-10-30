package review.adapter.dropdownmenu;

import java.util.ArrayList;

public final class Utils {
    //it is private because you have only one connection
    private Utils(){}

    public static ArrayList<Pokemon> getPokemon(){
        ArrayList<Pokemon> pokemon=new ArrayList<>();
        pokemon.add(new Pokemon("pikachu","normal","pikachu",100));
        pokemon.add(new Pokemon("bullbasaur", "Normal", "bullbasaur", 80));
        pokemon.add(new Pokemon("Dratini", "Dragon", "dratini", 50));
        pokemon.add(new Pokemon("jigglypuff", "Normal", "jigglypuff", 75));
        return pokemon;
    }

    //need to create array of string then will add the names of all pokemon into the the array using getName()
    public static ArrayList<String> getPokemonNames(ArrayList<Pokemon> pokemonList){
        ArrayList<String> pokemonNames=new ArrayList<>();
        for(Pokemon currentPok:pokemonList){
            pokemonNames.add(currentPok.getName());
        }
        return pokemonNames;
    }
    public static ArrayList<String> getPokemonTypes(ArrayList<Pokemon> pokemonList){
        ArrayList<String> pokemonType=new ArrayList<>();
        for(Pokemon currentPok:pokemonList){
            pokemonType.add(currentPok.getType());
        }
        return pokemonType;
    }
}
