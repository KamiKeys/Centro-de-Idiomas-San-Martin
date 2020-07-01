package com.javieramado.centrodeidiomassanmartn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.javieramado.centrodeidiomassanmartn.R;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class HomeFragment extends Fragment {

    private int[] fotos = new int[] {
            R.drawable.photo_1, R.drawable.photo_2, R.drawable.photo_3, R.drawable.photo_4, R.drawable.photo_5, R.drawable.photo_6,
            R.drawable.photo_7, R.drawable.photo_8, R.drawable.photo_9, R.drawable.photo_10, R.drawable.photo_11, R.drawable.photo_12,
            R.drawable.photo_13, R.drawable.photo_14, R.drawable.photo_15, R.drawable.photo_16, R.drawable.photo_17, R.drawable.photo_18, R.drawable.photo_19,
            R.drawable.photo_20, R.drawable.photo_21
    };

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CarouselView carouselView = view.findViewById(R.id.carrusel);
        carouselView.setPageCount(fotos.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(fotos[position]);
            }
        });
    }
}
