// Kelas dasar (superclass)
class Person {
    private String name;
    private String address;

    // Konstruktor untuk inisialisasi objek Person
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Metode untuk menampilkan informasi Person
    public void displayInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Alamat: " + address);
    }
}

// Kelas turunan (subclass) mewarisi dari kelas Person
class Student extends Person {
    private String nim;
    private String prodi;

    // Konstruktor untuk inisialisasi objek Student
    public Student(String name, String address, String nim, String prodi) {
        // Memanggil konstruktor kelas Person menggunakan "super"
        super(name, address);
        this.nim = nim;
        this.prodi = prodi;
    }

    // Metode untuk menampilkan informasi Student
    @Override
    public void displayInfo() {
        // Memanggil metode displayInfo dari kelas Person menggunakan "super"
        super.displayInfo();
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Membuat objek dari kelas Student
        Student student1 = new Student("Firman Ahmad Maulana", "Ketintang, Surabaya", "1102210008", "Teknik Komputer");

        // Memanggil metode displayInfo dari kelas Student
        student1.displayInfo();
    }
}