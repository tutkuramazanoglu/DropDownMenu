package review.adapter.dropdownmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class PokemonAdapter extends ArrayAdapter<Pokemon> {

    //create a copy of source
    ArrayList<Pokemon>pokemon;
    public PokemonAdapter(@NonNull Context context, int resource, @NonNull List<Pokemon> objects) {
        super(context, resource, objects);
        //intialize the class variables
        this.pokemon=(ArrayList<Pokemon>) objects;
    }

    //this function handles what the UI of the dropdown looks like
    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return this.getView(position,convertView, parent);
    }

    //this function that controls what data goes into each UI component
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //1-get to data that should go into single row of the view
        Pokemon pokemon=this.pokemon.get(position);
        //2-add to template code to check if a view already exist
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.spinner_row_layout_names_and_types, parent,false);
        }


        ////3-tell android which data goes in each UI component
        TextView tv1=convertView.findViewById(R.id.tvName);
        TextView tv2=convertView.findViewById(R.id.tvType);
        ImageView img1=convertView.findViewById(R.id.imageView);
        //get image
        int id = this.getContext()
                .getResources()
                .getIdentifier(
                        pokemon.getImage(),
                        "drawable",
                        getContext().getPackageName()
                );
        img1.setImageResource(id);
        tv1.setText(pokemon.getName());
        tv2.setText(pokemon.getType());
        //4-return the completed view
        return convertView;
    }
}
