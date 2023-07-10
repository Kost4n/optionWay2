package com.kost4n.optionway2.utilits

import android.graphics.Rect
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kost4n.optionway2.R

class RVAdapter: RecyclerView.Adapter<RVAdapter.RVHolder>() {

    private var itemList = mutableListOf<Fact>()

    inner class RVHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val textFact = itemView.findViewById<TextView>(R.id.text_fact)

        fun bind(fact: Fact, position: Int) {
            textFact.text = fact.text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row, parent, false)

        return RVHolder(view)
    }

    override fun getItemCount(): Int = itemList.size

    override fun onBindViewHolder(holder: RVHolder, position: Int) =
        holder.bind(itemList[position], position)

    fun update(items: MutableList<Fact>) {
        itemList = items
        notifyDataSetChanged()
    }
}

class RecycleItemDecoration(
    val spaceHeight: Int
): RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View,
                                parent: RecyclerView, state: RecyclerView.State) {
        outRect.bottom = spaceHeight
    }
}


