
package Controller;

/**
 *
 * @author MrKaisar
 */
import java.util.ArrayList;
import model.*;
public class innitialize {
    private ArrayList<User> listUser= new ArrayList<>();
    private ArrayList<MataKuliah> listMatkul= new ArrayList<>();
   
    public  innitialize (){
        MataKuliah matkul1 = new MataKuliah("1001", 3, "Struktur Data");
        MataKuliah matkul2 = new MataKuliah("1002", 3, "Algoritma dan Pemrograman");
        MataKuliah matkul3 = new MataKuliah("1003", 2, "Desain Web");
        MataKuliah matkul4 = new MataKuliah("1004", 2, "English 1");
        MataKuliah matkul5 = new MataKuliah("1005", 2, "Agama");
        MataKuliah matkul6 = new MataKuliah("1006", 2, "Kalkulus 1");
        MataKuliah matkul7 = new MataKuliah("1007", 2, "Kalkulus 2");
        MataKuliah matkul8 = new MataKuliah("1008", 2, "Sistem Informasi");
        MataKuliah matkul9 = new MataKuliah("1009", 3, "Pengantar Teknologi Informasi");
        
        User newDosenTmp1 = new DosenTetap
        (5000000, "Informatika", "320544645646", "Andi Warandi", "Bandung", "Andi", "08124296437346");
        DosenTetap newDosen1 = (DosenTetap) newDosenTmp1;
        
        User newDosenTmp2 = new DosenHonorer
        (500000, "Akuntansi", "320533645646", "Aan Supratman", "Jakarta", "Aan", "08124296437346");
        DosenHonorer newDosen2 = (DosenHonorer) newDosenTmp2;
        
        User newDosenTmp3 = new Dosen
        ("Informatika", "320436843849", "Alan Marsudi", "Bandung", "Alan", "08124256794959");
        Dosen newDosen3 = (Dosen) newDosenTmp3;
        
        ArrayList<HadirEnum> listPresensiDosen1 = new ArrayList<HadirEnum>();
        listPresensiDosen1.add(HadirEnum.HADIR);
        listPresensiDosen1.add(HadirEnum.HADIR);
        listPresensiDosen1.add(HadirEnum.HADIR);
        listPresensiDosen1.add(HadirEnum.HADIR);
        listPresensiDosen1.add(HadirEnum.HADIR);
        ArrayList<HadirEnum> listPresensiDosen2 = new ArrayList<HadirEnum>();
        listPresensiDosen2.add(HadirEnum.HADIR);
        listPresensiDosen2.add(HadirEnum.ALPHA);
        listPresensiDosen2.add(HadirEnum.HADIR);
        listPresensiDosen2.add(HadirEnum.HADIR);
        listPresensiDosen2.add(HadirEnum.HADIR);
        ArrayList<MatkulAjar> listMataKuliahAjar1 = new ArrayList<MatkulAjar>();
        MatkulAjar matkulAjar1 = new MatkulAjar(matkul1, listPresensiDosen1);
        MatkulAjar matkulAjar2 = new MatkulAjar(matkul2, listPresensiDosen2);
        listMataKuliahAjar1.add(matkulAjar1);
        listMataKuliahAjar1.add(matkulAjar2);
        newDosen1.setMataKuliahAjar(listMataKuliahAjar1);
     
        
        
        ArrayList<HadirEnum> listPresensiDosen3 = new ArrayList<HadirEnum>();
        listPresensiDosen3.add(HadirEnum.HADIR);
        listPresensiDosen3.add(HadirEnum.HADIR);
        listPresensiDosen3.add(HadirEnum.HADIR);
        listPresensiDosen3.add(HadirEnum.HADIR);
        listPresensiDosen3.add(HadirEnum.HADIR);
        
        ArrayList<HadirEnum> listPresensiDosen4 = new ArrayList<HadirEnum>();
        listPresensiDosen4.add(HadirEnum.HADIR);
        listPresensiDosen4.add(HadirEnum.HADIR);
        listPresensiDosen4.add(HadirEnum.HADIR);
        listPresensiDosen4.add(HadirEnum.HADIR);
        listPresensiDosen3.add(HadirEnum.HADIR);
        
        ArrayList<MatkulAjar> listMataKuliahAjar2 = new ArrayList<MatkulAjar>();
        MatkulAjar matkulAjar3 = new MatkulAjar(matkul3, listPresensiDosen3);
        MatkulAjar matkulAjar4 = new MatkulAjar(matkul4, listPresensiDosen4);
        listMataKuliahAjar2.add(matkulAjar3);
        listMataKuliahAjar2.add(matkulAjar4);
        newDosen2.setMataKuliahAjar(listMataKuliahAjar2);
        
        ArrayList<HadirEnum> listPresensiDosen5 = new ArrayList<HadirEnum>();
        listPresensiDosen5.add(HadirEnum.ALPHA);
        listPresensiDosen5.add(HadirEnum.HADIR);
        listPresensiDosen5.add(HadirEnum.HADIR);
        listPresensiDosen5.add(HadirEnum.ALPHA);
        listPresensiDosen5.add(HadirEnum.HADIR);
        
        ArrayList<HadirEnum> listPresensiDosen6 = new ArrayList<HadirEnum>();
        listPresensiDosen6.add(HadirEnum.ALPHA);
        listPresensiDosen6.add(HadirEnum.ALPHA);
        listPresensiDosen6.add(HadirEnum.HADIR);
        listPresensiDosen6.add(HadirEnum.HADIR);
        listPresensiDosen6.add(HadirEnum.ALPHA);
        
        ArrayList<MatkulAjar> listMataKuliahAjar3 = new ArrayList<MatkulAjar>();
        MatkulAjar matkulAjar5 = new MatkulAjar(matkul5, listPresensiDosen5);
        MatkulAjar matkulAjar6 = new MatkulAjar(matkul6, listPresensiDosen6);
        listMataKuliahAjar3.add(matkulAjar5);
        listMataKuliahAjar3.add(matkulAjar6);
        newDosen3.setMataKuliahAjar(listMataKuliahAjar3);
        
        //Karyawan
        ArrayList<HadirEnum> listPresensiKaryawan1 = new ArrayList<HadirEnum>();
        listPresensiKaryawan1.add(HadirEnum.ALPHA);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        
        ArrayList<HadirEnum> listPresensiKaryawan2 = new ArrayList<HadirEnum>();
        listPresensiKaryawan1.add(HadirEnum.ALPHA);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.ALPHA);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        listPresensiKaryawan1.add(HadirEnum.HADIR);
        
   
        User newKaryawanTmp1 = new Karyawan(2000000, "32834672682", "Supratman", "Bandung", "Jakarta, 2 Agustus 1999", "081827346823", listPresensiKaryawan1);
        Karyawan newKaryawan1 = (Karyawan) newKaryawanTmp1;
        
