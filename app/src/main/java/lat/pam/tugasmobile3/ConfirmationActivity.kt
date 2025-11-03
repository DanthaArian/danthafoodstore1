package lat.pam.tugasmobile3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class ConfirmationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)

        val menu = intent.getStringExtra("menu") ?: "Menu"

        val tvThanks = findViewById<TextView>(R.id.tvThanks)
        tvThanks.text = "Terima kasih sudah memesan $menu!\nPesananmu sedang diproses 🍽️"

        val btnFinish = findViewById<Button>(R.id.btnFinish)
        btnFinish.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
