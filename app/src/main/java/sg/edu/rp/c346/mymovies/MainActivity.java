package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<Movie> movieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie);

        movieList = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2014,11,15);
        Calendar date2 = Calendar.getInstance();
        date2.set(2015,4,15);
        Movie item1 = new Movie("The Avengers", "2012", "pg13", "Action | Sci-Fi", date1,
                "Golden Village - Bishan", "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.", 4);
        Movie item2 = new Movie("Planes", "2013", "pg", "Animation | Comedy", date2,
                "Cathay - AMK Hub", "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.", 2);
        movieList.add(item1);
        movieList.add(item2);

        caMovie = new CustomAdapter(this, R.layout.movie_item, movieList);

        lvMovie.setAdapter(caMovie);
        lvMovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(getBaseContext(), MovieDetails.class);
                Movie currentMovie = movieList.get(position);
                intent.putExtra("title", currentMovie.getTitle());
                intent.putExtra("year", currentMovie.getYear());
                intent.putExtra("rated", currentMovie.getRated());
                intent.putExtra("genre", currentMovie.getGenre());
                intent.putExtra("date", getDateString(currentMovie.getWatchOn()));
                intent.putExtra("theatre", currentMovie.getIn_theatre());
                intent.putExtra("des", currentMovie.getDescription());
                intent.putExtra("rating", currentMovie.getRating());
                startActivity(intent);
            }
        });
    }
    public static String getDateString(Calendar date) {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);
        return str;
    }
}
