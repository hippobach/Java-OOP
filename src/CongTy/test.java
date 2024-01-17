package CongTy;

public class test {
    public static void main(String[] args) {
        /*NhanVien nv1 = new NhanVien("Nam Dinh", "hippo", 123456);
        double luongnv1 = nv1.tinhLuong();
        System.out.println("Luong cua nhan vien 1: "+luongnv1);*/

        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("Ha Noi", "Huong Vu", 364532);
        double luonghc1 = hc1.tinhLuong();
        System.out.println("Luong cua nhan vien hanh chinh 1: "+luonghc1);

        NhanVienDiCa dc1 = new NhanVienDiCa("TpHCM", "Huynh Phat", 7693849, 2);
        double luongdc1 = dc1.tinhLuong();
        System.out.println("Luong cua nhan vien di ca 1: "+luongdc1);
    }
}
