package sg.edu.rp.c346.mymovies;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {


    Context parent_context;
    int layout_id;
    ArrayList<Movie> movieList;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Movie> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvGenre = rowView.findViewById(R.id.textViewGenre);
        TextView tvYear = rowView.findViewById(R.id.textViewYear);
        ImageView ivRating = rowView.findViewById(R.id.imageViewRating);

        Movie currentItem = movieList.get(position);

        tvTitle.setText(currentItem.getTitle());
        tvGenre.setText(currentItem.getGenre());
        tvYear.setText(currentItem.getYear() + " - ");

        String rated = currentItem.getRated();

        if (rated == "g"){
            ivRating.setImageResource(R.drawable.rating_g);
        } else if (rated == "pg"){
            ivRating.setImageResource(R.drawable.rating_pg);
        } else if (rated == "pg13"){
            ivRating.setImageResource(R.drawable.rating_pg13);
        } else if (rated == "nc16"){
            ivRating.setImageResource(R.drawable.rating_nc16);
        } else if (rated == "m18"){
            ivRating.setImageResource(R.drawable.rating_m18);
        } else if (rated == "r21"){
            ivRating.setImageResource(R.drawable.rating_r21);
        }

        return rowView;
    }
}
