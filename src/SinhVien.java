public class SinhVien {
//    Thuộc tính
    private String hoTen;
    private  double diem;
//    Constructor
//    Mặc định
    public SinhVien() {
        hoTen = "No name";
        diem = 0;
    }
//    Có đối số
    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    //    Phương thức (method)
//    Không có kiểu trả về
    public void hienThiThongTin() {
        System.out.println(hoTen+" "+diem);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
}
