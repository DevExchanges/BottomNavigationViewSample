package info.devexchanges.bottomnavigationview;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import info.devexchanges.bottomnavigationview.fragment.AlbumsFragment;
import info.devexchanges.bottomnavigationview.fragment.ArtistsFragment;
import info.devexchanges.bottomnavigationview.fragment.GenresFragment;
import info.devexchanges.bottomnavigationview.fragment.SongsFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.artist:
                        fragment = new ArtistsFragment();
                        break;
                    case R.id.genre:
                        fragment = new GenresFragment();
                        break;
                    case R.id.album:
                        fragment = new AlbumsFragment();
                        break;
                    case R.id.songs:
                        fragment = new SongsFragment();
                        break;
                    default:
                        break;
                }
                if (fragment != null) {
                    replaceFragment(fragment);
                }
                return true;
            }
        });

        //replace SongsFragment
        replaceFragment(new SongsFragment());
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment, fragment);
        fragmentTransaction.commit();
    }
}
