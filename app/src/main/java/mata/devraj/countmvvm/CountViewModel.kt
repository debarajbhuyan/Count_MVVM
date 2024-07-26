package mata.devraj.countmvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {
    private val _repository: CountRepository = CountRepository()

    private val _count = MutableLiveData(_repository.getCounter().count)
    val count: LiveData<Int> = _count // Expose count as LiveData

    fun incrementFn(){
        _repository.incrementFn()
        _count.value = _repository.getCounter().count
    }

    fun decrementFn() {
        _repository.decrementFn()
        _count.value = _repository.getCounter().count
    }
}