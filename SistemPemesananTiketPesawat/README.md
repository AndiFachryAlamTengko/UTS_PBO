# ✈️ Sistem Pemesanan Tiket Pesawat (Java OOP)

## 📌 Deskripsi

Program ini adalah aplikasi berbasis Java yang digunakan untuk melakukan pemesanan tiket pesawat. Program dibuat menggunakan konsep **Pemrograman Berbasis Objek (PBO)** dengan menerapkan beberapa konsep utama seperti inheritance, encapsulation, polymorphism, perulangan, dan percabangan.

---

## 🎯 Tujuan

* Memahami konsep OOP dalam Java
* Menerapkan inheritance, encapsulation, dan polymorphism
* Menggunakan percabangan dan perulangan dalam program
* Membuat sistem sederhana pemesanan tiket

---

## 🧩 Fitur Program

* Input data penumpang
* Pilihan tujuan penerbangan
* Pilihan kelas (Ekonomi / Bisnis)
* Perhitungan harga + pajak
* Tampilan daftar tiket
* Validasi input (error handling)
* Penyimpanan data menggunakan ArrayList

---

## 🏗️ Struktur Project

```
src/
 └── tiket/
      ├── Tiket.java
      ├── TiketBisnis.java
      ├── Penumpang.java
      └── Main.java
```

---

## 🧠 Konsep OOP yang Digunakan

### 1. Inheritance (Pewarisan)

Class `TiketBisnis` merupakan turunan dari class `Tiket`.

```java
public class TiketBisnis extends Tiket
```

---

### 2. Encapsulation (Enkapsulasi)

Class `Penumpang` menggunakan private attribute dan getter-setter.

```java
private String nama;

public String getNama() { ... }
public void setNama(String nama) { ... }
```

---

### 3. Polymorphism

Method `hitungTotal()` dioverride di class `TiketBisnis`.

```java
@Override
public double hitungTotal()
```

---

### 4. Percabangan

Menggunakan:

* `if-else` → menentukan harga berdasarkan tujuan
* `switch` → menentukan kelas tiket

---

### 5. Perulangan

Menggunakan `for` untuk menampilkan daftar tiket.

```java
for (Tiket t : daftarTiket)
```

---

## ⚠️ Error Handling

Program menggunakan:

* `try-catch` untuk menangani error input
* Validasi input kosong
* Validasi tujuan dan kelas

Contoh:

```java
catch (InputMismatchException e) {
    System.out.println("Input harus angka!");
}
```

---

## 💰 Perhitungan Harga

* Harga berdasarkan tujuan:

  * Jakarta: 1.000.000
  * Surabaya: 800.000
  * Bali: 1.200.000
* Pajak: 10%
* Tambahan kelas bisnis: 500.000

---

## ▶️ Cara Menjalankan Program

1. Buka project di NetBeans / IntelliJ / VS Code
2. Pastikan semua file dalam package `tiket`
3. Jalankan file `Main.java`
4. Ikuti menu yang tersedia

---

## 🖥️ Contoh Output
(assets/image.png)
```
=== SISTEM PEMESANAN TIKET PESAWAT ===
1. Pesan Tiket
2. Lihat Semua Tiket
3. Keluar
```

---

## 👨‍💻 Penulis

Nama: (Isi Nama Kamu)
NIM: (Isi NIM Kamu)
Mata Kuliah: Pemrograman Berbasis Objek

---

## 🚀 Kesimpulan

Program ini berhasil mengimplementasikan konsep OOP dalam Java dengan baik. Sistem mampu menangani input pengguna, melakukan validasi, serta menampilkan data tiket secara terstruktur.

---
