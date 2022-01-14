package com.example.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawer;
    TabLayout tab;
    androidx.appcompat.widget.Toolbar tol;
    NavigationView navbar;
    ActionBarDrawerToggle hamburger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawer = (DrawerLayout) findViewById(R.id.drawer);
        tab = (TabLayout) findViewById(R.id.tablayout);
        tol = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar);
        navbar = (NavigationView) findViewById(R.id.navbar);

        hamburger = new ActionBarDrawerToggle(this,drawer, tol,R.string.open,R.string.close);
        drawer.addDrawerListener(hamburger);
        hamburger.syncState();
        tol.setNavigationIcon(R.drawable.ic_list_view);
        HomeFragment home = new HomeFragment();
        FragmentTransaction h = getSupportFragmentManager().beginTransaction();
        h.replace(R.id.placeholder,home).commit();

        navbar.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.one :
                        HomeFragment home = new HomeFragment();
                        FragmentTransaction h = getSupportFragmentManager().beginTransaction();
                        h.replace(R.id.placeholder,home).commit();
                        break;
                    case R.id.two :
                        ServicesFragment services = new ServicesFragment();
                        FragmentTransaction s = getSupportFragmentManager().beginTransaction();
                        s.replace(R.id.placeholder,services).commit();
                        break;
                    case R.id.three:
                        VoucherFragment voucher = new VoucherFragment();
                        FragmentTransaction v = getSupportFragmentManager().beginTransaction();
                        v.replace(R.id.placeholder,voucher).commit();
                        break;
                    case R.id.four :
                        FeedbackFragment feedback = new FeedbackFragment();
                        FragmentTransaction fb = getSupportFragmentManager().beginTransaction();
                        fb.replace(R.id.placeholder,feedback).commit();
                        break;
                    case R.id.five :
                        ContactFragment contact = new ContactFragment();
                        FragmentTransaction c = getSupportFragmentManager().beginTransaction();
                        c.replace(R.id.placeholder,contact).commit();
                        break;

                }



                drawer.closeDrawer(GravityCompat.START);
                return true;
            }
        });
        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch(tab.getPosition()){
                    case 0:
                        HomeFragment home = new HomeFragment();
                        FragmentTransaction h = getSupportFragmentManager().beginTransaction();
                        h.replace(R.id.placeholder,home).commit();
                        break;
                    case 1:
                        ServicesFragment services = new ServicesFragment();
                        FragmentTransaction s = getSupportFragmentManager().beginTransaction();
                        s.replace(R.id.placeholder,services).commit();
                        break;
                    case 2:
                        VoucherFragment voucher = new VoucherFragment();
                        FragmentTransaction v = getSupportFragmentManager().beginTransaction();
                        v.replace(R.id.placeholder,voucher).commit();
                        break;
                    case 3:
                        FeedbackFragment feedback = new FeedbackFragment();
                        FragmentTransaction fb = getSupportFragmentManager().beginTransaction();
                        fb.replace(R.id.placeholder,feedback).commit();
                        break;
                    case 4:
                        ContactFragment contact = new ContactFragment();
                        FragmentTransaction c = getSupportFragmentManager().beginTransaction();
                        c.replace(R.id.placeholder,contact).commit();
                        break;

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

}