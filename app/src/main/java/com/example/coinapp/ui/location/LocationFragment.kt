package com.example.coinapp.ui.location

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.coinapp.databinding.FragmentLocationBinding


class LocationFragment : Fragment() {

    private val binding get() = _binding!!
    private var _binding: FragmentLocationBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentLocationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpAnim()
        setUpLocationBtn()
    }

    private fun setUpLocationBtn() {
        binding.apply {
            buttonLocation.setOnClickListener {
                locationFragment.transitionToEnd()
                locationFragment.transitionToStart()
                checkAnim.playAnimation()
            }

        }
    }

    private fun setUpAnim() {
        binding.apply {
            mapsAnim.cancelAnimation()
            mapsAnim.setMinFrame(0)
            mapsAnim.setMaxFrame(80)
        }
    }

}