# Laporan Jobsheet 4

Nama : Alden Dzakwan S

Kelas / No : 2G / 02

## Percobaan 1

**Output**

<img width="352" height="188" alt="image" src="https://github.com/user-attachments/assets/141d9823-4a35-4ebb-ad8c-864b40a77bfa" />

**Jawaban Pertanyaan Percobaan 1**
1. Setter digunakan untuk mengisi atau mengubah nilai atribut, sedangkan getter digunakan untuk mengambil nilai atribut.
2. Constructor default tidak membutuhkan parameter saat objek dibuat. Constructor parameterized membutuhkan nilai tertentu
3. Atribut proc bertipe object <img width="228" height="17" alt="image" src="https://github.com/user-attachments/assets/3f3cba73-aa32-4bf9-b113-8f97f401d520" />

4. Untuk memanggil method info() milik objek Processor sehingga informasi processor ikut ditampilkan.
5. Langkah 8 menggunakan setCache(4), sehingga cache yang ditampilkan adalah 4.00. Sedangkan langkah 10 menggunakan new Processor("Intel i5", 3), sehingga cache yang ditampilkan 3.00.
6. Termasuk Aggregation. Buktinya objek Processor dibuat di luar Laptop
7. Laptop membuat Processor sendiri. Jadi relasinya adalah Composition, karena bagian dibuat dan dimiliki langsung oleh objek Laptop.


## Percobaan 2

**Output**

<img width="365" height="56" alt="image" src="https://github.com/user-attachments/assets/265feb6e-af79-4b11-8500-65ef647c3f3a" />

**Jawaban Pertanyaan Percobaan 2**
1. <img width="265" height="41" alt="image" src="https://github.com/user-attachments/assets/3731fd4c-e21a-4a18-bdb6-e8df604b432e" />

2. Karena biaya mobil dan sopir dihitung berdasarkan jumlah hari
3. Untuk menghitung biaya sewa mobil dan biaya sopir berdasarkan jumlah hari.
4. Untuk memasukkan objek Mobil dan Sopir ke dalam objek Pelanggan
5. Untuk mendapatkan total biaya mobil dan sopir selama jumlah hari yang ditentukan
6. ertama p.getMobil() mengambil objek Mobil dari pelanggan. Setelah itu getMerk() dipanggil untuk mengambil merk mobil tersebut
7. Akan terjadi NullPointerException saat hitungBiayaTotal() dijalankan karena mobil masih bernilai null

## Percobaan 3

**Output**

Main Percobaan3

<img width="368" height="187" alt="image" src="https://github.com/user-attachments/assets/e745d492-6e08-4c38-9188-9a2490a4dfb2" />

Main Pertanyaan

<img width="349" height="133" alt="image" src="https://github.com/user-attachments/assets/6f6b0403-4bc4-414d-a642-3d7b32031ad0" />

**Jawaban Pertanyaan Percobaan 3**
1. Untuk mengambil dan menampilkan informasi dari objek Pegawai yang berperan sebagai masinis atau asisten.
2. Program mengalami NullPointerException. Penyebabnya adalah constructor tiga parameter tidak mengisi asisten, sehingga asisten masih null
3. isinya adalah null
4. Tidak, karena kedua constructor selalu menerima masinis. Jadi masinis diisi ketika objek KeretaApi dibuat
5. Iya, mereka dua objek pegawai yg berbeda

   
## Percobaan 4

**Output**
<img width="359" height="297" alt="image" src="https://github.com/user-attachments/assets/f1d7335d-45e8-4f19-aec0-f9785ab2c130" />

**Jawaban Pertanyaan Percobaan 4**
1. 10 Kursi
2. Untuk mengecek apakah kursi tersebut sudah memiliki penumpang. Kalau belum, bagian informasi penumpang tidak ditampilkan
3. Karena nomor kursi dimulai dari 1, sedangkan index array Java dimulai dari 0
4. Penumpang pada kursi 1 akan diganti dari Mr. Krab menjadi Budi. Tidak terjadi error karena method setPenumpang() langsung mengganti referensi penumpang
5. Mengubah method setPenumpang<img width="525" height="146" alt="image" src="https://github.com/user-attachments/assets/b4e1eb03-e823-4f03-be3e-5bf0f2960048" />

