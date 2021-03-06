package com.xolary.singleactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.xolary.singleactivity.adapter.ContactCardAdapter
import com.xolary.singleactivity.databinding.ContactsListFragmentBinding

class ContactsListFragment : Fragment() {

    private lateinit var binding: ContactsListFragmentBinding
    private lateinit var contactsRecyclerView: RecyclerView
    private lateinit var adapter: ContactCardAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ContactsListFragmentBinding.inflate(inflater, container, false)

        contactsRecyclerView = binding.recyclerView
        contactsRecyclerView.layoutManager = LinearLayoutManager(context)

        updateUI()

        return binding.root
    }

    private fun updateUI() {
        adapter = ContactCardAdapter(listener)
        contactsRecyclerView.adapter = adapter
    }

    private val listener = ContactCardAdapter.OnClickListener { contact, fullName ->
        findNavController().navigate(
            ContactsListFragmentDirections.actionContactsListFragmentToContactDetails(
                contact,
                fullName
            )
        )
    }
}