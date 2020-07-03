package com.example.workshopnobugs.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.workshopnobugs.R
import com.example.workshopnobugs.viewmodel.MainViewModel

class MainFragment : Fragment() {

    /*
    *
    * Esquece esse arquivo, só tem lixo aqui. Vamos ter que refazer. Começando pelo binding, depois recriar o viewModel,
    * depois vamos implementar os métodos para capturar os componentes de interface e passar pro viewModel
    *
    * */

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}