package mahasiswa;

import my_method.IO;

import java.util.ArrayList;

public class MahasiswaCreate {
    public static ArrayList<Mahasiswa> list_mahasiswa = new ArrayList<>();
    my_method.IO IO = new IO();

    public void create_once() {
        System.out.println("Create & Input Data Mahasiswa");
        Mahasiswa mahasiswa = new Mahasiswa();

        mahasiswa.setId(IO.iInput("id"));
        mahasiswa.setNama(IO.sInput("nama"));
        mahasiswa.setNilai(IO.dInput("ingris"), IO.dInput("fisika"), IO.dInput("algoritma"));

        list_mahasiswa.add(mahasiswa);
        System.out.println("Data Berhasil Di Create");
    }
}