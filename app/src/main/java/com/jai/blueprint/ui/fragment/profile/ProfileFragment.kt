package com.jai.blueprint.ui.fragment.profile

import android.os.Bundle
import android.view.View
import androidx.lifecycle.LifecycleOwner
import com.jai.blueprint.BR
import com.jai.blueprint.R
import com.jai.blueprint.databinding.FragmentProfileBinding
import com.jai.blueprint.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Created by JAI on 04,july,2020
 * JAI KHAMBHAYTA
 */

@AndroidEntryPoint
class ProfileFragment : BaseFragment<FragmentProfileBinding, ProfileViewModel>() {
    @Inject
    lateinit var profileViewModel: ProfileViewModel

    lateinit var fragmentProfileBinding: FragmentProfileBinding

    override fun getBindingVariable(): Int = BR.viewModel

    override fun getLayoutId(): Int = R.layout.fragment_profile

    override fun getViewModel(): ProfileViewModel {return profileViewModel}

    override fun getLifeCycleOwner(): LifecycleOwner = this

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentProfileBinding = getViewDataBinding()
        setUp()
    }

    private fun setUp() {
    }


}