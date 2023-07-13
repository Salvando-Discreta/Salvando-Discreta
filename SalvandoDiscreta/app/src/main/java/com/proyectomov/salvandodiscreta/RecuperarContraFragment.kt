package com.proyectomov.salvandodiscreta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.proyectomov.salvandodiscreta.databinding.FragmentRecuperarContraBinding


class RecuperarContraFragment : Fragment() {

    private lateinit var binding: FragmentRecuperarContraBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRecuperarContraBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        binding.btnSend.setOnClickListener{
            it.findNavController().navigate(R.id.action_recuperarContraFragment_to_cambioContraFragment)
        }
    }

}