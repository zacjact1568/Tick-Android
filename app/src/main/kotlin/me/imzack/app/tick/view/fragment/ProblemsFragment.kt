package me.imzack.app.tick.view.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_problems.*
import me.imzack.app.tick.R
import me.imzack.app.tick.view.adapter.LibraryListAdapter
import me.imzack.app.tick.view.adapter.ProblemListAdapter

class ProblemsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) =
            inflater.inflate(R.layout.fragment_problems, container, false)!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vProblemList.adapter = ProblemListAdapter()
        vProblemList.setHasFixedSize(true)
    }
}