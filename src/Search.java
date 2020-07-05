import java.util.ArrayList;

public class Search {
    IO IO = new IO();

    public int cari_index_byID(ArrayList<Mahasiswa> list_mahasiswa) {
        int indexFindArrayList = -1;
        int inputID = Integer.parseInt(IO.sInput("id mahasiswa"));

        for (int i = 0; i < list_mahasiswa.size(); i++) {
            if (list_mahasiswa.get(i).getId() == inputID) {
                indexFindArrayList = i;
                break;
            }
        }
        return indexFindArrayList;
    }
}
