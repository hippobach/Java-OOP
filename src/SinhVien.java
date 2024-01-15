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

    public double tinhDTB(double diemToan, double diemVan) {
        return (diemToan+diemVan)/2;
    }

//    overloading method
    public double tinhDTB(double diemToan, double diemVan, double diemAnh) {
        return (diemToan+diemVan+diemAnh)/3;
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

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                '}';
    }

//    support method
    private boolean checkDiem() {
        return this.diem >= 24;
    }

//    service method
    public void checkHopLeDiem() {
        if (checkDiem()) {
            System.out.println("Điểm hợp lệ");
        } else {
            System.out.println("Điểm không hợp lệ");
        }
    }

//    parameter list
    public double tongDiem(double ...arr) {
        double tong = 0;
        for (double x : arr) {
            tong+=x;
        }
        return tong;
    }
}
