package quanlydanhba;

import java.util.ArrayList;

public class QuanLyDanhBa implements Comparable<QuanLyDanhBa> {
    private final ArrayList<DanhBa> danhBas = new ArrayList<>();
    private int soNguoi;

    public QuanLyDanhBa() {
        this.soNguoi = soNguoi;
    }

    public ArrayList<DanhBa> getdanhba() {
        return danhBas;
    }

    public ArrayList<DanhBa> getDanhBas() {
        return danhBas;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }
    public void display() {
        for (int i = 0; i < danhBas.size() ; i++) {
            System.out.println(this.danhBas.get(i).toString());
        }
    }

    public void add(DanhBa danhBa) {
        this.danhBas.add(danhBa);
        soNguoi++;
    }
    public void delete(String hoTen) {
    int indexOf= search(hoTen);
    if (indexOf == -1) {
        System.out.println("Không có trong danh sách");
    }
    else {
        this.danhBas.remove(indexOf);
        soNguoi--;
    }
    }
    public int search(String hoTen) {
        for (int i = 0; i < danhBas.size() ; i++) {
            if (danhBas.get(i).getHoTen().equals(hoTen)) {
                System.out.println("tim thay o vi tri : "+ i);
                return i;
            }
        }
        System.out.println("khong tim thay !!!!!");
        return -1;
    }
    public void edit(String hoTen,DanhBa danhBa) {
        int indexOf=search(hoTen);
        if(indexOf == -1){
            System.out.println("khong co");
        } else{
            danhBas.set(search(hoTen) , danhBa);
        }
    }


        @Override
    public int compareTo(QuanLyDanhBa o) {
        return 0;
    }
}
