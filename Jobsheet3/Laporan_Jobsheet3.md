Nama : Alden Dzakwan Septavaryan

Kelas / No : 2G / 02

## Percobaan 1
 
### Code Program
```
package Jobsheet3;

public class Motor {
    public int kecepatan = 0;
    public boolean kontakOn = false;

    public void printStatus(){
        if (kontakOn == true) {
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan+ "\n");
    }
}
```
```
package Jobsheet3;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.kecepatan = 50;
        motor.printStatus();
    }
}
```

### Output Program

<img width="358" height="137" alt="image" src="https://github.com/user-attachments/assets/2148d397-7266-4996-a809-ca1695c3b228" />


## Percobaan 2

### Code Program
```
package Jobsheet3;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public  void nyalakanMesin(){
        kontakOn = true;
    }

    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan(){
        if ( kontakOn == true) {
            kecepatan += 5;
        }else{
            System.out.println("Kecepatan tidak bertambah karena mesin off! \n");
        }
    }

    public void kurangiKecepatan(){
        if ( kontakOn == true) {
            kecepatan -= 5;
        }else{
            System.out.println("Kecepatan tidak bisa berkurang karena mesin off! \n");
        }
    }

    public void printStatus(){
        if (kontakOn == true) {
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan+ "\n");
    }
}
```
```
package Jobsheet3;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.tambahKecepatan();

        motor.nyalakanMesin();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();
        
        motor.matikanMesin();
        motor.printStatus();
    }
}
```

### Output Program

<img width="389" height="393" alt="image" src="https://github.com/user-attachments/assets/cab469fa-4593-43b3-9e61-e0597fe9cb98" />

### Pertanyaan Percobaan 2
1. karena mesin mobil belum dinyalakan sehingga muncul “Kecepatan tidak bisa bertambah karena Mesin Off!”
2. Agar atribut tersebut tidak dapat diakses dan diubah secara sembarangan dari luar class
3. modifikasi code program
```
     public void tambahKecepatan(){
        if ( kontakOn == true) {
            if (kecepatan < 100) {
                kecepatan += 20;
            }else{
                System.out.println("Kecepatan Sudah mencapai batas maksimal");
            }
        }else{
            System.out.println("Kecepatan tidak bertambah karena mesin off! \n");
        }
    }
```
<img width="430" height="560" alt="image" src="https://github.com/user-attachments/assets/a3ce8356-4c6b-4bf1-b8d1-812cdd132b02" />


## Percobaan 3

### Code Program
```
package Jobsheet3;

public class Anggota {
    private String nama;
    private String alamat;
    private float simpanan;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public float getSimpanan() {
        return simpanan;
    }

    public void setor(float uang) {
        simpanan += uang;
    }

    public void pinjam(float uang) {
        simpanan -= uang;
    }

}
```
```
package Jobsheet3;

public class KoperasiDemo {
    public static void main(String[] args) {

        Anggota anggota1 = new Anggota();
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
    }
}
```

### Output Program

<img width="356" height="65" alt="image" src="https://github.com/user-attachments/assets/34b53300-058c-4991-8a57-77040f58a671" />



## Percobaan 4

### Code Program
```
package Jobsheet3;

public class Anggota {
    private String nama;
    private String alamat;
    private float simpanan;

    Anggota(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public float getSimpanan() {
        return simpanan;
    }

    public void setor(float uang) {
        simpanan += uang;
    }

    public void pinjam(float uang) {
        simpanan -= uang;
    }

}
```
```
package Jobsheet3;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Iwan", "Jalan Mawar");
        System.out.println("Simpanan: " + anggota1.getNama()+ " : Rp "+ anggota1.getSimpanan());

        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
    }
}
```
### Output Program

<img width="358" height="84" alt="image" src="https://github.com/user-attachments/assets/bb431c78-8e96-4100-b1e7-f79ab540b540" />

### Pertanyaan Percobaan 3 & 4
1. setter untuk mengubah nilai atribut, sedangkan Getter untuk mengambil nilai atribut
2. Untuk melihat atau mengambil nilai simpanan anggota
3. method setor()
4. Konstruktor adalah method khusus yang otomatis dijalankan saat objek dibuat
5. Nama konstruktor harus sama dengan nama class, tidak memiliki tipe return, dan tidak boleh menggunakan abstract, static, final, atau synchronized
6. Boleh, untuk membatasi pembuatan objek dari luar class
7. Saat objek membutuhkan nilai tertentu ketika pertama kali dibuat
8. Inisialisasi adalah memberikan nilai pada atribut, sedangkan instansiasi adalah membuat objek dari class
9. Method dibuat di dalam class, sedangkan method tidak perlu diinstansiasi dan cukup dipanggil saat dibutuhkan
10. 
