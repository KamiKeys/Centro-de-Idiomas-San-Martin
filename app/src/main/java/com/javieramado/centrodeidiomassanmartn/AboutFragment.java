package com.javieramado.centrodeidiomassanmartn;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vansuita.materialabout.builder.AboutBuilder;
import com.vansuita.materialabout.views.AboutView;

public class AboutFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        AboutView vista = AboutBuilder.with(getContext())
                .setPhoto(R.mipmap.ic_perfildev_foreground)
                .setCover(R.mipmap.ic_banner_foreground)
                .setName("C. Javier Miguel Amado")
                .setSubTitle("Android Developer")
                .setAppIcon(R.mipmap.ic_launcher_round)
                .setAppName(R.string.app_name)
                .addGitHubLink("KamiKeys")
                .addTwitterLink("JavierAmadoM")
                .addInstagramLink("javieramadom")
                .addLinkedInLink("https://www.linkedin.com/in/javier-miguel-amado/")
                .addFiveStarsAction()
                .setVersionNameAsAppSubTitle()
                .addShareAction(R.string.app_name)
                .setWrapScrollView(true)
                .setLinksAnimated(true)
                .setShowAsCard(true)
                .build();

        return vista;
    }
}
