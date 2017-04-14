class RegularPagi extends Mahasiswa2 {
String Jadwal;
public void setJadwal(String Jadwals ){
Jadwal = Jadwals;
}
 public String getJadwal(){
            return Jadwal="Anak regular pagi Masuk Jam 08:00";
        }
	
@Override
 
		  public String getNama(){
            return Nama="Dewi";
        }
		@Override
		  public String getKelas (){
            return Kelas="TIRP14B";
        }
		
		@Override
		 public String getJurusan (){
            return Jurusan="Industri";
        }
		 public static void main(String[] args) {
       Mahasiswa2 maha = new Mahasiswa2();
	   RegularPagi pagi = new RegularPagi();
	   RegularMalam malam = new RegularMalam();
	   pagi.getJadwal();
	   System.out.println(pagi.Jadwal);
	   maha.getNama();
	   
	   System.out.println(maha.Nama);
	   pagi.getNama();
	    System.out.println(pagi.Nama);
	  	   pagi.getKelas();
	   System.out.println(pagi.Kelas);
	   pagi.getJurusan();
	   System.out.println(pagi.Jurusan);
	   
	   maha.getKelas();
	   System.out.println(maha.Kelas);
	   maha.getJurusan();
	   System.out.println(maha.Jurusan);
	   maha.getNpm();
	   System.out.println(maha.Npm);
	   malam.getKerja();
	    System.out.println(malam.Kerja);
	  
	   }
  }
