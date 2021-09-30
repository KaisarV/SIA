package Controller;

/**
 *
 * @author MrKaisar
 */
import java.util.ArrayList;
import model.*;

public class Controller {

    innitialize data = new innitialize();
    
    public Boolean getMatkulByKode(String kode){
        ArrayList<MataKuliah> listMatkul = new ArrayList<>();
        
        listMatkul = data.getMatkul();
        boolean cek = false;
        
        for (int i = 0; i < listMatkul.size(); i++) {
       
            if (listMatkul.get(i).getKode().equals(kode)) {
                
                cek = true;
                break;
            }
        }
        
        return cek;
        
    }
    
    public String getGaji(User data) {
        double salary = 0;
        String caption = null;

        if (data instanceof Karyawan) {
            salary = hitungGajiKaryawan(data);
            caption = "Gaji " + data.getNama() + " sebagai karyawan adalah " + salary;
        } else if (data instanceof DosenTetap) {
            salary = hitungGajiDosenTetap(data);
            caption = "Gaji " + data.getNama() + " sebagai dosen tetap adalah " + salary;
        } else if (data instanceof DosenHonorer) {
            salary = hitungGajiDosenHonorer(data);
            caption = "Gaji " + data.getNama() + " sebagai dosen honorer adalah " + salary;
        }

        return caption;

    }

    public double hitungGajiDosenHonorer(User data) {
        DosenHonorer dosen = (DosenHonorer) data;
        int kehadiran = 0;
        
        for (int i = 0; i < dosen.getMataKuliahAjar().size(); i++) {
            for (int j = 0; j < dosen.getMataKuliahAjar().get(i).getListPresensi().size(); j++) {
                if (dosen.getMataKuliahAjar().get(i).getListPresensi().get(j) == HadirEnum.HADIR) {
                    kehadiran++;
                }
            }
        }
        
        double salary = kehadiran * dosen.getHonorPerSKS();
        
        return salary;
    }

    public double hitungGajiDosenTetap(User data) {
        DosenTetap dosen = (DosenTetap) data;
        int kehadiran = 0;

        for (int i = 0; i < dosen.getMataKuliahAjar().size(); i++) {
            for (int j = 0; j < dosen.getMataKuliahAjar().get(i).getListPresensi().size(); j++) {
                if (dosen.getMataKuliahAjar().get(i).getListPresensi().get(j) == HadirEnum.HADIR) {
                    kehadiran++;
                }
            }
        }

        double salary = dosen.getSalary() + (kehadiran * 250000);

        return salary;
    }

    public double hitungGajiKaryawan(User data) {
        Karyawan dataKaryawan = (Karyawan) data;
        double salary;
        int kehadiran = 0;

        for (int i = 0; i < dataKaryawan.getListPresensiStaff().size(); i++) {
            if (dataKaryawan.getListPresensiStaff().get(i) == HadirEnum.HADIR) {
                kehadiran++;
            }
        }

        salary = kehadiran / 22 * dataKaryawan.getSalary();

        return salary;
    }

    public int getJamDosen(User dosen1) {
        Dosen dosen = (Dosen) dosen1;
        ArrayList<MatkulAjar> mataKuliahAjar = dosen.getMataKuliahAjar();
        int jumlahJam = 0;
        MataKuliah matkul = new MataKuliah();

        for (int i = 0; i < mataKuliahAjar.size(); i++) {
            matkul = mataKuliahAjar.get(i).getMatkulDiajar();
            for (int j = 0; j < mataKuliahAjar.get(i).getListPresensi().size(); j++) {
                if (mataKuliahAjar.get(i).getListPresensi().get(j) == HadirEnum.HADIR) {
                    jumlahJam += mataKuliahAjar.get(i).getMatkulDiajar().getSks();
                }
            }
        }

        return jumlahJam;

    }

    public User getUserByNIK(String NIK) {

        Dosen dosen = new Dosen();
        ArrayList<User> listData = new ArrayList<>();
        listData = data.getData();
        int cek = 0;
        for (int i = 0; i < listData.size(); i++) {
            User p = listData.get(i);

            if (p instanceof Dosen) {
                dosen = (Dosen) p;
                if (dosen.getNIK().equals(NIK)) {
                    cek = 1;
                }
            }
            if (cek == 1) {
                break;
            }

        }
        
        if (cek == 1) {
            return dosen;
        }else {
            return null;
        }
        
    }

