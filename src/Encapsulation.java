public class Encapsulation {
    // Private attributes, encapsulated and not directly accessible from outside the class
    private String name;
    private String NIM;
    private String prodi; // Program Studi

    // Protected attribute, accessible within the class and subclasses
    protected String address;

    // Getter and Setter methods for name, NIM, prodi, and address attributes (encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Constructor to initialize name, NIM, prodi, and address
    public Encapsulation(String name, String NIM, String prodi, String address) {
        this.name = name;
        this.NIM = NIM;
        this.prodi = prodi;
        this.address = address;
    }

    // Method to display information about the student
    public void displayInfo() {
        System.out.println("Nama: " + name);
        System.out.println("NIM: " + NIM);
        System.out.println("Program Studi: " + prodi);
        System.out.println("Alamat: " + address);
    }

    public static void main(String[] args) {
        // Creating an object of the Mahasiswa class
        Encapsulation mahasiswa = new Encapsulation("Firman Ahmad Maulana", "1102210008", "Teknik Komputer", "Ketintang, Surabaya");

        // Using encapsulated methods to access and modify attributes
        mahasiswa.setName("Firman Ahmad Maulana");
        mahasiswa.setNIM("1102210008");
        mahasiswa.setProdi("Teknik Komputer");
        mahasiswa.setAddress("Ketintang, Surabaya");

        // Displaying information using the encapsulated method
        mahasiswa.displayInfo();
    }
}
 