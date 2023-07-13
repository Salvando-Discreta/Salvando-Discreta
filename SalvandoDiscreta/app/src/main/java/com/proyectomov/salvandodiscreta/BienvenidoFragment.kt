package com.proyectomov.salvandodiscreta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.proyectomov.salvandodiscreta.databinding.FragmentBienvenidoBinding

class BienvenidoFragment : Fragment() {
    private lateinit var binding: FragmentBienvenidoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBienvenidoBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        binding.btnIniciaAAprender.setOnClickListener {
            it.findNavController().navigate(R.id.action_bienvenidoFragment_to_inicioAppFragment)
        }
    }

}