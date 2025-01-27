package com.don2.shopintelli

import android.content.Intent
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.don2.shopintelli.databinding.CategorieProductItemBinding
import com.squareup.picasso.Picasso

class CategoryProductView(viewGroup: ViewGroup) : ATViewHolder<CategoryProduct, CategorieProductItemBinding>(
  CategorieProductItemBinding::inflate,
  viewGroup
) {

  override fun bind(item: CategoryProduct) {
    Picasso.get()
      .load(item.photoUrl)
      .into(binding.imgProduct)

    binding.txtProduct.text = item.text
    //binding.txtCategory.text = item.category
    //binding.txtSubtitle.text = itemView.context.getString(R.string.shop_category, item.category, item.distance)

    itemView.setOnClickListener{
      if(item.text.toString() == "Calcado"){
        val intent = Intent(itemView.context, RegisterProductActivity::class.java).apply {
          putExtra("Message", "Load activity client")
        }
        ContextCompat.startActivity(itemView.context, intent, null)
      }
      if(item.text.toString() == "Calça"){
        val intent = Intent(itemView.context, RegisterCalcaActivity::class.java).apply {
          putExtra("Message", "Load activity client")
        }
        ContextCompat.startActivity(itemView.context, intent, null)
      }
      if(item.text.toString() == "Camiseta"){
        val intent = Intent(itemView.context, RegisterCamisetaActivity::class.java).apply {
          putExtra("Message", "Load activity client")
        }
        ContextCompat.startActivity(itemView.context, intent, null)
      }
    }
  }

}