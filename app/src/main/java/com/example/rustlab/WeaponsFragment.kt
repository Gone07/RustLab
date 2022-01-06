package com.example.rustlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.Navigation

class WeaponsFragment : Fragment(), View.OnClickListener {
    lateinit var navController: NavController
   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weapons, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view);
        view.findViewById<ImageView>(R.id.image_asaultRifle).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_boltActionRifle).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_compoundBow).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_crossbow).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_customSMG).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_doubleBarrelShotgun).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_eokaPistol).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_flameThrower).setOnClickListener(this);
        view.findViewById<ImageView>(R.id.image_huntingBow).setOnClickListener(this);
    }

    override fun onClick(v: View?) {
        when(v!!.id)
        {
            R.id.image_asaultRifle -> navController.navigate(R.id.action_weaponsFragment_to_asaultRifleFragment)
            R.id.image_boltActionRifle -> navController.navigate(R.id.action_weaponsFragment_to_boltActionRifleFragment)
            R.id.image_compoundBow -> navController.navigate(R.id.action_weaponsFragment_to_compoundBowFragment)
            R.id.image_boots -> navController.navigate(R.id.action_weaponsFragment_to_compoundBowFragment)
            R.id.image_crossbow -> navController.navigate(R.id.action_weaponsFragment_to_crossbowFragment)
            R.id.image_customSMG -> navController.navigate(R.id.action_weaponsFragment_to_customSMGFragment)
            R.id.image_doubleBarrelShotgun -> navController.navigate(R.id.action_weaponsFragment_to_doubleBarrelShotgunFragment)
            R.id.image_eokaPistol -> navController.navigate(R.id.action_weaponsFragment_to_eokaPistoliconFragment)
            R.id.image_flameThrower -> navController.navigate(R.id.action_weaponsFragment_to_flameThrowerFragment)
            R.id.image_huntingBow -> navController.navigate(R.id.action_weaponsFragment_to_huntingBowFragment)
        }
    }
}