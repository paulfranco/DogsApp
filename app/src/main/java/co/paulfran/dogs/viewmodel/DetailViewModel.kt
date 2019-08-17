package co.paulfran.dogs.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import co.paulfran.dogs.model.DogBreed

class DetailViewModel: ViewModel() {

    val dogLiveData = MutableLiveData<DogBreed>()

    fun fetch() {
        val dog = DogBreed("1", "Corgi", "15 Years", "breedGroup", "bredFor", "high", "djkjskjdkjskd")
        dogLiveData.value = dog
    }

}