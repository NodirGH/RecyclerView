package com.example.recyclerview

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class UserListActivity: AppCompatActivity() {
    private lateinit var contacts: ArrayList<Contact>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val rvContact = findViewById<View>(R.id.rvContacts) as RecyclerView
        contacts = Contact.createContactList(20)
        val adapter = ContactsAdapter(contacts)
        rvContact.adapter = adapter
        rvContact.layoutManager = LinearLayoutManager(this)

    }
}