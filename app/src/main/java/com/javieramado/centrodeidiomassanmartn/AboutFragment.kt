package com.javieramado.centrodeidiomassanmartn

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vansuita.materialabout.builder.AboutBuilder

class AboutFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return AboutBuilder.with(context)
                .setPhoto(R.drawable.perfil)
                .setCover(R.drawable.bannerdev)
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
                .build()
    }
}