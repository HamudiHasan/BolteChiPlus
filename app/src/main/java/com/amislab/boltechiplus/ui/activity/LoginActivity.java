package com.amislab.boltechiplus.ui.activity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.amislab.boltechiplus.R;
import com.amislab.boltechiplus.ui.fragment.FragmentLogin;
import com.amislab.boltechiplus.ui.fragment.FragmentSignUp;

public class LoginActivity extends AppCompatActivity {

    private FragmentLogin fragLogin;
    private FragmentSignUp fragSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        fragLogin = new FragmentLogin();
        fragSignUp = new FragmentSignUp();

        // starting fragment that contains categories and items
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container_login, fragLogin
                , "login_frag").commit();
    }


}
