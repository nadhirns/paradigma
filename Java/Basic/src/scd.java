public class scd {
    public static void main(String[] args) {
        Student myObj = new Student();

        System.out.println("Name :" + myObj.nama1);
        System.out.println("Age :" + myObj.umur);
        System.out.println("Lulus Tahun :" + myObj.tahunLulus);
        myObj.study();
    }
}
