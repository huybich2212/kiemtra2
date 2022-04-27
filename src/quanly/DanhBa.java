package quanly;

public class DanhBa {
    private String hoTen;
    private int soDT;
    private String Email;
    private String diaDiem;

    public DanhBa() {
    }

    public DanhBa(String hoTen, int soDT, String email, String diaDiem) {
        this.hoTen = hoTen;
        this.soDT = soDT;
        Email = email;
        this.diaDiem = diaDiem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    @Override
    public String toString() {
        return "DanhBa{" +
                "hoTen='" + hoTen + '\'' +
                ", soDT=" + soDT +
                ", Email='" + Email + '\'' +
                ", diaDiem='" + diaDiem + '\'' +
                '}';
    }
}
