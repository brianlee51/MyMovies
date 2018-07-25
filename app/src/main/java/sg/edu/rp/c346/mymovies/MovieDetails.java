package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MovieDetails extends AppCompatActivity {

    TextView tvTitle, tvYear, tvGenre, tvDescription, tvWatched, tvTheatre;
    ImageView ratedP;
    RatingBar ratings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        tvTitle = findViewById(R.id.textViewTitle);
        tvYear = findViewById(R.id.textViewYear);
        tvGenre = findViewById(R.id.textViewGenre);
        tvDescription = findViewById(R.id.textViewDescription);
        tvTheatre = findViewById(R.id.textViewTheatre);
        tvWatched = findViewById(R.id.textViewWatchedOn);
        ratedP = findViewById(R.id.imageViewRating);
        ratings = findViewById(R.id.ratingBar);

        Intent intentReceived = getIntent();
        String title = intentReceived.getStringExtra("title");
        String year = intentReceived.getStringExtra("year");
        String genre = intentReceived.getStringExtra("genre");
        String theatre = intentReceived.getStringExtra("theatre");
        String desc = intentReceived.getStringExtra("des");
        String date = intentReceived.getStringExtra("date");
        String rated = intentReceived.getStringExtra("rated");
        int rating = intentReceived.getIntExtra("rating",0);

        tvTitle.setText(title);
        tvYear.setText(year+" - ");
        tvGenre.setText(genre);
        tvDescription.setText(desc);
        tvTheatre.setText("In theatre: " + theatre);
        tvWatched.setText("Watch on: " + date);
        ratings.setRating(rating);

        if (rated == "g"){
            ratedP.setImageResource(R.drawable.rating_g);
        } else if (rated == "pg"){
            ratedP.setImageResource(R.drawable.rating_pg);
        } else if (rated == "pg13"){
            ratedP.setImageResource(R.drawable.rating_pg13);
        } else if (rated == "nc16"){
            ratedP.setImageResource(R.drawable.rating_nc16);
        } else if (rated == "m18"){
            ratedP.setImageResource(R.drawable.rating_m18);
        } else if (rated == "r21"){
            ratedP.setImageResource(R.drawable.rating_r21);
        }
    }
}
