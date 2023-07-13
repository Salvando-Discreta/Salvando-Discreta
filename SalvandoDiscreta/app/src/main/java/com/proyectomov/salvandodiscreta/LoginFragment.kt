package com.proyectomov.salvandodiscreta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.proyectomov.salvandodiscreta.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        binding.txtViewRemember.setOnClickListener{
            it.findNavController().navigate(R.id.action_loginFragment_to_recuperarContraFragment)
        }
        binding.btnRegister.setOnClickListener{
            it.findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }

//        binding.btnCreateAccount.setOnClickListener{
//            it.findNavController().
//        }
//        val buton_login = requireView().findViewById<Button>(R.id.btn_create_Account)
    }


}

