Nama : Alden Dzakwan S
Kelas/No: 2G/02

**Code Program**
```
package BikeDemo;

public class BikeDemo {
    public static void main(String[] args) {
        Bike mountainBikel = new Bike();
        Bike mountainBike2 = new Bike();
        RoadBike roadBike1 = new RoadBike();

        mountainBikel.setBrand("Trek");
        mountainBikel.speedAcceleration(10);
        mountainBikel.gearChanges(2);
        mountainBikel.printInfo();

        mountainBike2.setBrand("Giant");
        mountainBike2.speedAcceleration(20);
        mountainBike2.gearChanges(3);
        mountainBike2.printInfo();

        roadBike1.setBrand("Specialized");
        roadBike1.setTireWidth(25);
        roadBike1.speedAcceleration(15);
        roadBike1.gearChanges(4);
        roadBike1.printInfo();
    }
}
```
```
package BikeDemo;

public class Bike {
    private String brand;
    private int speed;
    private int gear = 1;
    // Gear 1: max 5 km/h, Gear 2: max 10 km/h, ... Gear 6: max 60 km/h
    private final int[] GEAR_SPEED_LIMITS = { 5, 10, 25, 30, 40, 60 };

    public void setBrand(String brandName) {
        brand = brandName;
    }

    public void gearChanges(int gearValue) {
        if (gearValue < 1 || gearValue > 6) {
            System.out.println("Invalid gear value. Gear must be between 1 and 6.");
        }

        else {
            gear = gearValue;
        }
    }

    public int speedAcceleration(int increment) {
        speed += increment;
        if (speed > GEAR_SPEED_LIMITS[gear - 1]) {
            speed = GEAR_SPEED_LIMITS[gear - 1];
        }
        return speed;
    }

    public int speedDeceleration(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
        return speed;
    }

    public void printInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed);
        System.out.println("Gear : " + gear);
    }
}
```
```
package BikeDemo;

public class RoadBike extends Bike {
    private int tireWidth;

    public void setTireWidth(int width) {
        tireWidth = width;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Tire Width : " + tireWidth + " mm");
        System.out.println("Bike Type : Road Bike");
    }
}

```
**Percobaan 1**

<img width="178" height="109" alt="Screenshot 2026-08-28 083726" src="https://github.com/user-attachments/assets/b56222a4-0f6c-404d-a393-54ea57842a8a" />

**Percobaan 2**

<img width="254" height="205" alt="Screenshot 2026-08-28 083734" src="https://github.com/user-attachments/assets/25585b12-a558-4e60-8830-09457654b978" />

**Pertanyaan**
1. Jelaskan perbedaan antara object dengan class!
2. Jelaskan alasan gear dan brand dapat menjadi atribut dari object Bike!
3. Sebutkan salah satu kelebihan utama dari pemrograman berorientasi objek dibandingkan
dengan pemrograman prosedural!
4. Apakah diperbolehkan melakukan pendefinisian dua buah atribut dalam satu baris kode seperti
“public String nama, alamat;”?
5. Pada class RoadBike, jelaskan alasan atribut brand, speed, dan gear tidak lagi ditulis di dalam
class tersebut!

**Jawaban**
1. Class adalah cetakan atau blueprint untuk membuat objek, sedangkan object adalah hasil nyata dari class.
2. Gear dan brand dapat menjadi atribut Bike karena keduanya merupakan karakteristik atau data yang dimiliki oleh sebuah sepeda.
3. Salah satu kelebihannya adalah kode lebih mudah dikelola dan dikembangkan karena menggunakan konsep seperti inheritance dan encapsulation.
4. Ya, boleh. Dua atribut dapat didefinisikan dalam satu baris, seperti public String nama, alamat;.
5. Karena RoadBike merupakan turunan dari class Bike, sehingga atribut brand, speed, dan gear diwarisi dari class Bike dan tidak perlu ditulis ulang.

**Tugas Praktikum**

Foto Objek: 

