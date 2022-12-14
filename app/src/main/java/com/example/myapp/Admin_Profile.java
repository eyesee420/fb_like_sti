package com.example.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.myapp.databinding.ActivityAdminEventsBinding;
import com.example.myapp.databinding.ActivityAdminProfileBinding;
import com.google.android.material.navigation.NavigationBarView;

public class Admin_Profile extends AppCompatActivity {


    ActivityAdminProfileBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_admin_profile);

        binding = ActivityAdminProfileBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.bottomNavigationAdmin.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext(), Admin_home.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;

                    case R.id.nav_events:

                        startActivity(new Intent(getApplicationContext(), Admin_Events.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;

                    case R.id.nav_anouncements:
                        startActivity(new Intent(getApplicationContext(), Admin_Anouncements.class));
                        overridePendingTransition(0, 0);
                        finish();

                        return true;

                    case R.id.nav_profile:
                        return true;
                }
                return false;
            }
        });

    }
}