    public String getMatkulPerMahasiswa(Mahasiswa mahasiswa) {
        String dataMhs = "";
        int hadir = 0;
        int cek = 1;
        ArrayList<MatkulAmbil> listMatkulAmbil = new ArrayList<>();
        if (mahasiswa instanceof Sarjana) {
            Sarjana mhs = (Sarjana) mahasiswa;
            listMatkulAmbil = mhs.getMataKuliahAmbil();
            cek = 0;
        }
        if (mahasiswa instanceof Magister) {
            Magister mhs = (Magister) mahasiswa;
            listMatkulAmbil = mhs.getMataKuliahAmbil();
            cek = 0;
        }
        if (cek == 0) {
            MataKuliah p = new MataKuliah();
            for (int i = 0; i < listMatkulAmbil.size(); i++) {
                hadir = 0;
                p = listMatkulAmbil.get(i).getMatkulAmbil();
                for (int j = 0; j < listMatkulAmbil.get(i).getListPresensi().size(); j++) {
                    if (listMatkulAmbil.get(i).getListPresensi().get(j) == HadirEnum.HADIR) {
                        hadir++;
                    }
                }
                dataMhs += "\nNama Mata Kuliah : " + p.getNama()
                        + "\nKehadiran : " + hadir + "/" + listMatkulAmbil.get(i).getListPresensi().size() + "\n";
            }
        }

        return dataMhs;

    }

    public Mahasiswa getObjectMhsByNIM(String nim) {

        Mahasiswa dataMhs = new Mahasiswa();
        ArrayList<User> listData = new ArrayList<>();
        listData = data.getData();

        for (int i = 0; i < listData.size(); i++) {
            User p = listData.get(i);

            if (p instanceof Mahasiswa) {
                Mahasiswa dataMhsTmp = (Mahasiswa) p;
                if (dataMhsTmp.getNim().equals(nim)) {
                    dataMhs = dataMhsTmp;
                    break;
                }

            }
        }

        return dataMhs;

    }

    public String getData(String name) {

        String dataStatus = "Tidak Ditemukan";
        ArrayList<User> listData = new ArrayList<>();
        listData = data.getData();

        for (int i = 0; i < listData.size(); i++) {
            User p = listData.get(i);
            if (p.getNama().equals(name)) {
                dataStatus = "\nNama : " + p.getNama()
                        + "\nStatus : " + p.getClass().getSimpleName();

            }
        }

        return dataStatus;

    }

    public Mahasiswa cekStatus(String nim) {

        ArrayList<User> listData = new ArrayList<>();
        listData = data.getData();
        Mahasiswa getData = new Mahasiswa();

        for (int i = 0; i < listData.size(); i++) {
            User d = listData.get(i);

            if (d instanceof Mahasiswa) {
                Mahasiswa e = (Mahasiswa) d;
                if (e.getNim().equals(nim)) {
                    if (e instanceof Sarjana) {
                        getData = e;
                        break;
                    }
                    if (e instanceof Magister) {
                        getData = e;
                        break;
                    }
                    if (e instanceof Doktor) {
                        getData = e;
                        break;
                    }
                }

            }
        }

        return getData;
    }

    public MatkulAmbil getMatkulAmbilByKodeMK(String kode, Mahasiswa dataMahasiswa) {
        ArrayList<MatkulAmbil> matkulAmbil = new ArrayList<MatkulAmbil>();
        MatkulAmbil p = new MatkulAmbil();
        if (dataMahasiswa.getClass().getSimpleName().equals("Sarjana")) {
            Sarjana dataMhs = (Sarjana) dataMahasiswa;

            matkulAmbil = dataMhs.getMataKuliahAmbil();
            for (int i = 0; i < matkulAmbil.size(); i++) {
                p = matkulAmbil.get(i);

                if (p.getMatkulAmbil().getKode().equals(kode)) {
                    break;
                } else {
                    p = null;
                }

            }
        }

        if (dataMahasiswa.getClass().getSimpleName().equals("Magister")) {
            Magister dataMhs = (Magister) dataMahasiswa;

            matkulAmbil = dataMhs.getMataKuliahAmbil();
            for (int i = 0; i < matkulAmbil.size(); i++) {
                p = matkulAmbil.get(i);

                if (p.getMatkulAmbil().getKode().equals(kode)) {
                    break;
                } else {
                    p = null;
                }
            }

        }
        return p;
    }

    public double countMean(int n1, int n2, int n3) {
        double total = (n1 + n2 + n3) / 3;

        return total;
    }

    public ArrayList<Mahasiswa> getObjectMahasiswa() {
        data = new innitialize();
        ArrayList<User> listData = new ArrayList<>();
        listData = data.getData();

        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();

        for (int i = 0; i < listData.size(); i++) {
            User m = listData.get(i);

            if (m instanceof Mahasiswa) {
                Mahasiswa dataMhs = (Mahasiswa) m;
                listMahasiswa.add(dataMhs);
            }

        }

        return listMahasiswa;
    }