        User newKaryawanTmp2 = new Karyawan(2000000, "32834672382", "Amanda", "Bekasi", "Bekasi, 10 Juli 1999", "081827346823", listPresensiKaryawan2);
        Karyawan newKaryawan2 = (Karyawan) newKaryawanTmp2;
        
        
        //Mahasiswa
        User newSarjanaTemp1 = new Sarjana("1120040", "Informatika", "Kaisar", "Bogor", "Jakarta, 2 Februai 2002", "08138936296");
        Sarjana newSarjana1 = (Sarjana) newSarjanaTemp1; 
        
        User newSarjanaTemp2 = new Sarjana("1120049", "Informatika", "Agung WS", "Bandung", "Bandung, 3 September 2002", "081337936298");
        Sarjana newSarjana2 = (Sarjana) newSarjanaTemp2; 

        User newMagisterTemp1 = new Magister("113002", "Akuntansi", "Wandi", "Bandung", "Bandung, 10 September 2000", "081437936654", "Akuntansi Kantor");
        Magister newMagister1 = (Magister) newMagisterTemp1; 
        
        User newMagisterTemp2 = new Magister("115005", "Management", "Belinda", "Bogor", "Bekasi, 13 Desember 2000", "08122349234", "Management Kantor");
        Magister newMagister2 = (Magister) newMagisterTemp2;
                                         
