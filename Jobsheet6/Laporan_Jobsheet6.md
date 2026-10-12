**Alden Dzakwan S**
**254107020106**

# Laporan Jobsheet 6

## Percobaan 1

<img width="341" height="89" alt="image" src="https://github.com/user-attachments/assets/f3dd9169-6156-4796-92a0-1e6cabd20829" />

### Jawaban Pertanyaan Percobaan 1 
1. Kompilasi gagal karena ClassB belum mewarisi ClassA, sehingga x dan y tidak dikenali. Error pertama biasanya cannot find symbol: variable x pada ClassB.java, di baris perhitungan getJumlah().
2. Baris public class ClassB diubah menjadi public class ClassB extends ClassA. ClassA menjadi superclass, sedangkan ClassB menjadi subclass.
3. ClassA memiliki atribut x, y, dan method getNilai(). ClassB memiliki atribut z serta method getNilaiZ() dan getJumlah().
4. hitung.x = 20 diperbolehkan karena objek ClassB mewarisi atribut x yang bersifat public dari ClassA. Karena itu, atribut tersebut bisa diakses langsung melalui objek ClassB.
5. Atribut public berisiko diubah sembarangan dari luar class sehingga nilainya tidak terkontrol. Penggunaan private dengan getter dan setter dapat membantu mengatur akses terhadap atribut.
6. Deklarasi extends ClassA, ClassD menghasilkan error karena Java tidak mendukung pewarisan dari dua superclass langsung. Satu class Java hanya dapat memiliki satu superclass langsung.

## Percobaan 2

<img width="366" height="102" alt="image" src="https://github.com/user-attachments/assets/a38eba66-bbf9-414c-9d4b-d2c3cf33a088" />


### Jawaban Pertanyaan Percobaan 2
1. Error muncul pada ClassB.java baris 15 di bagian (x + y + z), dengan pesan x has private access in ClassA dan y has private access in ClassA. Error tidak muncul di MainPercobaan2 karena main hanya memanggil method public.
2. Berdasarkan tabel akses, atribut private hanya dapat diakses langsung dari class tempat atribut tersebut dideklarasikan. Karena itu, subclass tidak dapat mengakses x dan y secara langsung.
3. setX(20) diperbolehkan karena method tersebut bersifat public. Nilai 20 disimpan pada atribut x milik objek ClassB yang diwarisi dari ClassA.
4. Perbaikan A menggunakan protected, sehingga subclass dapat mengakses atribut secara langsung. Perbaikan B menggunakan private dan getter, yang lebih menjaga enkapsulasi karena akses terhadap atribut dikontrol melalui method.
5. Jika berbeda package, subclass tetap dapat mengakses atribut protected melalui pewarisan. Namun, atribut dengan akses default tidak dapat diakses dari subclass yang berada di package berbeda.


## Percobaan 3

<img width="371" height="44" alt="image" src="https://github.com/user-attachments/assets/15165835-38ab-49ee-b257-406b7c9dafff" />

**Eksperimen 3**

<img width="402" height="121" alt="image" src="https://github.com/user-attachments/assets/40f5ebfe-1a3b-4a42-9bfa-a684305ad110" />

### Jawaban Pertanyaan Percobaan 3
1. super.phi = phi dan super.r = r digunakan untuk mengisi atribut milik superclass Bangun. Sementara itu, phi dan r di sebelah kanan merupakan parameter method.
2. super.phi dan super.r mengakses atribut dari Bangun, sedangkan this.t mengakses atribut t milik objek Tabung. Ketiganya digunakan untuk menghitung volume tabung.
3. Tabung dapat mengakses phi dan r karena keduanya bersifat protected. Jika diubah menjadi private, atribut tersebut tidak dapat diakses langsung dari Tabung.
4. Output tidak berubah ketika super.phi diganti dengan this.phi karena tidak ada atribut phi lain yang dideklarasikan di Tabung. Keduanya merujuk pada atribut warisan yang sama.
5. r dan this.r merujuk pada atribut r milik Tabung, sedangkan super.r merujuk pada atribut r milik Bangun. Kata kunci super diperlukan ketika kita ingin membedakan atribut superclass dari atribut subclass yang memiliki nama sama.


## Percobaan 4

<img width="355" height="81" alt="image" src="https://github.com/user-attachments/assets/112c816f-fd2f-437f-ba5d-846f6d685c44" />


