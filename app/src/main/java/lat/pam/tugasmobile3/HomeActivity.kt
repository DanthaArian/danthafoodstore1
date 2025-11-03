package lat.pam.tugasmobile3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val username = intent.getStringExtra("username") ?: "User"
        val tvHalo = findViewById<TextView>(R.id.tvHalo)
        tvHalo.text = "Halo $username!"

        val listView = findViewById<ListView>(R.id.listMenu)
        val menus = listOf("Nasi Goreng", "Mie Ayam", "Soto Ayam", "Bakso", "Ayam Geprek",
            "Nasi Padang", "Gado-Gado", "Seblak", "Sate Ayam", "Nasi Uduk")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, menus)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra("menu", menus[position])
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnHome).setOnClickListener {}
        findViewById<Button>(R.id.btnOrder).setOnClickListener {
            startActivity(Intent(this, OrderListActivity::class.java))
        }
        findViewById<Button>(R.id.btnAccount).setOnClickListener {}
    }
}
