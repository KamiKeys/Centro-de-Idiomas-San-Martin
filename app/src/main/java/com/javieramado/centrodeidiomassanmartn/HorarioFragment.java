package com.javieramado.centrodeidiomassanmartn;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class HorarioFragment extends Fragment {

    private ImageView horario;
    boolean isImageFitToScreen;

    public HorarioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_horario, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        horario = view.findViewById(R.id.imgHorario);
        horario.setImageResource(R.drawable.horario2021);
        horario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Mejorar
                if(isImageFitToScreen) {
                    isImageFitToScreen=false;
                    horario.setLayoutParams(new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT));
                    horario.setAdjustViewBounds(true);
                }else{
                    isImageFitToScreen=true;
                    horario.setLayoutParams(new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.MATCH_PARENT));
                    horario.setScaleType(ImageView.ScaleType.FIT_XY);
                }
            }
        });
    }
}
