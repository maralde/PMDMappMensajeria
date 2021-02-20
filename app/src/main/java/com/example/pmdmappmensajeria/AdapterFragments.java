package com.example.pmdmappmensajeria;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class AdapterFragments extends FragmentPagerAdapter {

    private Context contexto;

    public AdapterFragments(Context context, FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        contexto = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position){
        if(position == 0){
            return new Ejercicio1();
        } else if(position == 1){
            return new Ejercicio2();
        } else {
            return new Ejercicio3();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position){
        if(position == 0){
            return "EJERCICO 1";
        } else if(position == 1){
            return "EJERCICIO 2";
        } else {
            return "EJERCICIO 3";
        }
    }
}
