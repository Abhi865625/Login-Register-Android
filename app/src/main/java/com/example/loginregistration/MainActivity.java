package com.example.loginregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Replace the initial fragment with the LoginFragment
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new LoginFragment())
                    .commit();
        }
    }

    public void openLoginSuccessfulFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new LoginSuccessfulFragment())
                .addToBackStack(null)
                .commit();
    }

    public void openRegistrationFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new RegistrationFragment())
                .addToBackStack(null)
                .commit();
    }
}