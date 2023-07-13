package com.proyectomov.salvandodiscreta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.proyectomov.salvandodiscreta.databinding.FragmentInicioAppBinding

class InicioAppFragment : Fragment() {
    private lateinit var binding: FragmentInicioAppBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInicioAppBinding.inflate(inflater,container,false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
//        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        (activity as AppCompatActivity).supportActionBar?.title = "Salvando Discreta"

        binding.btnHaveAccount.setOnClickListener {
            it.findNavController().navigate(R.id.action_inicioAppFragment_to_loginFragment)
        }
        binding.btnRegistro.setOnClickListener {
            it.findNavController().navigate(R.id.action_inicioAppFragment_to_registerFragment)
        }


    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            requireActivity().onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }


}