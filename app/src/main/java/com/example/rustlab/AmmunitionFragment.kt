package com.example.rustlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.Navigation

class AmmunitionFragment : Fragment(), View.OnClickListener{

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ammunition, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view);
        view.findViewById<ImageView>(R.id.image_satchel).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_expo).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_rocket).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_c4).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_wood).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_stone).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_metal).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_HQmetal).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_woodDoor).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_metalDoor).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_HQDoor).setOnClickListener(this);
    }

    override fun onClick(v: View?) {
        when(v!!.id)
        {
            R.id.image_satchel -> navController.navigate(R.id.action_ammunitionFragment_to_satchelFragment)
            R.id.image_expo -> navController.navigate(R.id.action_ammunitionFragment_to_explosiveAmmoFragment)
            R.id.image_rocket -> navController.navigate(R.id.action_ammunitionFragment_to_rockerFragment)
            R.id.image_c4 -> navController.navigate(R.id.action_ammunitionFragment_to_c4Fragment)
            R.id.image_wood -> navController.navigate(R.id.action_ammunitionFragment_to_woodFragment)
            R.id.image_stone -> navController.navigate(R.id.action_ammunitionFragment_to_stoneFragment)
            R.id.image_metal -> navController.navigate(R.id.action_ammunitionFragment_to_metalFragment)
            R.id.image_HQmetal -> navController.navigate(R.id.action_ammunitionFragment_to_HQFragment)
            R.id.image_woodDoor -> navController.navigate(R.id.action_ammunitionFragment_to_woodDoorFragment)
            R.id.image_metalDoor -> navController.navigate(R.id.action_ammunitionFragment_to_metalDoorFragment)
            R.id.image_HQDoor -> navController.navigate(R.id.action_ammunitionFragment_to_HQDoorFragment)
        }
    }
}