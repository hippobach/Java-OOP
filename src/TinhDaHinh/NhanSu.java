package TinhDaHinh;

public abstract class NhanSu {
//    các thuộc tính
    private String ten;
    private String cccd;
    private String que;

    public NhanSu(String ten, String cccd, String que) {
        this.ten = ten;
        this.cccd = cccd;
        this.que = que;
    }

    public NhanSu(String ten, String cccd) {
        this.ten = ten;
        this.cccd = cccd;
    }

    public NhanSu() {
    }

    public abstract double tinhLuong(int ngayCong);

    public String getTen() {
        return ten;
    }

    public String getCccd() {
        return cccd;
    }

    public String getQue() {
        return que;
    }
}
