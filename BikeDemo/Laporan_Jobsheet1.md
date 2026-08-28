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
