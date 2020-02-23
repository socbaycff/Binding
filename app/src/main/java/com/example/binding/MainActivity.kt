package com.example.binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.binding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        binding.lifecycleOwner = this // quen la k bind dc

        val viewmodel = ViewModelProvider(this).get(MainVM::class.java)
        binding.viewmodel = viewmodel // nap viewmodel qua xml

    }
}
