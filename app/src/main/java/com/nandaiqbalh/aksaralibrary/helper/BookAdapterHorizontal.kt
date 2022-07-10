package com.nandaiqbalh.aksaralibrary.helper

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nandaiqbalh.aksaralibrary.R
import com.nandaiqbalh.aksaralibrary.model.Book

class BookAdapterHorizontal(private var data: List<Book>,
                            private val listener: (Book) -> Unit)
    : RecyclerView.Adapter<BookAdapterHorizontal.ViewHolder>() {

    private lateinit var contextAdapter: Context

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        contextAdapter = parent.context
        val inflatedView = layoutInflater.inflate(R.layout.row_item_book_horizontal, parent, false)
        return ViewHolder(inflatedView)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bindItem(data[position], listener, contextAdapter)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private var ivPoster: ImageView = view.findViewById(R.id.iv_poster_image)
        private var tvTitle: TextView = view.findViewById(R.id.tv_title)
        private var tvAuthor: TextView = view.findViewById(R.id.tv_author)
        private var tvCategory: TextView = view.findViewById(R.id.tv_category)

        fun bindItem(data: Book, listener: (Book) -> Unit, context: Context) {

            tvTitle.text = data.title
            tvAuthor.text = data.author
            tvCategory.text = data.category

            Glide.with(context)
                .load(data.poster)
                .into(ivPoster)

            itemView.setOnClickListener {
                listener(data)
            }
        }

    }
}