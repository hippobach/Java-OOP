package Enum;

public class SinhVien {
//    Thuộc tính
    private int ma;
    private String ten;
    private double dtb;
    private XepLoai loai;
//    constructor

    public SinhVien(int ma, String ten, double dtb) {
        this.ma = ma;
        this.ten = ten;
        this.dtb = dtb;
        this.loai = getLoai();
    }
//    phương thức để get loại
    public XepLoai getLoai() {
        if (this.dtb >= 8)
            loai = XepLoai.gioi;
        else if (this.dtb >= 6.5)
            loai = XepLoai.kha;
        else if (this.dtb >= 5.0)
            loai = XepLoai.trungbinh;
        else if (this.dtb >= 4)
            loai = XepLoai.yeu;
        else
            loai = XepLoai.duoihoc;
        return loai;
    }
//    toString()

    @Override
    public String toString() {
        return "SinhVien{" +
                "ma=" + ma +
                ", ten='" + ten + '\'' +
                ", dtb=" + dtb +
                ", loai=" + loai +
                '}';
    }
}
