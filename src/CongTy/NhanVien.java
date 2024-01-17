package CongTy;

public abstract class NhanVien {
    protected String que;
    protected String ten;
    protected int cccd;
    protected double luongCoBan = 850;

    public NhanVien(String que, String ten, int cccd) {
        this.que = que;
        this.ten = ten;
        this.cccd = cccd;
    }

    public abstract double tinhLuong();
}
