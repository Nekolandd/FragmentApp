package edu.universidad.fragements

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.GridView
import androidx.fragment.app.Fragment

class GridFragmento : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_gris, container, false)
        val grilla = view.findViewById<GridView>(R.id.grilla)
        val adapter = ArrayAdapter(
            requireActivity(),
            android.R.layout.simple_list_item_1,
            resources.getStringArray(R.array.paises)
        )
        grilla.adapter = adapter
        return view
    }
}
