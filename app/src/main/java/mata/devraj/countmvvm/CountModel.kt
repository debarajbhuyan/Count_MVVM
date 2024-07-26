package mata.devraj.countmvvm

data class CountModel(var count: Int)

class CountRepository{
    private var _count = CountModel(0)
    fun getCounter() =_count
    fun incrementFn(){
        _count.count++
    }
    fun decrementFn() {
        _count.count--
    }
}