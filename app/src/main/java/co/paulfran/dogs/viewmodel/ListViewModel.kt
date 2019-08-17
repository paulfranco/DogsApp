package co.paulfran.dogs.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import co.paulfran.dogs.model.DogBreed

class ListViewModel: ViewModel() {

    val dogs = MutableLiveData<List<DogBreed>>()
    val dogsLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh() {
        val dog1 = DogBreed("1", "Corgi", "15 Years", "lalala", "fucking", "high", "jdksjdksjdkskdjksjk")
        val dog2 = DogBreed("2", "ira", "15 Years", "lalala", "fucking", "high", "jdksjdksjdkskdjksjk")
        val dog3 = DogBreed("3", "rocky", "15 Years", "lalala", "fucking", "high", "jdksjdksjdkskdjksjk")
        val dogList = arrayListOf<DogBreed>(dog1, dog2, dog3)

        dogs.value = dogList
        dogsLoadError.value = false
        loading.value = false
    }

}