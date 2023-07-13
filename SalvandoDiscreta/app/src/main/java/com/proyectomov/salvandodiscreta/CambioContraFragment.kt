package com.proyectomov.salvandodiscreta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.proyectomov.salvandodiscreta.databinding.FragmentCambioContraBinding

class CambioContraFragment : Fragment() {
    private lateinit var binding: FragmentCambioContraBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCambioContraBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

//        binding.atras.setOnClickListener{
//            it.findNavController().popBackStack()
//        }

//        binding.btnCreateAccount.setOnClickListener{
//            it.findNavController().
//        }
//        val buton_login = requireView().findViewById<Button>(R.id.btn_create_Account)
    }
}