package com.xolary.singleactivity.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.xolary.singleactivity.data.Contact
import com.xolary.singleactivity.data.DataSource
import com.xolary.singleactivity.databinding.ContactsListContactBinding


class ContactCardAdapter(private val onClickLister: OnClickListener) :
    RecyclerView.Adapter<ContactCardAdapter.ContactCardViewHolder>() {

    private val dataset = DataSource.contacts

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactCardViewHolder {

        return ContactCardViewHolder(
            ContactsListContactBinding.inflate(
                LayoutInflater.from(
                    parent.context
                )
            )
        )
    }

    override fun onBindViewHolder(holder: ContactCardViewHolder, position: Int) {
        val item = dataset[position]
        holder.bind(item)
        val fullName = item.firstName + " " + item.lastName
        holder.itemView.setOnClickListener {
            onClickLister.clickListener(item, fullName)
        }
    }

    class ContactCardViewHolder(private var binding: ContactsListContactBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Contact) {
            val fullName = item.firstName + " " + item.lastName
            binding.apply {
                contactName.text = fullName
                contactPhoto.setImageResource(item.avatarResourceId)
            }
        }
    }

    override fun getItemCount() = dataset.size

    class OnClickListener(val clickListener: (contact: Contact, fullName: String) -> Unit) {
        fun onClick(contact: Contact, fullName: String) = clickListener(contact, fullName)
    }
}