        User newDoktorTemp2 = new Doktor(100, 80, 90, "113232", "Sistem Informasi", "Cindy", "Bekasi", "Jakarta, 28 Februari 2002", "08122376482", "Sistem Informasi untuk Kantor");
        Doktor newDoktor1 = (Doktor) newDoktorTemp2;
        
        
        
        listMatkul.add(matkul1);
        listMatkul.add(matkul2);
        listMatkul.add(matkul3);
        listMatkul.add(matkul4);
        listMatkul.add(matkul5);
        listMatkul.add(matkul6);
        listMatkul.add(matkul7);
        listMatkul.add(matkul8);
        listMatkul.add(matkul9);
        
        //For Sarjana 1
        ArrayList<MatkulAmbil> listMataKuliahAmbil1 = new ArrayList<MatkulAmbil>();
        ArrayList<HadirEnum> listPresensi6 = new ArrayList<HadirEnum>();
        listPresensi6.add(HadirEnum.HADIR);
        listPresensi6.add(HadirEnum.HADIR);
        listPresensi6.add(HadirEnum.HADIR);
        ArrayList<HadirEnum> listPresensi7 = new ArrayList<HadirEnum>();
        listPresensi7.add(HadirEnum.HADIR);
        listPresensi7.add(HadirEnum.HADIR);
        listPresensi7.add(HadirEnum.HADIR);
        ArrayList<HadirEnum> listPresensi8 = new ArrayList<HadirEnum>();
        listPresensi8.add(HadirEnum.HADIR);
        listPresensi8.add(HadirEnum.HADIR);
        listPresensi8.add(HadirEnum.HADIR);
        
        MatkulAmbil matkulAmbil1 = new MatkulAmbil(80, 90, 70, matkul1, listPresensi6);
        MatkulAmbil matkulAmbil2 = new MatkulAmbil(70, 85, 90, matkul2, listPresensi7);
        MatkulAmbil matkulAmbil12 = new MatkulAmbil(90, 100, 100, matkul9, listPresensi8);
        listMataKuliahAmbil1.add(matkulAmbil1);
        listMataKuliahAmbil1.add(matkulAmbil2);
        listMataKuliahAmbil1.add(matkulAmbil12);
        newSarjana1.setMataKuliahAmbil(listMataKuliahAmbil1);
        
        //For Sarjana 2
        ArrayList<MatkulAmbil> listMataKuliahAmbil2 = new ArrayList<MatkulAmbil>();
        ArrayList<HadirEnum> listPresensi9 = new ArrayList<HadirEnum>();
        listPresensi9.add(HadirEnum.HADIR);
        listPresensi9.add(HadirEnum.ALPHA);
        listPresensi9.add(HadirEnum.HADIR);
        ArrayList<HadirEnum> listPresensi10 = new ArrayList<HadirEnum>();
        listPresensi10.add(HadirEnum.HADIR);
        listPresensi10.add(HadirEnum.HADIR);
        listPresensi10.add(HadirEnum.HADIR);
        ArrayList<HadirEnum> listPresensi11 = new ArrayList<HadirEnum>();
        listPresensi11.add(HadirEnum.ALPHA);
        listPresensi11.add(HadirEnum.HADIR);
        listPresensi11.add(HadirEnum.HADIR);
        ArrayList<HadirEnum> listPresensi12 = new ArrayList<HadirEnum>();
        listPresensi12.add(HadirEnum.ALPHA);
        listPresensi12.add(HadirEnum.HADIR);
        listPresensi12.add(HadirEnum.HADIR);
        
