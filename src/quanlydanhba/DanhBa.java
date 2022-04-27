package quanlydanhba;


public class DanhBa {
    private String hoTen;
    private String soDT;
    private String diaChi;
    private String Email;

    public DanhBa() {
    }

    public DanhBa(String hoTen, String soDT, String diaChi, String email) {
        this.hoTen = hoTen;
        this.soDT = soDT;
        this.diaChi = diaChi;
        Email = email;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "NguoiDung{" +
                "hoTen='" + hoTen + '\'' +
                ", soDT='" + soDT + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
