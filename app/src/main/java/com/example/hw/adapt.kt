package com.example.hw

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.hw.databinding.NameitBinding


class adapt ( val name : String): ListAdapter<String, name>( comparator) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): name {
        return name(NameitBinding .inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: name, position: Int) {
        getItem(position).let {

            holder.binding.nameTV.text = getItem(position)

        }
    }

    companion object{

        val comparator = object : DiffUtil.ItemCallback<String>(){
            override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }


        }
    }




}