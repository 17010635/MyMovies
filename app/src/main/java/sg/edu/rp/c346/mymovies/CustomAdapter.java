package sg.edu.rp.c346.mymovies;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<MovieItem> movieList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MovieItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false); // Inflate a new view hierarchy from the specified XML node.

        TextView tvName = rowView.findViewById(R.id.textViewTitle);
        TextView tvYear = rowView.findViewById(R.id.textViewYear);
        TextView tvGenre = rowView.findViewById(R.id.textViewGenre);
        ImageView ivRated = rowView.findViewById(R.id.imageViewRated);

        MovieItem currentItem = movieList.get(position);

        tvName.setText(currentItem.getMovieName());
        tvYear.setText(currentItem.getYear());
        tvGenre.setText(currentItem.getGenre());

        if (currentItem.getRated().equalsIgnoreCase("g")){
            ivRated.setImageResource(R.drawable.rating_g);
        } else if (currentItem.getRated().equalsIgnoreCase("pg")){
            ivRated.setImageResource(R.drawable.rating_pg);
        } else if (currentItem.getRated().equalsIgnoreCase("pg13")){
            ivRated.setImageResource(R.drawable.rating_pg13);
        } else if(currentItem.getRated().equalsIgnoreCase("nc16")){
            ivRated.setImageResource(R.drawable.rating_nc16);
        } else if (currentItem.getRated().equalsIgnoreCase("m18")){
            ivRated.setImageResource(R.drawable.rating_m18);
        } else {
            ivRated.setImageResource(R.drawable.rating_r21);
        }

        return rowView;
    }
}
