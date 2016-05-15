package com.example.gjbsilva.projetofinalaplicativosmobile.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.gjbsilva.projetofinalaplicativosmobile.PlaceholderFragment;
import com.example.gjbsilva.projetofinalaplicativosmobile.fragments.FragmentContatos;
import com.example.gjbsilva.projetofinalaplicativosmobile.fragments.FragmentFavoritos;
import com.example.gjbsilva.projetofinalaplicativosmobile.fragments.FragmentHistorico;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    //private String[] mTabTitles;

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
        //this.mTabTitles = mTabTitles;
    }

    @Override
    public Fragment getItem(int position) {
        //return PlaceholderFragment.newInstance(position + 1);
        switch (position){
            case 0:
                return new FragmentContatos();
            case 1:
                return new FragmentFavoritos();
            case 2:
                return new FragmentHistorico();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
        //return this.mTabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Contatos";
            case 1:
                return "Favoritos";
            case 2:
                return "Histórico";
        }
        return null;
        //return this.mTabTitles[position];
    }
}
