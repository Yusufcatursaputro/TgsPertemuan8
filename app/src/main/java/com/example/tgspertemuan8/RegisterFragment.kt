package com.example.tgspertemuan8

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.tgspertemuan8.databinding.FragmentRegisterBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class RegisterFragment : Fragment() {

    private lateinit var binding: FragmentRegisterBinding

    companion object {
        const val EXTRA_USERNAME = "extra_username"
    }

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
        // Menggunakan FragmentRegisterBinding untuk meng-inflate layout
        binding = FragmentRegisterBinding.inflate(inflater, container, false)

        // Menggunakan binding untuk akses view, tanpa harus findViewById
        binding.btnRegister.setOnClickListener {
            Toast.makeText(context, "DHYDVYWD", Toast.LENGTH_SHORT).show()

            // Pastikan binding.Username mengacu pada EditText atau TextView yang sesuai
            val username = binding.Username.text.toString()

            val intent = Intent(requireActivity(), SecondActivity::class.java)
            intent.putExtra(EXTRA_USERNAME, username) // Masukkan username ke dalam intent
            startActivity(intent)
        }

        return binding.root
    }
}
