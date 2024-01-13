public class Bai30 {
    public static void main(String[] args) {
//        Khởi tạo đối tượng thuộc class sinh viên
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        SinhVien sv3 = new SinhVien("Xuân Bách", 9);
        sv3.hienThiThongTin();

        SinhVien sv4 = new SinhVien("Hippo", 8);
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());
    }
}
