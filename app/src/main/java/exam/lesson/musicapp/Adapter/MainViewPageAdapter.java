package exam.lesson.musicapp.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MainViewPageAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragmentArrayList=new ArrayList<>();
    private  ArrayList<String> arrayListTittle=new ArrayList<>();
    public MainViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }
    public  void addFragment(Fragment fragment,String title){
        fragmentArrayList.add(fragment);
        arrayListTittle.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return arrayListTittle.get(position);
    }
}
