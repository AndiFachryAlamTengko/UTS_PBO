# Sistem Pemesanan Tiket Pesawat (Java)

Program ini merupakan program sederhana yang dibuat menggunakan bahasa pemrograman Java untuk melakukan pemesanan tiket pesawat. Program ini dibuat dengan tujuan untuk memahami konsep dasar Pemrograman Berbasis Objek (OOP) serta bagaimana penerapannya dalam sebuah program.

Saat program dijalankan, akan muncul menu utama yang berisi beberapa pilihan, yaitu memesan tiket, melihat data tiket yang sudah dimasukkan, dan keluar dari program. Pengguna bisa memilih menu sesuai kebutuhan.

Jika pengguna memilih untuk memesan tiket, maka program akan meminta beberapa input seperti nama penumpang, tujuan perjalanan, serta kelas tiket yang diinginkan. Tujuan yang tersedia dalam program ini adalah Jakarta, Surabaya, dan Bali. Setiap tujuan memiliki harga yang berbeda-beda.

Setelah pengguna memilih tujuan, program akan menentukan harga tiket menggunakan percabangan (if-else). Kemudian, pengguna diminta untuk memilih kelas tiket, yaitu ekonomi atau bisnis. Jika memilih kelas bisnis, maka akan ada tambahan biaya dan fasilitas tambahan dibandingkan dengan kelas ekonomi.

Program ini juga menghitung total harga tiket dengan menambahkan pajak sebesar 10%. Perhitungan ini dilakukan secara otomatis oleh sistem sehingga pengguna tidak perlu menghitung secara manual.

Setiap data tiket yang dimasukkan akan disimpan ke dalam ArrayList. Dengan adanya penyimpanan ini, pengguna dapat melihat kembali semua data tiket yang telah dipesan melalui menu yang tersedia. Data akan ditampilkan satu per satu menggunakan perulangan (looping).

Dalam pembuatan program ini juga diterapkan beberapa konsep OOP, seperti inheritance, encapsulation, dan polymorphism. Inheritance digunakan pada class TiketBisnis yang merupakan turunan dari class Tiket. Encapsulation digunakan pada class Penumpang dengan menggunakan atribut private serta method getter dan setter. Sedangkan polymorphism diterapkan pada method hitungTotal() yang memiliki perilaku berbeda pada masing-masing class.

Selain itu, program ini juga dilengkapi dengan error handling menggunakan try-catch. Hal ini bertujuan agar program tidak langsung berhenti ketika terjadi kesalahan input, seperti ketika pengguna memasukkan data yang tidak sesuai atau kosong.

Secara keseluruhan, program ini sudah berjalan dengan baik dan mampu melakukan proses pemesanan tiket pesawat secara sederhana. Program ini juga dapat dikembangkan lebih lanjut, misalnya dengan menambahkan tampilan berbasis GUI atau menyimpan data ke dalam database agar lebih kompleks dan menarik.
