
import java.util.ArrayList;

public class BelajarArray{
	public static void main(String[] args){
	ArrayList<String> mahasiswa = new ArrayList<>();
	
	mahasiswa.add("Udin");
	mahasiswa.add("Mana");
	mahasiswa.add("Jaka");
	
	System.out.println("Mahasiswa:"+ mahasiswa);
	
	mahasiswa.set(2, "Atqiya");
	mahasiswa.remove("Mana");
	
	System.out.println("Jumlah mahasiswa"+ mahasiswa.size());
	
	System.out.println("Daftar Mahassiwa");
	for(String nama : mahasiswa){
		System.out.println("- "+nama);
	}
	}
}