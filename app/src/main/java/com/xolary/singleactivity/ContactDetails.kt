package com.xolary.singleactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.xolary.singleactivity.data.Contact
import com.xolary.singleactivity.databinding.ContactDetailsFragmentBinding

class ContactDetails : Fragment() {

    private lateinit var binding: ContactDetailsFragmentBinding
    private val contactArg: ContactDetailsArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ContactDetailsFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val contact: Contact = contactArg.contactsArgs
        binding.apply {
            name.text = contact.firstName
            surname.text = contact.lastName
            detailsContactPhoto.setImageResource(contact.avatarResourceId)
        }
    }
}