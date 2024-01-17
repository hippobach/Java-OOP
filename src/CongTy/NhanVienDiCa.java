package CongTy;

public class NhanVienDiCa extends NhanVien{
//    Ca1: ngay
//    Ca2: dem
    protected int ca;
    public NhanVienDiCa(String que, String ten, int cccd) {
        super(que, ten, cccd);
    }

    public NhanVienDiCa(String que, String ten, int cccd, int ca) {
        super(que, ten, cccd);
        this.ca = ca;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan*1.05;
    }
}
