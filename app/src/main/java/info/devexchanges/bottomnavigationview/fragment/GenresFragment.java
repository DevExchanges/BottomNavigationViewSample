package info.devexchanges.bottomnavigationview.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import info.devexchanges.bottomnavigationview.R;

public class GenresFragment extends Fragment {

    private ListView listView;
    private ArrayList<String> genres;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        genres = new ArrayList<>();
        genres.add("Cantopop");
        genres.add("Alternative Rock");
        genres.add("Dance/Electronic");
        genres.add("Classical");
        genres.add("Jazz");
        genres.add("RAP");
        genres.add("K-Pop");
        genres.add("Rock");
        genres.add("R&B");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_genres, container, false);
        listView = (ListView) rootView.findViewById(R.id.list);

        ArrayAdapter<String> genresAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_activated_1, genres);
        listView.setAdapter(genresAdapter);

        return rootView;
    }
}
