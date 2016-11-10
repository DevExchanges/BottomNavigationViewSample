package info.devexchanges.bottomnavigationview.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import info.devexchanges.bottomnavigationview.R;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.MyViewHolder> {

    private List<String> albums;

    public AlbumAdapter(List<String> albums) {
        this.albums = albums;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_album, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        holder.textView.setText(albums.get(position));
    }

    @Override
    public int getItemCount() {
        return albums.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public MyViewHolder(View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.text);
        }
    }
}