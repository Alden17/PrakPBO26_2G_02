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
