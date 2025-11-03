<img width="418" height="696" alt="image" src="https://github.com/user-attachments/assets/924b2fa8-14e4-414c-83bf-10ca8496515c" />

📄 Deskripsi
TugasMobile3 adalah aplikasi Android sederhana untuk pemesanan makanan, dibuat menggunakan Kotlin dan Android Studio.
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
<img width="300" height="780" alt="image" src="https://github.com/user-attachments/assets/f34ae1c3-dd40-4b6d-9701-b13647509075" />

LoginActivity – Login menggunakan username & password.
<img width="370" height="785" alt="image" src="https://github.com/user-attachments/assets/a422643d-7721-4aa9-93c5-9a1fb71de421" />

RegisterActivity – Registrasi akun baru.
<img width="353" height="788" alt="image" src="https://github.com/user-attachments/assets/bd5ac7c8-bc3e-489b-9141-2db3fae5829a" />

HomeActivity – Menampilkan daftar menu makanan.

OrderActivity – Konfirmasi menu yang dipilih.

OrderListActivity – Daftar pesanan yang dipilih pengguna.

AddressActivity – Mengisi alamat, nama, dan nomor telepon.

ConfirmationActivity – Menampilkan pesan terima kasih setelah pemesanan.

🔧 Cara Kerja

User membuka aplikasi → MainActivity

Tekan “Start” → pindah ke LoginActivity

Bisa login atau klik link untuk RegisterActivity

Setelah login → masuk HomeActivity

Pilih menu → OrderActivity

Konfirmasi → item ditambahkan ke OrderListActivity

Tekan “Send” → AddressActivity

Submit → tampil ConfirmationActivity 🎉
