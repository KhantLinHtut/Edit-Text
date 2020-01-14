package com.klh.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.klh.edittext.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var person: Person = Person("", "")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnSummit.setOnClickListener {

            var personName = edtName.editableText
            var personOccupation = edtOccupation.editableText
            txtName.text = personName.toString()
            txtOccupation.text = personOccupation.toString()
        }

    }
}

data class Person(var name: String, var occupation: String)

