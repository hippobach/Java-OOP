package CongTy;

public class NhanVienHanhChinh extends NhanVien{
    public NhanVienHanhChinh(String que, String ten, int cccd) {
        super(que, ten, cccd);
    }

    @Override
    public double tinhLuong() {
        return luongCoBan;
    }
}
