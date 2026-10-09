**Alden Dzakwan S**
**254107020106**

# Laporan Jobsheet 7

## Percobaan 1

<img width="416" height="129" alt="image" src="https://github.com/user-attachments/assets/5658d3c6-fa68-4fdc-9316-6a8e2892c7b4" />


**langkah 4**

<img width="723" height="70" alt="image" src="https://github.com/user-attachments/assets/49eb25d0-a9f3-432b-abe4-20590c6b806c" />


<img width="729" height="76" alt="image" src="https://github.com/user-attachments/assets/02ff7301-e8c6-4cde-8b1f-9036969bb45e" />

<img width="359" height="119" alt="image" src="https://github.com/user-attachments/assets/d45edd2b-54b5-48b0-87f2-0c2ab514baf4" />


### Jawaban
1. kali(int, int) dan kali(int, int, int) dibedakan oleh jumlah parameter.
   kali(int, int) dan kali(double, double) dibedakan oleh tipe parameter.
   tampilkan(int, String) dan tampilkan(String, int) dibedakan oleh urutan tipe parameter.
2. Method kali(double, double) dipanggil karena kedua argumen bertipe double. Versi kali(int, int) tidak dipilih karena nilai double tidak otomatis dikonversi menjadi int.
3. Keduanya sah karena urutan tipe parameternya berbeda. Tipe kembalian dan nama variabel parameter tidak termasuk pembeda signature method, sehingga jika hanya kedua hal itu yang berbeda, Java menganggapnya sebagai deklarasi method yang sama.
4. Karena Java dapat melakukan widening dari int ke double. Argumen 5 dapat dikonversi menjadi 5.0, sehingga method kali(double, double) dapat dipanggil dan menghasilkan 5.0 × 2.5 = 12.5.
   
## Percobaan 2

<img width="375" height="163" alt="image" src="https://github.com/user-attachments/assets/a05f6986-3eab-44a7-aaaf-869c5d1c6a24" />

**Eksperimen2**

<img width="735" height="53" alt="image" src="https://github.com/user-attachments/assets/51e21095-d1b1-42e5-8735-9b15d8173ecb" />

### Jawaban
1. Karena Java memprioritaskan konversi widening pada fase pertama sebelum melakukan boxing. Nilai int dapat dikonversi menjadi long, sehingga tampil(long) dipilih lebih dahulu.
2. Jika tampil(long) dihapus, Java memilih tampil(Integer). Jika Integer juga dihapus, pemanggilan beralih ke Object, lalu ke int... jika pilihan sebelumnya tidak tersedia.
3. tampilLong(5) mengalami error karena Java tidak mengizinkan konversi int menjadi long, kemudian menjadi Long dalam satu proses pemilihan method. Sementara itu, tampil(5) dapat menggunakan Object melalui autoboxing menjadi Integer.
4. Pemanggilan tampil((short)3) dan tampil('A') sama-sama memilih tampil(long) karena keduanya dapat dikonversi melalui pelebaran tipe primitif. Hasilnya adalah 3 dan 65.


## Percobaan 3

<img width="386" height="134" alt="image" src="https://github.com/user-attachments/assets/8152542d-a51b-4a89-93d7-d6f0e48c0568" />

**Eksperimen3**

<img width="674" height="54" alt="image" src="https://github.com/user-attachments/assets/11ba2a2d-690a-4c8a-b311-bc74cba8c06e" />

### Jawaban
1. Saat new Kucing("Tom") dipanggil, constructor satu parameter menjalankan this(nama, 1) terlebih dahulu. Constructor dua parameter dijalankan sebelum pesan constructor satu parameter ditampilkan
2. this(nama, 1) digunakan untuk memanggil constructor lain agar inisialisasi tidak perlu ditulis berulang. Cara ini juga membuat kode lebih konsisten.
3. Tambahkan constructor public Kucing() { this("Tanpa Nama"); System.out.println("Konstruktor 0 parameter selesai"); }. Constructor akan berjalan berurutan dari dua parameter, satu parameter, lalu nol parameter.

   
## Percobaan 4

<img width="362" height="109" alt="image" src="https://github.com/user-attachments/assets/5bac1023-a3c8-462c-bef2-b1b3f664509f" />

**Eksperimen4**
1.  <img width="622" height="125" alt="image" src="https://github.com/user-attachments/assets/badc967f-85f3-434b-a388-554193bb7a5b" />

2.  <img width="1286" height="224" alt="image" src="https://github.com/user-attachments/assets/bbaaec45-0278-4f0e-b269-01b2eecb6839" />

3.  <img width="542" height="144" alt="image" src="https://github.com/user-attachments/assets/dd11e9ad-0324-4632-a61c-cdd6e980281f" />

