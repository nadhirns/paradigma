// public class OOP {
//     String nama1 = "Tony";
//     String nama2 = "Stark";
//     int umur = 37;
//     public static void main(String[] args) {
//         OOP myObj = new OOP();
//         System.out.println("Name: " + myObj.nama1 + " " + myObj.nama2);
//         System.out.println("Age: " + myObj.umur);
//     }
// }

// public class OOP {
//     static void myStaticMethod() {
//         System.out.println("Metode statis dapat dipanggil" 
//         + "tanpa harus membuat objek");
//     }

//     public void myPublicMethod() {
//         System.out.println("Metode publik harus dipanggil" 
//         + "dengan membuat objek");
//     }

//     public static void main(String[] args) {
//         myStaticMethod();
//         OOP myObj = new OOP();
//         myObj.myPublicMethod();
//     }
// }
    
// public class OOP {
//     int x;

//     public OOP(int y) {
//         x = y;
//     }

//     public static void main(String[] args) {
//         OOP myObj = new OOP(10);
//         System.out.println(myObj.x);
//     }
// }

// public class OOP {
//     final int x = 10;
//     final double PI = 3.14;

//     public static void main(String[] args) {
//         OOP myObj = new OOP();
//         myObj.x = 50;
//         myObj.PI = 25;
//         System.out.println(myObj.x);
//     }
// }

abstract class OOP {
    public String nama1 = "Tony";
    public int umur = 37;
    public abstract void study();
}

class Student extends OOP {
    public int tahunLulus = 2018;
    public void study() {
        System.out.println("Belajar sepanjang hari");
    }
}