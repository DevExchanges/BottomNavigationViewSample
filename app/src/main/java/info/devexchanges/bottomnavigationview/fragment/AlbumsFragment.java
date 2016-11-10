package info.devexchanges.bottomnavigationview.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import info.devexchanges.bottomnavigationview.R;
import info.devexchanges.bottomnavigationview.adapter.AlbumAdapter;

public class AlbumsFragment extends Fragment {

    private RecyclerView recyclerView;
    private AlbumAdapter albumAdapter;
    private ArrayList<String> albums;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        albums = new ArrayList<>();
        albums.add("Đổi thay - Hồ Quang Hiếu");
        albums.add("Kỷ niệm - Lệ Quyên");
        albums.add("Glory - Britney Spears");
        albums.add("Views - Drake");
        albums.add("Why so lonely - Wonder Girls");
        albums.add("Đừng nghe khi buồn - Various Artists");
        albums.add("Thương - Karik");
        albums.add("Cơn mưa cuối - Justatee");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_artists, container, false);
        recyclerView = (RecyclerView)root.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);

        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(layoutManager);
        albumAdapter = new AlbumAdapter(albums);
        recyclerView.setAdapter(albumAdapter);

        return root;
    }
}
