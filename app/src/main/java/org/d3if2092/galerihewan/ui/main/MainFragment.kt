package org.d3if2092.galerihewan.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.d3if2092.galerihewan.model.Hewan
import org.d3if2092.galerihewan.R
import org.d3if2092.galerihewan.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        with(binding.recyclerView) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }
        return binding.root
    }

    private fun getData(): List<Hewan> {
        return listOf(
            Hewan(
                "Angsa",
                "Cignus Olor",
                R.drawable.angsa
            ),
            Hewan(
                "Ayam",
                "Gallus gallus",
                R.drawable.ayam
            ),
            Hewan(
                "Bebek",
                "Cairina moschata",
                R.drawable.bebek
            ),
            Hewan(
                "Domba",
                "Ovis ammon",
                R.drawable.domba
            ),
            Hewan(
                "Kalkun",
                "Meleagris gallopavo",
                R.drawable.kalkun
            ),
            Hewan(
                "Kambing",
                "Capricornis sumatrensis",
                R.drawable.kambing
            ),
            Hewan(
                "Kelinci",
                "Oryctolagus cuniculus",
                R.drawable.kelinci
            ),
            Hewan(
                "Kerbau",
                "Bubalus bubalis",
                R.drawable.kerbau
            ),
            Hewan(
                "Kuda",
                "Equus caballus",
                R.drawable.kuda
            ),
            Hewan(
                "Sapi",
                "Bos taurus",
                R.drawable.sapi
            )
        )
    }
}