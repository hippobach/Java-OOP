package TestInterface;

public interface ViDuInterface {
//    tập các thuộc tính chỉ được phép là hằng số
    static final double phuCap = 15;
//    các phương thức trửu tượng (không có phần thân)
    public abstract void thongTin(String ten, String cccd, int namSinh);
    public abstract double tinhLuong(double luongNgay, int soNgayCong);

}
