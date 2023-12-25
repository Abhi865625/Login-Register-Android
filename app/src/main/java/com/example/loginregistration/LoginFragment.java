package com.example.loginregistration;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class LoginFragment extends Fragment {

    public LoginFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        Button signInButton = view.findViewById(R.id.sign_in_button);
        signInButton.setOnClickListener(v -> ((MainActivity) requireActivity()).openLoginSuccessfulFragment());

        Button registerButton = view.findViewById(R.id.register_button);
        registerButton.setOnClickListener(v -> ((MainActivity) requireActivity()).openRegistrationFragment());

        return view;
    }
}
