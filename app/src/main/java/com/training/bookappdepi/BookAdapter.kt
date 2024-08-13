package com.training.bookappdepi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(val list: List<Book>) :RecyclerView.Adapter<BookAdapter.MyViewHolder>() {

    class MyViewHolder( row: View) : RecyclerView.ViewHolder(row) {
        val titleName = row.findViewById<TextView>(R.id.titleTxt)
        val authorName = row.findViewById<TextView>(R.id.authorTxt)
        val bookImage = row.findViewById<ImageView>(R.id.bookTxt)
        val rate = row.findViewById<RatingBar>(R.id.ratingBar)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout =
            LayoutInflater.from(parent.context).inflate(R.layout.book, parent, false)
        return MyViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.titleName.text = list[position].title
        holder.authorName.text = list[position].author
        holder.rate.rating = list[position].rating.toFloat()
        holder.bookImage.setImageResource(list[position].image)
    }
    override fun getItemCount() = list.size


}
