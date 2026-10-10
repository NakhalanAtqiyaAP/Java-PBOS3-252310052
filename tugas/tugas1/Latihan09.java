import java.util.Scanner;
public class Latihan09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Students biodata = new Students();

        System.out.println("=== Input Data Mahasiswa ===");
        System.out.print("Silakan masukan nama Mahasiswa:");
        String nama = scanner.nextLine();

        System.out.print("Silakan masukan kelas Mahasiswa:");
        String className = scanner.nextLine();
        
        System.out.print("Silakan masukan NPM:");
        int npm = scanner.nextInt();
        
         System.out.print("Silakan masukan semester");
        int semester = scanner.nextInt();
        
        System.out.print("Silakan masukan GPA:");
        float gpa= scanner.nextFloat();

        biodata.setFullname(nama);
        biodata.setClassName(className);
        biodata.setNpm(npm);
        biodata.setGpa(gpa);
        biodata.setSemester(semester);
        

        System.out.println("=== Biodata Mahasiswa ===");
        System.out.println("Nama    : "+ biodata.getFullname());
        System.out.println("Kelas   : "+biodata.getClassName());
        System.out.println("NPM     : "+biodata.getNpm());
        System.out.println("Semester: "+ biodata.getSemester());
        System.out.println("GPA     : "+biodata.getGpa());
    }
}