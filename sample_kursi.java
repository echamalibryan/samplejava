class KURSI
{
	boolean sudah_dipesan;
	String iden_kursi;
};

public class Main
{
	public void static main(String[] args)
	{
		int total_kursi = 10;
		KURSI[] kursi = new KURSI[total_kursi];
		
		// mulai awal di null kan biar pasti
		for(int i = 0; i < total_kursi; ++i)
		{
			kursi[i].sudah_dipesan = false;
		}
		
		kursi[0].iden_kursi = "A1";
		kursi[1].iden_kursi = "A2";
		kursi[2].iden_kursi = "A3";
		kursi[3].iden_kursi = "A4";
		kursi[4].iden_kursi = "A5";
		kursi[5].iden_kursi = "B1";
		kursi[6].iden_kursi = "B2";
		kursi[7].iden_kursi = "B3";
		kursi[8].iden_kursi = "B4";
		kursi[9].iden_kursi = "B5";
		
		// kode anda..........
		
		// baru if nya
		if(kursi[i].sudah_dipesan == true)
		{
			System.out.printf("Kursi %s sudah_dipesan\n", kursi[i].iden_kursi);
		}
	}
}