6. Kalau jumlah objek yg sejenis/berhubungan banyak lebih baik menggunakan array, jika hanya satu objek lebih baik menggunakan individual
7. Gerbong yang membuat Kursi, sehingga Composition, dan Penumpang dibuat di luar Kursi, sehingga Aggregation
   
## Percobaan 5

**Output**

<img width="349" height="57" alt="image" src="https://github.com/user-attachments/assets/8c2cebe9-ec51-4b99-a36c-9ee59b53e02f" />

**Jawaban Pertanyaan Percobaan 5**
1. Baris 10 pada class Mobilp5 <img width="346" height="32" alt="image" src="https://github.com/user-attachments/assets/a47353df-0763-4e6b-953a-e675730345cd" />

2. Jika setMesin() digunakan untuk memasukkan mesin yang dibuat dari luar, hubungan tersebut tidak lagi menunjukkan kepemilikan eksklusif seperti sebelumnya dan mengarah ke Aggregation
3. Pada Laptop-Processor, Processor dibuat di luar Laptop lalu diberikan ke Laptop. Pada Mobil-Mesin, Mesin dibuat langsung di dalam constructor Mobil
4. Mesin tersebut tidak lagi digunakan karena hanya dimiliki oleh Mobil tersebut
5. Jika constructor tersebut digunakan dengan Mesin yang dibuat dari luar, maka pola hubungannya menjadi Aggregation, karena Mobil menerima objek Mesin yang sudah dibuat dari luar

## Percobaan 6

**Output**

<img width="370" height="77" alt="image" src="https://github.com/user-attachments/assets/683611c3-1fb0-4bbe-96aa-6cfbeddb2518" />


**Jawaban Pertanyaan Percobaan 6**
1. Tidak, pada Percobaan 1 Processor disimpan sebagai bagian dari objek Laptop, sedangkan Printer pada Percobaan 6 hanya digunakan sementara di dalam method
2. Tidak. Printer hanya digunakan sebagai parameter method
3. Karena Laptop hanya menggunakan Printer sementara melalui parameter method**. Printertidak disimpan sebagai atribut di dalam Laptop
4. Ya, relasinya menjadi Aggregation apabila Printer disimpan sebagai atribut dan objek Printer diberikan dari luar
5. - Aggregation: objek bagian disimpan sebagai atribut, tetapi objek tersebut dibuat dari luar class pemilik.
   - Composition: objek bagian disimpan sebagai atribut dan dibuat langsung oleh class pemilik.
   - Dependency: objek tidak disimpan sebagai atribut, tetapi hanya digunakan sementara, biasanya melalui parameter method

## Tugas Mandiri

1. - Agregation : Pustakawan diberikan dari luar saat membuat objek Perpustakaan, jadi masih bisa ada tanpa perpustakaan <img width="362" height="28" alt="image" src="https://github.com/user-attachments/assets/27833f7b-065e-40bb-9da7-46864f8749b9" />

   - Composition : Rak membuat dan mengisi objek Buku sendiri melalui new Buku(...), sehingga buku menjadi bagian dari rak <img width="256" height="23" alt="image" src="https://github.com/user-attachments/assets/b19c55cf-e6b2-44f6-acb3-c470340a4fdf" />

   - Dependency : Printer hanya digunakan sementara sebagai parameter pada method cetakLaporan(Printer printer), bukan sebagai atribut Perpustakaan <img width="421" height="23" alt="image" src="https://github.com/user-attachments/assets/826ecb60-fedc-4be0-a6f9-24b36a7a068d" />



2. Kita menentukan jenis relasi dengan melihat apakah suatu class memiliki, membuat, atau hanya menggunakan class lain. Jika objek masih bisa berdiri sendiri gunakan Aggregation, jika bergantung pada objek utama gunakan Composition, dan jika hanya digunakan sementara gunakan Dependency. Pertanyaan kuncinya adalah: “Apakah objek ini tetap ada tanpa objek utama, dibuat oleh siapa, dan apakah hanya digunakan sementara?

**Output**

<img width="396" height="300" alt="image" src="https://github.com/user-attachments/assets/7d5708c4-ce22-40fa-acfa-9af54c567308" />


