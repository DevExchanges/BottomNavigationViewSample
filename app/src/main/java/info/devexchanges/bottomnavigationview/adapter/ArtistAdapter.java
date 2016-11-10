package info.devexchanges.bottomnavigationview.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import info.devexchanges.bottomnavigationview.R;

public class ArtistAdapter extends RecyclerView.Adapter<ArtistAdapter.MyViewHolder> {

    private List<String> artists;

    public ArtistAdapter(List<String> artists) {
        this.artists = artists;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_artist, parent, false);

        return new MyViewHolder(itemView);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        holder.textView.setText(artists.get(position));
    }

    @Override
    public int getItemCount() {
        return artists.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public MyViewHolder(View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.artist);
        }
    }
}
