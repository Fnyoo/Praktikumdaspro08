import java.util.Scanner;
public class studycase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int statusPendanaan;

        System.out.print("nama mahasiswa : ");
        String nama_Mahasiswa = sc.nextLine();

        System.out.print("Jenis kegiatan BELMAWA, BAKORMA, Mandiri, PKM, atau Lainnya : ");
        String Jenis_kegiatan = sc.nextLine();

        if (Jenis_kegiatan.equalsIgnoreCase("BELMANAWA")
            || Jenis_kegiatan.equalsIgnoreCase("BAKORMA")
            || Jenis_kegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Peringkat juara 1/2/3 :");
            int PeringkatJuara = sc.nextInt();

            if (PeringkatJuara >=1 && PeringkatJuara <= 3) {
                System.out.print("Jumlah dokumen yang di upload 1-4 : ");
                int Jumlah_dokumen_yg_diupload = sc.nextInt();

                if (Jumlah_dokumen_yg_diupload == 4) {
                    System.out.println("Nama" + nama_Mahasiswa);
                    System.out.println("Status Dana Penghargaan diberikan"); 
                    System.out.println("Peraih juara" + PeringkatJuara + "Jenis kegiatan" + Jenis_kegiatan + "Dan 4 Dokumen yg lengkap" );
                }else if (condition) {
                    
                }

            }
            
        }
        sc.close();
    }
}
