package com.the3hdmedia.IndianLaws;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;

import java.lang.reflect.Field;

public class HomeActivity extends AppCompatActivity {

    private FrameLayout frameLayout;
    private HomeFragment homeFragment;
    private CriminalLawFragment criminalLawFragment;
    private CorporateLawFragment corporateLawFragment;
    private CivilLawFragment civilLawFragment;
    private AboutFragment aboutFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        final BottomNavigationView navigationView = (BottomNavigationView) findViewById(R.id.bottomBar);
        frameLayout = (FrameLayout)findViewById(R.id.main_frame);
        homeFragment = new HomeFragment();
        criminalLawFragment = new CriminalLawFragment();
        corporateLawFragment = new CorporateLawFragment();
        civilLawFragment = new CivilLawFragment();
        aboutFragment = new AboutFragment();
        //Setting home fragment to load by default
        setFragment(homeFragment);



        BottomNavigationMenuView menuView = (BottomNavigationMenuView) navigationView.getChildAt(0);
        //code to disable shifitng mode
        for (int i = 0; i < menuView.getChildCount(); i++) {
            BottomNavigationItemView itemView = (BottomNavigationItemView) menuView.getChildAt(i);
            itemView.setShiftingMode(false);
            itemView.setChecked(false);

        }
        BottomNavigationViewHelper.removeShiftMode(navigationView);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            //code to execute when item of bottom navigation bar selected - linking fragments
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                switch(item.getItemId())
                {

                    case R.id.nav_home :
                        navigationView.setItemBackgroundResource(R.color.colorPrimary);
                        setFragment(homeFragment);
                        return true;

                    case R.id.nav_civil_law:
                        navigationView.setItemBackgroundResource(R.color.colorAccent);
                        setFragment(civilLawFragment);
                        return true;

                    case R.id.nav_corporate_law:
                        navigationView.setItemBackgroundResource(R.color.colorPrimary);
                        setFragment(corporateLawFragment);
                        return true;

                    case R.id.nav_criminal_law:
                        navigationView.setItemBackgroundResource(R.color.colorPrimary);
                        setFragment(criminalLawFragment);
                        return true;

                    case R.id.nav_about:
                        navigationView.setItemBackgroundResource(R.color.colorPrimary);
                        setFragment(aboutFragment);
                        return true;

                     default:
                         return false;








                }


            }

        }
        );



    }

    private void setFragment(android.support.v4.app.Fragment fragment)
    {
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame,fragment);
        fragmentTransaction.commit();
    }
}
//code to enable text labels
 class BottomNavigationViewHelper {

    @SuppressLint("RestrictedApi")
    public static void removeShiftMode(BottomNavigationView view) {
        BottomNavigationMenuView menuView = (BottomNavigationMenuView) view.getChildAt(0);
        try {
            Field shiftingMode = menuView.getClass().getDeclaredField("mShiftingMode");
            shiftingMode.setAccessible(true);
            shiftingMode.setBoolean(menuView, false);
            shiftingMode.setAccessible(false);
            for (int i = 0; i < menuView.getChildCount(); i++) {
                BottomNavigationItemView item = (BottomNavigationItemView) menuView.getChildAt(i);
                item.setShiftingMode(false);
                // set once again checked value, so view will be updated
                item.setChecked(item.getItemData().isChecked());
            }

        } catch (NoSuchFieldException e) {
            Log.e("ERROR NO SUCH FIELD", "Unable to get shift mode field");
        } catch (IllegalAccessException e) {
            Log.e("ERROR ILLEGAL ALG", "Unable to change value of shift mode");
        }
    }
    }
