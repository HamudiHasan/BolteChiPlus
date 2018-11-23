package com.amislab.boltechiplus.ui.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.amislab.boltechiplus.R;
import com.amislab.boltechiplus.ui.activity.MainActivity;

/**
 * Created by  Hasan Sonet on 11/20/2018
 */
public class FragmentLogin extends Fragment {


    public FragmentLogin() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_login, container, false);

        if (rootView != null) {

            rootView.findViewById(R.id.tv_signup_login).setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    FragmentSignUp fragmentSignUp = new FragmentSignUp();
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                            .replace(R.id.fragment_container_login, fragmentSignUp, "sign_up_frag")
                            .addToBackStack("login_frag")
                            .commit();
                }
            });

            rootView.findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getContext().startActivity(new Intent(getContext(), MainActivity.class));
                }
            });
        }

        return rootView;
    }
}
