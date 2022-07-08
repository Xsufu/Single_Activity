package com.xolary.singleactivity.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.xolary.singleactivity.data.Contact
import com.xolary.singleactivity.data.DataSource
import com.xolary.singleactivity.databinding.ContactsListContactBinding

class ContactCardAdapter(): RecyclerView.Adapter<ContactCardAdapter.ContactCardViewHolder>() {

    private val dataset = DataSource.contacts

    class ContactCardViewHolder(var binding: ContactsListContactBinding):
        RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactCardViewHolder {

        val binding = ContactsListContactBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactCardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactCardViewHolder, position: Int) {
        val item = dataset[position]

        holder.binding.contactName.text = item.firstName + " " + item.lastName
        holder.binding.contactPhoto.setImageResource(item.avatarResourceId)

        holder.itemView.setOnClickListener {

        }
    }

    override fun getItemCount() = dataset.size
}