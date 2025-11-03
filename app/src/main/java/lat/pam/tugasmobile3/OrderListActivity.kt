package lat.pam.tugasmobile3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class OrderListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_list)

        val listView = findViewById<ListView>(R.id.listOrder)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, Orderstorage.orders)
        listView.adapter = adapter

        val btnSend = findViewById<Button>(R.id.btnSend)
        btnSend.setOnClickListener {
            startActivity(Intent(this, AddressActivity::class.java))
        }
    }
}
