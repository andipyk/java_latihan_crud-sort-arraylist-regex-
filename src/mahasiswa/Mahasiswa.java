package mahasiswa;

import java.util.ArrayList;

public class Mahasiswa implements Comparable<Mahasiswa> {
    private int id;
    private String nama;
    private ArrayList<Double> nilai;

    public Mahasiswa() {
        this.nilai = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public ArrayList<Double> getNilai() {
        return nilai;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNilai(double inggris, double fisika, double algoritma) {
        this.nilai.add(inggris);
        this.nilai.add(fisika);
        this.nilai.add(algoritma);
    }

    @Override
    public int compareTo(Mahasiswa mahasiswa) {
        return (Integer.compare(this.getId(), mahasiswa.getId()));
    }
}

