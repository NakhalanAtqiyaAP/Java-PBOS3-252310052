package tugas.tugas3;

public class Biodata {
    private String fullName;
    private int usia;
    private String alamat;

    public void setBiodata(String fullName, int usia, String alamat){
        this.fullName = fullName;
        this.usia = usia;
        this.alamat = alamat;
    }

    public String getFullName(){
        return fullName;
    }

    public int getUsia(){
        return usia;
    }

    public String getAlamat(){
        return alamat;
    }

}
