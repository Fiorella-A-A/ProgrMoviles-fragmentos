package com.miempresa.usofragmentosv4.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
import com.miempresa.usofragmentosv4.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AdicionalFragmento.newInstance] factory method to
 * create an instance of this fragment.
 */
class AdicionalFragmento : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View = inflater.inflate(R.layout.fragment_adicional_fragmento, container, false)
        var btnrespuesta = view.findViewById<Button>(R.id.btnRespuesta)
        btnrespuesta.setOnClickListener(View.OnClickListener {
            val respuesta = Respuesta()
            val transaccion: FragmentTransaction =
                requireActivity().supportFragmentManager.beginTransaction()
            transaccion.replace(R.id.contenedor1,respuesta)
            transaccion.commit()
        })
        var btnOperaciones = view.findViewById<Button>(R.id.btnOperaciones)
        btnOperaciones.setOnClickListener(View.OnClickListener {
            val operaciones = Operaciones()
            val transaccion: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaccion.replace(R.id.contenedor1,operaciones)
            transaccion.commit()
        })
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AdicionalFragmento.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AdicionalFragmento().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}