    public String hitungMeanMK(ArrayList<Mahasiswa> dataMhs, String kodeMK) {
        String getMean = "";
        double mean = 0;
        ArrayList<MatkulAmbil> dataMatkul = new ArrayList<>();
        MatkulAmbil matkul = new MatkulAmbil();
        Mahasiswa p = new Mahasiswa();
        int a = 0;
        for (int i = 0; i < dataMhs.size(); i++) {
            p = dataMhs.get(i);

            if (p instanceof Sarjana) {
                Sarjana sarjana = (Sarjana) p;
                dataMatkul = sarjana.getMataKuliahAmbil();

                for (int j = 0; j < dataMatkul.size(); j++) {
                    matkul = dataMatkul.get(j);
                    if (matkul.getMatkulAmbil().getKode().equals(kodeMK)) {
                        a++;
                        mean += (matkul.getN1() + matkul.getN2() + matkul.getN3()) / 3;
                        getMean += "\nNama : " + p.getNama()
                                + "\nNilai : " + matkul.getN1() + " " + matkul.getN2() + " " + matkul.getN3()
                                + "\nMean : " + (matkul.getN1() + matkul.getN2() + matkul.getN3()) / 3 + "\n";
                    }
                }

            }
            if (p instanceof Magister) {
                Magister magister = (Magister) p;
                dataMatkul = magister.getMataKuliahAmbil();

                for (int j = 0; j < dataMatkul.size(); j++) {
                    matkul = dataMatkul.get(j);
                    if (matkul.getMatkulAmbil().getKode().equals(kodeMK)) {
                        a++;
                        mean += (matkul.getN1() + matkul.getN2() + matkul.getN3()) / 3;
                        getMean += "\nNama : " + p.getNama()
                                + "\nNilai : " + matkul.getN1() + " " + matkul.getN2() + " " + matkul.getN3()
                                + "\nMean : " + (matkul.getN1() + matkul.getN2() + matkul.getN3()) / 3 + "\n";
                    }
                }

            }

        }
        mean = mean / a;
        getMean += "\nTotal Rata-Rata " + mean;
        return getMean;
    }

    public int hitungTidakLulusMK(ArrayList<Mahasiswa> dataMhs, String kodeMK) {
        int jumlahTidakLulus = 0;
        double nilaiAkhir = 0;

        ArrayList<MatkulAmbil> dataMatkul = new ArrayList<>();
        MatkulAmbil matkul = new MatkulAmbil();
        Mahasiswa p = new Mahasiswa();

        for (int i = 0; i < dataMhs.size(); i++) {
            p = dataMhs.get(i);
            if (p instanceof Sarjana) {
                Sarjana sarjana = (Sarjana) p;
                dataMatkul = sarjana.getMataKuliahAmbil();

                for (int j = 0; j < dataMatkul.size(); j++) {
                    matkul = dataMatkul.get(j);
                    if (matkul.getMatkulAmbil().getKode().equals(kodeMK)) {
                        nilaiAkhir = (matkul.getN1() + matkul.getN2() + matkul.getN3()) / 3;

                        if (nilaiAkhir < 56) {
                            jumlahTidakLulus++;
                        }
                    }
                }
            }
            if (p instanceof Magister) {
                Magister magister = (Magister) p;
                dataMatkul = magister.getMataKuliahAmbil();

                for (int j = 0; j < dataMatkul.size(); j++) {
                    matkul = dataMatkul.get(j);
                    if (matkul.getMatkulAmbil().getKode().equals(kodeMK)) {

                        nilaiAkhir = (matkul.getN1() + matkul.getN2() + matkul.getN3()) / 3;
                        if (nilaiAkhir < 56) {
                            jumlahTidakLulus++;
                        }
                    }
                }

            }
        }
        return jumlahTidakLulus;
    }

    public int totalMahasiswaSuatuMK(ArrayList<Mahasiswa> dataMhs, String kodeMK) {
        int jumlahMahasiswa = 0;
        ArrayList<MatkulAmbil> dataMatkul = new ArrayList<>();
        MatkulAmbil matkul = new MatkulAmbil();
        Mahasiswa p = new Mahasiswa();

        for (int i = 0; i < dataMhs.size(); i++) {
            p = dataMhs.get(i);
            if (p instanceof Sarjana) {
                Sarjana sarjana = (Sarjana) p;
                dataMatkul = sarjana.getMataKuliahAmbil();

                for (int j = 0; j < dataMatkul.size(); j++) {
                    matkul = dataMatkul.get(j);
                    if (matkul.getMatkulAmbil().getKode().equals(kodeMK)) {
                        jumlahMahasiswa++;
                    }
                }
            }
            if (p instanceof Magister) {
                Magister magister = (Magister) p;
                dataMatkul = magister.getMataKuliahAmbil();

                for (int j = 0; j < dataMatkul.size(); j++) {
                    matkul = dataMatkul.get(j);
                    if (matkul.getMatkulAmbil().getKode().equals(kodeMK)) {
                        jumlahMahasiswa++;

                    }
                }

            }
        }
        return jumlahMahasiswa;
    }

    public String getNamaMatkul(String kodeMK) {
        ArrayList<MataKuliah> matkul = data.getMatkul();
        String name = "";
        for (int i = 0; i < matkul.size(); i++) {
            if (matkul.get(i).getKode().equals(kodeMK)) {
                name = matkul.get(i).getNama();
            }
        }
        return name;
    }

}
