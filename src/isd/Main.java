package isd;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<MusicList> musicList = new LinkedList<MusicList>();
        musicList.addLast(new MusicList("Pelangi", "Theresa"));
        musicList.addLast(new MusicList("Hari Merdeka", "Rossa"));

        Scanner input = new Scanner(System.in);

        boolean kondisi = true;
        while (kondisi) {
            System.out.println("Pilihlah menu");
            System.out.println("1. Input Lagu ");
            System.out.println("2. Hapus Lagu ");
            System.out.println("3. Mainkan Lagu ");
            System.out.println("4. Keluar ");
            int pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Judul Lagu: ");
                    String judulLagu = input.nextLine();
                    System.out.print("Masukkan Nama Penyanyi: ");
                    String penyanyi = input.nextLine();
                    musicList.addLast(new MusicList(judulLagu, penyanyi));
                    break;
                case 2:
                    System.out.println("1. Hapus Lagu Terakhir Masuk");
                    System.out.println("2. Hapus Lagu Sesuai Judul");
                    int hapusOption = input.nextInt();
                    input.nextLine();
                    if(hapusOption== 1) {
                        musicList.removeLast();
                        System.out.println("Hapus lagu berhasil");
                    } else {
                        System.out.print("Masukkan judul lagu yang dihapus: ");
                        String remJudulLagu = input.nextLine();
                        removeWithTitle(musicList, remJudulLagu);
                        System.out.println("Hapus lagu berhasil");
                    }
                    break;
                case 3:
                    print(musicList);
                    break;
                case 4:
                    kondisi = false;
                    break;
            }
        }
    }

    public static void print(LinkedList listLagu) {
        ListIterator<MusicList> iterator = listLagu.listIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if(iterator.hasNext()) {
            System.out.print(" - ");
            }
        }
        System.out.println();
        while(iterator.hasPrevious()) {
            System.out.print(iterator.previous());
            if(iterator.hasPrevious()) {
            System.out.print(" - ");
            }
        }
        System.out.println("\n ---- Selesai ----");
    }


    public static void removeWithTitle(LinkedList musicLists, String title) {
        ListIterator<MusicList> iterator = musicLists.listIterator();
        while(iterator.hasNext()) {
            MusicList musicList = iterator.next();
            if(musicList.getJudulLagu().equals(title)) {
                iterator.remove();
                System.out.println("---- hapus berhasil ----");
            }
        }
    }
}
