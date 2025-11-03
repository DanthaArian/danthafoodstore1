package lat.pam.tugasmobile3

object Orderstorage {
    val orders = mutableListOf<String>()

    fun add(item: String) {
        orders.add(item)
    }

    fun clear() {
        orders.clear()
    }
}