<img width="1200" height="1600" alt="WhatsApp Image 2026-09-01 at 21 01 22" src="https://github.com/user-attachments/assets/2718e82d-e523-4a9f-acbf-727335f90bd1" />

<img width="1200" height="1600" alt="WhatsApp Image 2026-09-01 at 21 00 17 (1)" src="https://github.com/user-attachments/assets/23e7fdfa-fe03-4321-ae6f-9143ae7eba32" />

<img width="1200" height="1600" alt="WhatsApp Image 2026-09-01 at 21 00 17" src="https://github.com/user-attachments/assets/0a25f0fb-0f27-445f-8969-2bc74e25f9b6" />

<img width="1204" height="1600" alt="WhatsApp Image 2026-09-01 at 20 59 00" src="https://github.com/user-attachments/assets/7ae42ec7-937e-4092-9698-50511a812cb0" />

**Code Program**
```
package BikeDemo;

public class TugasDemo {
    public static void main(String[] args) {
        Tas tas1 = new Tas();
        tas1.setMerk("Lenovo");
        tas1.tambahBarang("Buku");
        tas1.printInfo();
        System.out.println();

        Magicom magicom1 = new Magicom();
        magicom1.setMerk("Miyako");
        magicom1.masak();
        magicom1.printInfo();
        System.out.println();

        Gadget gadget1 = new Gadget();
        gadget1.setMerk("Gadget Umum");
        gadget1.nyalakan();
        gadget1.printInfo();
        System.out.println();

        Laptop laptop1 = new Laptop();
        laptop1.setMerk("Lenovo");
        laptop1.setSpek(8, "Windows 11");
        laptop1.nyalakan();
        laptop1.buka("VsCode");
        laptop1.printInfo();
        System.out.println();

        Hp hp1 = new Hp();
        hp1.setMerk("Infinix");
        hp1.setSpek(50, 256);
        hp1.nyalakan();
        hp1.foto();
        hp1.printInfo();
    }
}
```
```
package BikeDemo;

public class Tas {
    private String merk;
    private int kapasitas;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void tambahBarang(String barang) {
        System.out.println(barang + " dimasukkan ke tas.");
    }

    public void printInfo() {
        System.out.println("Merk      : " + merk);
        System.out.println("Kapasitas : " + kapasitas + " liter");
    }
}
```

```
package BikeDemo;

public class Magicom {
    private String merk;
    private boolean nyala;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void masak() {
        nyala = true;
        System.out.println(merk + " sedang memasak nasi.");
    }

    public void printInfo() {
        System.out.println("Merk   : " + merk);
        System.out.println("Status : " + (nyala ? "Nyala" : "Mati"));
    }
}
```

```
package BikeDemo;

public class Gadget {
    private String merk;
    private boolean hidup;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void nyalakan() {
        hidup = true;
        System.out.println(merk + " dinyalakan.");
    }

    public void printInfo() {
        System.out.println("Merk    : " + merk);
        System.out.println("Status : " + (hidup ? "Hidup" : "Mati"));
    }
}
```

```
package BikeDemo;

public class Hp extends Gadget {
    private int kamera;
    private int memori;

    public void setSpek(int kamera, int memori) {
        this.kamera = kamera;
        this.memori = memori;
    }

    public void foto() {
        System.out.println("Mengambil foto dengan kamera " + kamera + " MP.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Kamera  : " + kamera + " MP");
        System.out.println("Memori  : " + memori + " GB");
    }
}
```
```
package BikeDemo;

public class Laptop extends Gadget {
    private int ram;
    private String os;

    public void setSpek(int ram, String os) {
        this.ram = ram;
        this.os = os;
    }

    public void buka(String aplikasi) {
        System.out.println("Membuka " + aplikasi + " di laptop.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("RAM : " + ram + " GB");
        System.out.println("OS  : " + os);
    }
}
```
**Output Program**

<img width="376" height="480" alt="image" src="https://github.com/user-attachments/assets/06f194d1-c931-4467-8761-b1bfcc43a490" />



