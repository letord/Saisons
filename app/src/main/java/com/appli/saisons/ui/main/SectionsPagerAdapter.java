package com.appli.saisons.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.appli.saisons.R;

import java.util.Locale;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.saison_printemps, R.string.saison_été, R.string.saison_automne,R.string.saison_hiver};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return SaisonFragment.newInstance(0, mContext.getString(R.string.titre_section0));
            case 1:
                return SaisonFragment.newInstance(1, mContext.getString(R.string.saison_été));
            case 2:
                return SaisonFragment.newInstance(2, mContext.getString(R.string.saison_automne));
            case 3:
                return SaisonFragment.newInstance(3, mContext.getString(R.string.saison_hiver));
            case 4:
                return TouteSaison.newInstance(4, mContext.getString(R.string.saison_saison));
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return mContext.getString(R.string.saison_printemps).toUpperCase(l);
            case 1:
                return mContext.getString(R.string.saison_été).toUpperCase(l);
            case 2:
                return mContext.getString(R.string.saison_automne).toUpperCase(l);
            case 3:
                return mContext.getString(R.string.saison_hiver).toUpperCase(l);
            case 4:
                return mContext.getString(R.string.saison_saison).toUpperCase(l);
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 5 total pages.
        return 5;
    }
}