package com.example.composemvvmdaggerretro.viewmodels

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composemvvmdaggerretro.model.Product
import com.example.composemvvmdaggerretro.repository.ProductRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class ProductViewModel @Inject constructor( private val productRepository: ProductRepository) : ViewModel() {


    //var prodList = mutableStateListOf<Product>()
    private val _prodlist: MutableState<MutableList<Product>> = mutableStateOf(mutableListOf())
    val prodList : State<List<Product>> = _prodlist

/*    private var _prodlist = mutableStateListOf<Product>()
    val prodList : List<Product> = _prodlist*/


    // mutablestateof
    // mutablestateListof
    // mutablestateMapOf
    // mutableSharedFlow
    // mutableStateFlow

    init {
        viewModelScope.launch {
            val resp = productRepository.getProducts()
            if(resp.isSuccessful){
                _prodlist.value = resp.body() as MutableList<Product>
            }
        }

    }

}