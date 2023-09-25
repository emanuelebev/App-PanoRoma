package com.example.panoroma.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import com.example.panoroma.R
import com.example.panoroma.ui.showinfo.info_col
import com.example.panoroma.ui.showinfo.info_pincio


class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val buttonCalculate = root.findViewById(R.id.colosseo_button) as ImageButton

        buttonCalculate.setOnClickListener() {
            //Toast.makeText(activity, "Hola ratita", Toast.LENGTH_SHORT).show()
            activity?.let{
                val intent = Intent (it, info_col::class.java)
                it.startActivity(intent)
            }
        }
        val button_pincio = root.findViewById(R.id.pincio_button) as ImageButton

        button_pincio.setOnClickListener() {
            //Toast.makeText(activity, "Hola ratita", Toast.LENGTH_SHORT).show()
            activity?.let{
                val intent = Intent (it, info_pincio::class.java)
                it.startActivity(intent)
            }
        }
        //val textView: TextView = root.findViewById(R.id.info_text)
        //homeViewModel.text.observe(viewLifecycleOwner, Observer {
            //textView.text = it
        //})
        return root
    }
}