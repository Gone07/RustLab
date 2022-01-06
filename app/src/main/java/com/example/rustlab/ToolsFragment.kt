package com.example.rustlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.Navigation

class ToolsFragment : Fragment(), View.OnClickListener {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tools, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view);
        view.findViewById<ImageView>(R.id.image_pickAxe).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_hatchet).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_salvagedHammer).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_stoneHatchet).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_stonePickAxe).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_salvagedIcepick).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_salvagedAxe).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_chainsaw).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_rock).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_torch).setOnClickListener(this);
    }

    override fun onClick(v: View?) {
        when(v!!.id)
        {
            R.id.image_pickAxe -> navController.navigate(R.id.action_toolsFragment_to_pickAxeFragment)
            R.id.image_hatchet -> navController.navigate(R.id.action_toolsFragment_to_hatchetFragment)
            R.id.image_salvagedHammer -> navController.navigate(R.id.action_toolsFragment_to_salvagedHammerFragment)
            R.id.image_stoneHatchet -> navController.navigate(R.id.action_toolsFragment_to_stoneHatchetFragment)
            R.id.image_stonePickAxe -> navController.navigate(R.id.action_toolsFragment_to_stonePickAxeFragment)
            R.id.image_salvagedIcepick -> navController.navigate(R.id.action_toolsFragment_to_salvagedIcepickFragment)
            R.id.image_salvagedAxe -> navController.navigate(R.id.action_toolsFragment_to_salvagedAxeFragment)
            R.id.image_chainsaw -> navController.navigate(R.id.action_toolsFragment_to_chainsawFragment)
            R.id.image_rock -> navController.navigate(R.id.action_toolsFragment_to_rockFragment)
            R.id.image_torch -> navController.navigate(R.id.action_toolsFragment_to_torchFragment)
        }
    }
}