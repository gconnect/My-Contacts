package com.example.mycontacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycontacts.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnContactClickedListener {

    lateinit var binding : ActivityMainBinding
    lateinit var contactList: ArrayList<Contact>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        // instance
        contactList = ArrayList()
        addContact()

        contactRecyclerview.layoutManager = LinearLayoutManager(this)
        contactRecyclerview.addItemDecoration(DividerItemDecoration(this,1))
        contactRecyclerview.adapter = ContactAdapter(contactList, this )
    }
    fun addContact(){
        contactList.add(Contact("Percy","08155676415",R.drawable.percy))
        contactList.add(Contact("Kingsley","0815487415",R.drawable.pking))
        contactList.add(Contact("Enobong","0704566415",R.drawable.precious))
        contactList.add(Contact("Kingstone","09055676415",R.drawable.winny))
        contactList.add(Contact("Frank","0705676415",R.drawable.pking))
        contactList.add(Contact("Andrew","0815567458",R.drawable.percy))
        contactList.add(Contact("PEtty","08155672578",R.drawable.winny))
        contactList.add(Contact("Imabong","08155357815",R.drawable.precious))
        contactList.add(Contact("Glory","08155645789",R.drawable.pandrew))
        contactList.add(Contact("Justin","07055671475",R.drawable.pbless))
        contactList.add(Contact("Victory","08055676415",R.drawable.pking))
        contactList.add(Contact("Patience","07055676415",R.drawable.winny))
        contactList.add(Contact("Antony","08055676415",R.drawable.pbless))
        contactList.add(Contact("Darima","08155676415",R.drawable.percy))
        contactList.add(Contact("Comfort","0812546415",R.drawable.pking))
        contactList.add(Contact("MJay","08055676415",R.drawable.percy))
        contactList.add(Contact("Messoma","08155676415",R.drawable.pbless))
        contactList.add(Contact("Precious","07055676415",R.drawable.winny))
        contactList.add(Contact("Dama","08155676415",R.drawable.percy))
        contactList.add(Contact("Rita","09055676415",R.drawable.pandrew))
        contactList.add(Contact("Goodluck","07055676415",R.drawable.winny))
        contactList.add(Contact("Abas","09055676415",R.drawable.percy))
        contactList.add(Contact("Blessing","08155676415",R.drawable.pbless))
        contactList.add(Contact("Victory","08055676415",R.drawable.pking))
        contactList.add(Contact("Patience","07055676415",R.drawable.winny))
        contactList.add(Contact("Antony","08055676415",R.drawable.pbless))
        contactList.add(Contact("Darima","08155676415",R.drawable.percy))
        contactList.add(Contact("Comfort","0812546415",R.drawable.pking))
        contactList.add(Contact("MJay","08055676415",R.drawable.percy))
        contactList.add(Contact("Messoma","08155676415",R.drawable.pbless))
        contactList.add(Contact("Precious","07055676415",R.drawable.winny))
        contactList.add(Contact("Dama","08155676415",R.drawable.percy))
        contactList.add(Contact("Rita","09055676415",R.drawable.pandrew))
        contactList.add(Contact("Goodluck","07055676415",R.drawable.winny))
        contactList.add(Contact("Abas","09055676415",R.drawable.percy))
        contactList.add(Contact("Blessing","08155676415",R.drawable.pbless))



    }

    override fun onItemClicked(items: Contact, position: Int) {
       // Toast.makeText(this, "You just clicked a contact",Toast.LENGTH_LONG).show()
        val intent = Intent(this, ContactDetailActivity:: class.java)
        intent.putExtra("CONTACTNAME", items.Name)
        intent.putExtra("CONTACTPHONE", items.PhoneNumber)
        intent.putExtra("CONTACTIMAGE", items.ProfileImage.toString())

        startActivity(intent)

    }

}