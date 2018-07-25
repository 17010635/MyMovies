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
    ListView lvMovies;
    ArrayList<MovieItem> alMovieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovies = findViewById(R.id.listViewMovie);

        alMovieList = new ArrayList<>();
        MovieItem item1 = new MovieItem("The Avengers", "2012 ", " Action | Sci-Fi","pg13", "15/12/2014", "Golden Village - Bishan", "Nick fury of S.H.I.E.L.D assembles a team of superheroes to save the planet from Loki and his army.",4);
        MovieItem item2 = new MovieItem("Planes", "2013 ", " Animation | Comedy","pg","15/5/2015","Cathay - AMK Hub", "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.",2);
        alMovieList.add(item1);
        alMovieList.add(item2);

        caMovie = new CustomAdapter(this,R.layout.movie_item, alMovieList); //To use the CustomAdapter that is being created.

        lvMovies.setAdapter(caMovie);

        lvMovies.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intentDetail = new Intent(getBaseContext(), MovieDetailsActivity.class);
                MovieItem currentItem = alMovieList.get(position);

                intentDetail.putExtra("title",currentItem.getMovieName());
                intentDetail.putExtra("year",currentItem.getYear());
                intentDetail.putExtra("genre",currentItem.getGenre());
                intentDetail.putExtra("date",currentItem.getWatchedOn());
                intentDetail.putExtra("theater",currentItem.getInTheater());
                intentDetail.putExtra("description",currentItem.getDescription());
                intentDetail.putExtra("rated",currentItem.getRated());
                intentDetail.putExtra("star",currentItem.getStar());
                startActivity(intentDetail);
            }
        });
    }

}
