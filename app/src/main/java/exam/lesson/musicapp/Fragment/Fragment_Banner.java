package exam.lesson.musicapp.Fragment;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

import exam.lesson.musicapp.Adapter.BannerAdapter;
import exam.lesson.musicapp.Model.QuangCao;
import exam.lesson.musicapp.R;
import exam.lesson.musicapp.Service.APIService;
import exam.lesson.musicapp.Service.DataService;
import me.relex.circleindicator.CircleIndicator;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fragment_Banner extends Fragment {
    View view;
    ViewPager viewPager;
    CircleIndicator circleIndicator;
    BannerAdapter bannerAdapter;
    Runnable runnable;
    Handler handler;
    int currentItem;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_banner,container,false);
        anhxa();
        getData();
        return view;
    }
    private void anhxa(){
        viewPager=view.findViewById(R.id.viewpager);
        circleIndicator=view.findViewById(R.id.indicator);
    }

    private  void  getData(){
        DataService dataService=APIService.getService();
        Call<List<QuangCao>> callback=dataService.GetDataBanner();
        callback.enqueue(new Callback<List<QuangCao>>() {
            @Override
            public void onResponse(Call<List<QuangCao>> call, Response<List<QuangCao>> response) {
                ArrayList<QuangCao> banners=(ArrayList<QuangCao>)response.body();
                Log.d("MSG",banners.get(0).getNoidung());
            }

            @Override
            public void onFailure(Call<List<QuangCao>> call, Throwable t) {

            }
        });
    }
}
