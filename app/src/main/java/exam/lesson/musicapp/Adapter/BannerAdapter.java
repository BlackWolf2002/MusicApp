package exam.lesson.musicapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import exam.lesson.musicapp.Model.QuangCao;
import exam.lesson.musicapp.R;

public class BannerAdapter extends PagerAdapter {
    Context context;
    ArrayList<QuangCao> arrayListBanner;

    public BannerAdapter(Context context, ArrayList<QuangCao> arrayListBanner) {
        this.context = context;
        this.arrayListBanner = arrayListBanner;
    }

    @Override
    public int getCount() {
        return arrayListBanner.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.dong_banner,null);

        ImageView imagebackgroundbanner=view.findViewById(R.id.imageBackgroundBanner);
        ImageView imgsongbanner=view.findViewById(R.id.imageViewBanner);
        TextView txtTitleSongBanner=view.findViewById(R.id.textViewTitleBaiHat);
        TextView txtNoiDung=view.findViewById(R.id.noiDungBaiHat);

        Picasso.with(context).load(arrayListBanner.get(position).getHinhanh()).into(imagebackgroundbanner);
        Picasso.with(context).load(arrayListBanner.get(position).getHinhBaiHat()).into(imgsongbanner);
        txtTitleSongBanner.setText(arrayListBanner.get(position).getTenBaiHat());
        txtNoiDung.setText(arrayListBanner.get(position).getNoidung());
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        super.destroyItem(container, position, object);
    }
}
