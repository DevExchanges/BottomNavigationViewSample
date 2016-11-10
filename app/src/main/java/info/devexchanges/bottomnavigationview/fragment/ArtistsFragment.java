package info.devexchanges.bottomnavigationview.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import info.devexchanges.bottomnavigationview.R;
import info.devexchanges.bottomnavigationview.adapter.ArtistAdapter;

public class ArtistsFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArtistAdapter artistAdapter;
    private ArrayList<String> artists;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        artists = new ArrayList<>();
        artists.add("Đan Trường");
        artists.add("Mỹ Tâm");
        artists.add("Mỹ Linh");
        artists.add("Đàm Vĩnh Hưng");
        artists.add("Bằng Kiều");
        artists.add("Lương Bằng Quang");
        artists.add("Tuấn Hưng");
        artists.add("Khởi My");
        artists.add("Lệ Quyên");
        artists.add("Quang Lê");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_artists, container, false);
        recyclerView = (RecyclerView)root.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        artistAdapter = new ArtistAdapter(artists);
        recyclerView.setAdapter(artistAdapter);

        return root;
    }
}
