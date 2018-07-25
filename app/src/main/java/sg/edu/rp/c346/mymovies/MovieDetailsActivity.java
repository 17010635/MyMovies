package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.Calendar;


public class MovieDetailsActivity extends AppCompatActivity {
    TextView tvTitle, tvYear, tvGenre, tvWatch, tvDescription, tvTheatre;
    ImageView ivRated;
    RatingBar rbStar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_details);

        ivRated=findViewById(R.id.imageView);
        tvTitle=findViewById(R.id.textViewTitle);
        tvYear=findViewById(R.id.textViewYear);
        tvGenre=findViewById(R.id.textViewGenre);
        tvDescription=findViewById(R.id.textViewDescription);
        tvWatch=findViewById(R.id.textViewWatch);
        tvTheatre=findViewById(R.id.textViewTheatre);
        rbStar = findViewById(R.id.ratingBar);

        Intent intentRecieved = getIntent();
        String displayTitle = intentRecieved.getStringExtra("title");
        String displayYear = intentRecieved.getStringExtra("year");
        String displayGenre = intentRecieved.getStringExtra("genre");
        String displayDate = intentRecieved.getStringExtra("date");
        String displayTheater = intentRecieved.getStringExtra("theater");
        String displayDescription = intentRecieved.getStringExtra("description");
        String displayRated = intentRecieved.getStringExtra("rated");
        int displayStar = intentRecieved.getIntExtra("star", 0);
        tvTitle.setText(displayTitle);
        tvYear.setText(displayYear + "-");
        tvGenre.setText(displayGenre);

        tvDescription.setText("\n"+ displayDescription + "\n");
        tvWatch.setText("Watch on: " + displayDate);
        tvTheatre.setText("In Theatre: " + displayTheater);
        rbStar.setRating(displayStar);
        if (displayRated.equalsIgnoreCase("g")){
            ivRated.setImageResource(R.drawable.rating_g);
        } else if (displayRated.equalsIgnoreCase("pg")){
            ivRated.setImageResource(R.drawable.rating_pg);
        } else if (displayRated.equalsIgnoreCase("pg13")){
            ivRated.setImageResource(R.drawable.rating_pg13);
        } else if(displayRated.equalsIgnoreCase("nc16")){
            ivRated.setImageResource(R.drawable.rating_nc16);
        } else if (displayRated.equalsIgnoreCase("m18")){
            ivRated.setImageResource(R.drawable.rating_m18);
        } else {
            ivRated.setImageResource(R.drawable.rating_r21);
        }
    }
}
