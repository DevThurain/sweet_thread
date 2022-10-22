package com.thurainx.sweetthreads.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.thurainx.sweetthreads.R
import com.thurainx.sweetthreads.viewholders.CategoryViewHolder

class ProductAdapter : RecyclerView.Adapter<CategoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_product,parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 20
    }
}