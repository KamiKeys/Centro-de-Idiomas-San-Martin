package com.javieramado.centrodeidiomassanmartn

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment

class HorarioFragment : Fragment() {
    private var horario: ImageView? = null
    var isImageFitToScreen = false
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_horario, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        horario = view.findViewById(R.id.imgHorario)
        horario?.setImageResource(R.drawable.horario2021)
        horario?.setOnClickListener(View.OnClickListener {
            //TODO Mejorar
            if (isImageFitToScreen) {
                isImageFitToScreen = false
                horario?.setLayoutParams(ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT))
                horario?.setAdjustViewBounds(true)
            } else {
                isImageFitToScreen = true
                horario?.setLayoutParams(ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.MATCH_PARENT))
                horario?.setScaleType(ImageView.ScaleType.FIT_XY)
            }
        })
    }
}