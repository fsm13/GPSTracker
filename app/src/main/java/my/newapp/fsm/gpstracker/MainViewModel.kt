package my.newapp.fsm.gpstracker

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import my.newapp.fsm.gpstracker.location.LocationModel

class MainViewModel : ViewModel(){

    val locationUpdates = MutableLiveData<LocationModel>()
    val timeData = MutableLiveData<String>()

}