        MatkulAmbil matkulAmbil3 = new MatkulAmbil(90, 90, 100, matkul3, listPresensi9);
        MatkulAmbil matkulAmbil4 = new MatkulAmbil(70, 75, 80, matkul4, listPresensi10);
        MatkulAmbil matkulAmbil9 = new MatkulAmbil(70, 60, 100, matkul1, listPresensi11);
        MatkulAmbil matkulAmbil10 = new MatkulAmbil(30, 40, 50, matkul9, listPresensi12);
        listMataKuliahAmbil2.add(matkulAmbil3);
        listMataKuliahAmbil2.add(matkulAmbil4);
        listMataKuliahAmbil2.add(matkulAmbil9);
        listMataKuliahAmbil2.add(matkulAmbil10);
        newSarjana2.setMataKuliahAmbil(listMataKuliahAmbil2);

        //For Magister 1
        ArrayList<MatkulAmbil> listMataKuliahAmbil3 = new ArrayList<MatkulAmbil>();
        ArrayList<HadirEnum> listPresensi1 = new ArrayList<HadirEnum>();
        listPresensi1.add(HadirEnum.HADIR);
        listPresensi1.add(HadirEnum.HADIR);
        listPresensi1.add(HadirEnum.HADIR);
        ArrayList<HadirEnum> listPresensi2 = new ArrayList<HadirEnum>();
        listPresensi2.add(HadirEnum.HADIR);
        listPresensi2.add(HadirEnum.HADIR);
        listPresensi2.add(HadirEnum.HADIR);
        ArrayList<HadirEnum> listPresensi3 = new ArrayList<HadirEnum>();
        listPresensi3.add(HadirEnum.HADIR);
        listPresensi3.add(HadirEnum.ALPHA);
        listPresensi3.add(HadirEnum.HADIR);
        
        MatkulAmbil matkulAmbil5 = new MatkulAmbil(90, 80, 100, matkul5, listPresensi1);
        MatkulAmbil matkulAmbil6 = new MatkulAmbil(80, 75, 80, matkul6, listPresensi2);
        MatkulAmbil matkulAmbi11 = new MatkulAmbil(30, 55, 60, matkul9, listPresensi3);
        listMataKuliahAmbil3.add(matkulAmbil5);
        listMataKuliahAmbil3.add(matkulAmbil6);
        listMataKuliahAmbil3.add(matkulAmbi11);
        newMagister1.setMataKuliahAmbil(listMataKuliahAmbil3);
        
        //For Magister 2
        ArrayList<MatkulAmbil> listMataKuliahAmbil4 = new ArrayList<MatkulAmbil>();
        ArrayList<HadirEnum> listPresensi4 = new ArrayList<HadirEnum>();
        listPresensi4.add(HadirEnum.HADIR);
        listPresensi4.add(HadirEnum.HADIR);
        listPresensi4.add(HadirEnum.HADIR);
        ArrayList<HadirEnum> listPresensi5 = new ArrayList<HadirEnum>();
        listPresensi5.add(HadirEnum.HADIR);
        listPresensi5.add(HadirEnum.HADIR);
        listPresensi5.add(HadirEnum.HADIR);
        
        MatkulAmbil matkulAmbil7 = new MatkulAmbil(90, 70, 70, matkul7, listPresensi4);
        MatkulAmbil matkulAmbil8 = new MatkulAmbil(95, 75, 80, matkul9, listPresensi5);
        listMataKuliahAmbil4.add(matkulAmbil7);
        listMataKuliahAmbil4.add(matkulAmbil8);
        newMagister2.setMataKuliahAmbil(listMataKuliahAmbil4);
        
        listUser.add(newDosen1);
        listUser.add(newDosen2);
        listUser.add(newDosen3);
        listUser.add(newKaryawan1);
        listUser.add(newKaryawan2);
        listUser.add(newSarjana1);
        listUser.add(newSarjana2);
        listUser.add(newMagister1);
        listUser.add(newMagister2);
        listUser.add(newDoktor1);
    }
    
    public ArrayList<User> getData(){
        return listUser;
    }
    
    public ArrayList<MataKuliah> getMatkul(){
        return listMatkul;
    }
    
}
