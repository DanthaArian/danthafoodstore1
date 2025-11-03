📄 Deskripsi
danthafoodstore adalah aplikasi Android sederhana untuk pemesanan makanan, dibuat menggunakan Kotlin dan Android Studio.
Aplikasi ini memungkinkan pengguna untuk:
- Mendaftar akun baru 👤
- Login ke akun 🔑
- Melihat daftar menu makanan 🍛
- Memilih menu yang ingin dipesan 🍗 
- Melihat daftar pesanan 📝
- Mengisi alamat pengiriman 📍 
- Mendapatkan konfirmasi pesanan 🎉

Aplikasi ini cocok untuk latihan membuat multi-activity flow, ListView, dan penggunaan Intent di Android.

📱 Fitur
MainActivity – Halaman awal dengan tombol Start.
<img width="200" height="780" alt="image" src="https://github.com/user-attachments/assets/f34ae1c3-dd40-4b6d-9701-b13647509075" />

LoginActivity – Login menggunakan username & password.
<img width="200" height="785" alt="image" src="https://github.com/user-attachments/assets/a422643d-7721-4aa9-93c5-9a1fb71de421" />

RegisterActivity – Registrasi akun baru.
<img width="200" height="788" alt="image" src="https://github.com/user-attachments/assets/bd5ac7c8-bc3e-489b-9141-2db3fae5829a" />

HomeActivity – Menampilkan daftar menu makanan.
<img width="200" height="786" alt="image" src="https://github.com/user-attachments/assets/4f6ea8fa-2c22-461f-8ffb-67e48ef5076d" />

OrderActivity – Konfirmasi menu yang dipilih.
<img width="200" height="780" alt="image" src="https://github.com/user-attachments/assets/46b9e01a-f6fb-40f7-9c70-e01b245a7c78" />

OrderListActivity – Daftar pesanan yang dipilih pengguna.
<img width=""200 height="781" alt="image" src="https://github.com/user-attachments/assets/fe7e3722-6491-41cf-aa50-80cf0d324137" />

AddressActivity – Mengisi alamat, nama, dan nomor telepon.
<img width="200" height="781" alt="image" src="https://github.com/user-attachments/assets/492e121f-61d3-4a82-95a1-69e7454232ba" />

ConfirmationActivity – Menampilkan pesan terima kasih setelah pemesanan.
<img width="200" height="794" alt="image" src="https://github.com/user-attachments/assets/acca10c0-3b6b-4b82-9917-0521a54096ea" />

🔧 Cara Kerja
User membuka aplikasi → MainActivity
Tekan “Start” → pindah ke LoginActivity
Bisa login atau klik link untuk RegisterActivity
Setelah login → masuk HomeActivity
Pilih menu → OrderActivity
Konfirmasi → item ditambahkan ke OrderListActivity
Tekan “Send” → AddressActivity
Submit → tampil ConfirmationActivity 🎉

🔄 Flowchart Aplikasi
<img width="200" height="696" alt="image" src="https://github.com/user-attachments/assets/924b2fa8-14e4-414c-83bf-10ca8496515c" />

🛠️ Teknologi
- Kotlin
- Android Studio
- Layout XML
- ListView & ArrayAdapter
- Intent untuk berpindah antar activity

📌 Catatan
- Semua data pesanan disimpan sementara di Orderstorage (object singleton).
- Setelah submit alamat, tampilan akan menampilkan konfirmasi tanpa keluar dari activity.
- Flow aplikasi bersifat linear agar mudah dipahami oleh pemula.


