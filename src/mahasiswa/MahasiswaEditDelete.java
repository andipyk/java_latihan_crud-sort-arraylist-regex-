package mahasiswa;

import my_method.IO;
import my_method.Search;

public class MahasiswaEditDelete {
    my_method.IO IO = new IO();
    Search search = new Search();

    public void edit_or_delete() {
        System.out.println("1. Edit");
        System.out.println("2. Delete");
        String pilihan = IO.sInput("pilihan");
        System.out.println("\n");

        if (pilihan.equals("1")) {
            edit_mahasiswa();
        } else if (pilihan.equals("2")) {
            delete_mahasiswa();
        } else {
            System.out.println("Inputan anda salah !");
        }
    }

    void edit_mahasiswa() {
        int index = search.cari_index_byID(MahasiswaCreate.list_mahasiswa);
        Mahasiswa data = MahasiswaCreate.list_mahasiswa.get(index);
        Mahasiswa newMahasiswa = new Mahasiswa();

        newMahasiswa.setId(data.getId());
        newMahasiswa.setNama(IO.sInput("nama"));
        newMahasiswa.setNilai(IO.dInput("inggris"), IO.dInput("fisika"), IO.dInput("algoritma"));

        MahasiswaCreate.list_mahasiswa.set(index, newMahasiswa);
        System.out.println("data berhasil diedit");
    }

    void delete_mahasiswa(){
        int index = search.cari_index_byID(MahasiswaCreate.list_mahasiswa);
        String yakin_hapus = IO.sInput("hapus (y/N)");

        if (yakin_hapus.toLowerCase().equals("y")) {
            MahasiswaCreate.list_mahasiswa.remove(index);
            System.out.println("data berhasil dihapus");
        } else {
            System.out.println("operasi dibatalkan");
        }
    }


}