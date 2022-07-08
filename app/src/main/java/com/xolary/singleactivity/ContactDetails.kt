package com.xolary.singleactivity

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.xolary.singleactivity.adapter.ContactCardAdapter
import com.xolary.singleactivity.databinding.ContactDetailsFragmentBinding

class ContactDetails : Fragment() {

    private lateinit var binding: ContactDetailsFragmentBinding
    private lateinit var adapter: ContactCardAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ContactDetailsFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    /*fun bind(item: Contact) {
        binding.name.text = item.firstName
        binding.surname.text = item.lastName
        binding.detailsContactPhoto.setImageResource(item.avatarResourceId)
    }*/

}