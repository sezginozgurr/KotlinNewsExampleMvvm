package com.example.newsexampleviewmodelmvvm.newsexample.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.newsexampleviewmodelmvvm.R
import kotlinx.android.synthetic.main.fragment_login_page.*


class LoginPage : Fragment(R.layout.fragment_login_page) {

    private var navController: NavController? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        btnLogin.setOnClickListener {
            navController?.navigate(R.id.action_loginPage4_to_homePageFragment4)
        }
    }

}