### Jawaban
1. Pemanggilan a.swim() menampilkan Ikan bisa berenang, sedangkan c.swim() menampilkan pesan ikan dan piranha karena menggunakan super.swim(). Jika super.swim() dihapus, hanya pesan piranha yang ditampilkan.
2. Covariant return memungkinkan method subclass mengembalikan tipe yang lebih spesifik, seperti Piranha sebagai turunan Ikan. Namun, Piranha anak = a.beranak() tidak dapat dilakukan langsung jika tipe deklarasi a adalah Ikan.
3. Mengurangi akses public, mengubah method superclass menjadi final, atau menambahkan throws Exception pada overriding dapat menyebabkan error.
4. Jika @Override dihapus dari swim(int), program dapat dikompilasi sebagai method baru selama tidak ada masalah lain. Method tersebut merupakan overloading, bukan overriding, sehingga pemanggilan c.swim() tetap menggunakan method tanpa parameter.
5. Jika Ikan.swim() dibuat private, method tersebut tidak diwariskan untuk di-override oleh subclass. Akibatnya, penggunaan @Override pada method swim() milik Piranha akan menyebabkan error.
   
## Percobaan 5

<img width="448" height="447" alt="image" src="https://github.com/user-attachments/assets/4ce2ef53-b871-4100-8ba3-6c454b228ef7" />

### Jawaban
1. Overloading terjadi pada getGaji() dan getGaji(int, double) di kelas Staff karena parameternya berbeda. Overriding terjadi ketika Staff atau Manager mendefinisikan ulang method getGaji() dan lihatInfo() dari Karyawan.
2. super.getGaji() digunakan untuk mengambil gaji dasar sebelum ditambah upah lembur. Jika method getGaji() memanggil dirinya sendiri tanpa kondisi berhenti, program dapat mengalami StackOverflowError.
3. Jika perhitungan hanya mengembalikan jamLembur * tarifLembur, gaji dasar tidak ikut dihitung. Gaji Manager tetap mengikuti implementasi method miliknya sendiri.
4. Hubungan Manager dengan Karyawan merupakan inheritance karena Manager mewarisi Karyawan. Hubungan Manager dengan Staff merupakan hubungan has-a karena Manager menyimpan daftar bawahan dalam array Staff[].

## Tugas Mandiri

### Tugas 1

<img width="381" height="124" alt="image" src="https://github.com/user-attachments/assets/4d3c2806-f4f1-4628-9030-d3ef2a3e0b36" />

### Pertanyaan Analisis
1. Pertanyaan analisis (a). Kedua method keliling() merupakan overloading karena jumlah parameternya berbeda, yaitu tiga parameter dan dua parameter. Perbedaan tipe kembalian bukan alasan yang membuat overloading sah.
2. Pertanyaan analisis (b). Pemanggilan t.keliling(3, 4.0) menyebabkan error karena tidak ada method yang menerima kombinasi parameter (int, double). Java menampilkan pesan seperti no suitable method found for keliling(int,double).

### Tugas 2

<img width="455" height="264" alt="image" src="https://github.com/user-attachments/assets/cd37e7c2-4470-443b-91d3-ae19be506f47" />

### Pertanyaan Analisis

1. Pertanyaan analisis (a). Mahasiswa.bernafas() menggunakan method warisan dari Manusia karena tidak di-override. Sementara itu, makan() menampilkan teks mahasiswa karena method tersebut sudah di-override.
2. Pertanyaan analisis (b). Dosen.makan() menampilkan pesan makan nasi terlebih dahulu karena memanggil super.makan(), lalu menampilkan pesan makan di kantin fakultas. Mahasiswa.makan() tidak memanggil super.makan(), sehingga hanya menampilkan pesan makan di kantin kampus.

### Tugas 3 Jawab Singkat
1. Aspek	Overloading	Overriding
  Lokasi terjadi = Umumnya dalam kelas yang sama	Pada subclass
  Signature (parameter) =	Jumlah, tipe, atau urutan parameter berbeda	Nama dan parameter sama
  Tipe kembalian = Boleh berbeda jika parameternya berbeda	Sama atau tipe turunan yang sesuai
  Access modifier	= Mengikuti aturan akses Java	Tidak boleh lebih terbatas dari method induk
  Peran @Override	= Tidak digunakan	Memastikan method benar-benar melakukan overriding
2. Overloading digunakan ketika satu fungsi memiliki variasi parameter, misalnya keliling(int, int) dan keliling(int, int, int). Overriding digunakan untuk mengubah perilaku method dari superclass, misalnya Mahasiswa.makan().
3. Method static merupakan milik kelas sehingga hanya dapat disembunyikan (method hiding), bukan di-override. Method private tidak diwariskan untuk di-override, sedangkan method final secara khusus melarang overriding.
