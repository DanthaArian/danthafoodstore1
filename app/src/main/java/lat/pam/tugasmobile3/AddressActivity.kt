package lat.pam.tugasmobile3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class AddressActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address)

        val etName = findViewById<EditText>(R.id.etName)
        val etAddress = findViewById<EditText>(R.id.etAddress)
        val etPhone = findViewById<EditText>(R.id.etPhone)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val tvConfirmation = findViewById<TextView>(R.id.tvConfirmation)

        btnSubmit.setOnClickListener {

            etName.visibility = View.GONE
            etAddress.visibility = View.GONE
            etPhone.visibility = View.GONE
            btnSubmit.visibility = View.GONE


            tvConfirmation.visibility = View.VISIBLE
            tvConfirmation.alpha = 0f
            tvConfirmation.animate().alpha(1f).setDuration(500).start()
        }
    }
}
