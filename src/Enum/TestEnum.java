package Enum;

import java.util.ArrayList;

public class TestEnum {
    public static void main(String[] args) {
//        Kiểm tra thứ tự các giá trị trong enum
        System.out.println(XepLoai.kha.ordinal());
        System.out.println(XepLoai.yeu.ordinal());

        ArrayList<SinhVien> ds = new ArrayList<>();
        SinhVien sv1 = new SinhVien(1, "Nguyen Xuan Bach", 9.5);
        SinhVien sv2 = new SinhVien(1, "Tran Van Bac", 4.5);
        SinhVien sv3 = new SinhVien(1, "Nguyen Dinh Tung", 8);

        ds.add(sv1);
        ds.add(sv2);
        ds.add(sv3);

//        duyệt danh sách
        for (SinhVien sv : ds) {
            System.out.println(sv);
        }
    }
}
