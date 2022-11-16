package exam.lesson.musicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import exam.lesson.musicapp.Adapter.MainViewPageAdapter;
import exam.lesson.musicapp.Fragment.Fragment_List_Music;
import exam.lesson.musicapp.Fragment.Fragment_TimKiem;
import exam.lesson.musicapp.Fragment.Fragment_TrangChu;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.myTablayout);
        viewPager=findViewById(R.id.myViewpager);
        MainViewPageAdapter mainViewPageAdapter=new MainViewPageAdapter(getSupportFragmentManager());
        mainViewPageAdapter.addFragment(new Fragment_TrangChu(),"Trang chủ");
        mainViewPageAdapter.addFragment(new Fragment_TimKiem(),"Tìm kiếm");
        mainViewPageAdapter.addFragment(new Fragment_List_Music(),"Danh sách nhạc");
        viewPager.setAdapter(mainViewPageAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.img_1);
        tabLayout.getTabAt(1).setIcon(R.drawable.inconsearch);
        tabLayout.getTabAt(2).setIcon(R.drawable.iconadd);
    }
}