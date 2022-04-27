package quanly;

import java.util.ArrayList;

public class QuanLyDanhBa implements Comparable<DanhBa>{
    private final ArrayList<DanhBa> danhBas = new ArrayList<>();

    public QuanLyDanhBa() {
    }
    public ArrayList<DanhBa> getDanhBas() {
        return danhBas;
    }
    public void display() {
        for (int i = 0; i < danhBas.size() ; i++) {
            System.out.println(this.danhBas.get(i).toString());
        }
    }
    public void add(DanhBa danhBa) {
        this.danhBas.add(danhBa);
    }
    public int search(String hoTen) {
        for (int i = 0; i < danhBas.size() ; i++) {
            if (danhBas.get(i).getHoTen().equals(hoTen)) {
                System.out.println("tìm thấy ở vị trí" + i);
                return i;
            }
        }
        System.out.println("Không tìm thấy ");
        return -1;
    }

    @Override
    public int compareTo(DanhBa o) {
        return 0;
    }
}
