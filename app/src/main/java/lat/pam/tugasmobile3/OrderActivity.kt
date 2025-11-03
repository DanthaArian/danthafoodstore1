package lat.pam.tugasmobile3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val menu = intent.getStringExtra("menu") ?: "Menu tidak tersedia"
        val btnConfirm = findViewById<Button>(R.id.btnConfirm)

        Orderstorage.add(menu)

        btnConfirm.setOnClickListener {
            val intent = Intent(this, OrderListActivity::class.java)
            startActivity(intent)
        }
    }
}
