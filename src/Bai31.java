public class Bai31 {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien("Hippo", 9);
        double dtbSv = sv.tinhDTB(10, 8);
        System.out.println(dtbSv);
        sv.hienThiThongTin();

        System.out.println(sv );
        sv.setDiem(25);
        sv.checkHopLeDiem();

//        use overloading method
        SinhVien sv1 = new SinhVien("Bach", 7.5);
        double dtbSv1 = sv.tinhDTB(9, 6, 9.5);
        System.out.println(dtbSv1);

        double kq =  sv1.tongDiem(5, 9.4, 10, 8, 6);
        System.out.println("Tổng điểm của sinh viên 1: "+kq);
    }
}