### Jawaban Pertanyaan Percobaan 4
1. ClassA adalah superclass dari ClassB, sedangkan ClassB adalah superclass dari ClassC. ClassB berperan ganda karena menjadi subclass dari ClassA sekaligus superclass dari ClassC.
2. Ketika objek ClassC dibuat, konstruktor superclass dijalankan lebih dahulu. Karena itu, konstruktor ClassA dan ClassB tetap berjalan sebelum konstruktor ClassC.
3. Output tidak berubah karena pemanggilan super() tanpa parameter sudah ditambahkan secara otomatis oleh Java jika tidak ditulis. Menuliskannya secara eksplisit hanya memperjelas pemanggilan konstruktor superclass.
4. Error terjadi karena super() tidak diletakkan sebagai pernyataan pertama di dalam konstruktor. Java menetapkan aturan ini agar inisialisasi superclass selesai sebelum kode konstruktor subclass dijalankan.
5. Urutannya adalah: (1) new ClassC() dipanggil, (2) konstruktor ClassC memanggil konstruktor ClassB, (3) konstruktor ClassB memanggil konstruktor ClassA, (4) pesan konstruktor A dicetak, (5) pesan konstruktor B dicetak, dan (6) pesan konstruktor C dicetak.


## Percobaan 5

<img width="363" height="230" alt="image" src="https://github.com/user-attachments/assets/27c3e9ef-22c7-4e1d-8cf4-cd16da3d379a" />


### Jawaban Pertanyaan Percobaan 5
1. super(merk, memory, cpu) memanggil konstruktor Komputer untuk mengisi atribut merk, kapasitasMemory, dan kecepatanCPU. Baris this.printer = printer mengisi atribut khusus Desktop.
2. Pada Percobaan 4, superclass memiliki konstruktor tanpa parameter sehingga super() otomatis dapat dipanggil. Pada Percobaan 5, Komputer hanya memiliki konstruktor berparameter, sehingga super(...) harus ditulis dengan argumen yang sesuai.
3. Kondisi tersebut disebut overriding karena Desktop mendefinisikan ulang method showInfo() dari Komputer. Jika super.showInfo() dihapus, informasi merek, memori, dan CPU tidak ditampilkan; hanya informasi printer yang muncul.
4. Dengan @Override, compiler memeriksa apakah method benar-benar menimpa method superclass. Tanpa anotasi tersebut, showinfo() dianggap method baru sehingga kesalahan penulisan nama tidak terdeteksi.
5. <img width="396" height="345" alt="image" src="https://github.com/user-attachments/assets/184a8597-283c-49a7-a656-157fdb3cf0d7" />


 ## Tugas Mandiri

**Tugas 1**

<img width="395" height="65" alt="image" src="https://github.com/user-attachments/assets/601e2753-a07c-46e2-b4eb-a66386563414" />

**Jawaban Analisis**
a. Array Pegawai[] dapat menampung objek Dosen karena Dosen merupakan subclass dari Pegawai. Ini merupakan contoh polimorfisme pada pewarisan.
b. Method getGaji() milik Dosen yang dijalankan ketika objeknya adalah Dosen. Java memilih implementasi berdasarkan tipe objek sebenarnya, bukan hanya tipe referensi array.

**Tugas 2**

<img width="400" height="126" alt="image" src="https://github.com/user-attachments/assets/9addedef-e26d-498e-b490-86b3955f9b0b" />

**Tugas 4 Jawaban Singkat**
1. Perbedaan is-a dan has-a
- is-a menunjukkan hubungan pewarisan, yaitu suatu class merupakan jenis dari class lain. Contohnya, Dosen adalah Pegawai.
- has-a menunjukkan suatu class memiliki atau menyimpan objek class lain. Contohnya, DaftarGaji memiliki kumpulan objek Pegawai.
2. Aturan private, protected, dan konstruktor
- private: hanya dapat diakses langsung dari class tempat atribut atau method dideklarasikan.
- protected: dapat diakses oleh class dalam package yang sama dan subclass sesuai aturan Java.
- Konstruktor tidak diwariskan, tetapi konstruktor superclass dijalankan sebelum konstruktor subclass. Jika superclass hanya memiliki konstruktor berparameter, subclass perlu memanggilnya menggunakan super(...).
