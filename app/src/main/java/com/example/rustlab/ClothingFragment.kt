package com.example.rustlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.Navigation

class ClothingFragment : Fragment(), View.OnClickListener {

    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_clothing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view);
        view.findViewById<ImageView>(R.id.image_metalFacemask).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_metalChestPlate).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_boots).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_hoodie).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_roadSignKilt).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_roadSignJacket).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_woodArmorHelmet).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_woodChestplate).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_woodArmorPants).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_snowJacketRed).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_coffeeCanHelmet).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_leatherGloves).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_hazmat).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_hoodie).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_pants).setOnClickListener(this);
    }

    override fun onClick(v: View?) {
        when(v!!.id)
        {
            R.id.image_metalFacemask -> navController.navigate(R.id.action_clothingFragment_to_metalFacemaskFragment)
            R.id.image_metalChestPlate -> navController.navigate(R.id.action_clothingFragment_to_metalChestPlateFragment)
            R.id.image_boots -> navController.navigate(R.id.action_clothingFragment_to_bootsFragment)
            R.id.image_hoodie -> navController.navigate(R.id.action_clothingFragment_to_hoodieFragment)
            R.id.image_roadSignJacket -> navController.navigate(R.id.action_clothingFragment_to_roadSignJacketFragment)
            R.id.image_roadSignKilt -> navController.navigate(R.id.action_clothingFragment_to_roadSignKiltFragment)
            R.id.image_woodArmorHelmet -> navController.navigate(R.id.action_clothingFragment_to_woodArmorHelmetFragment)
            R.id.image_woodChestplate -> navController.navigate(R.id.action_clothingFragment_to_woodChestplateFragment)
            R.id.image_woodArmorPants -> navController.navigate(R.id.action_clothingFragment_to_woodArmorPantsFragment)
            R.id.image_snowJacketRed -> navController.navigate(R.id.action_clothingFragment_to_snowJacketRedFragment)
            R.id.image_coffeeCanHelmet -> navController.navigate(R.id.action_clothingFragment_to_coffeeCanHelmetFragment)
            R.id.image_leatherGloves -> navController.navigate(R.id.action_clothingFragment_to_leatherGlovesFragment)
            R.id.image_hazmat -> navController.navigate(R.id.action_clothingFragment_to_hazmatFragment)
            R.id.image_pants -> navController.navigate(R.id.action_clothingFragment_to_pantsFragment)
        }
    }
}