package OOP_sapxep;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
//        Tạo list
        ArrayList<SanPham> ds = new ArrayList<>();
//        Khởi tạo các đối tượng sản phẩm
        SanPham sp1 = new SanPham(1, "Samsung", 1050);
        SanPham sp2 = new SanPham(2, "iPhone", 2500);
        SanPham sp3 = new SanPham(3, "Huawei", 500);
//       add sp vào list
        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);
//        xem danh sách sản phẩm
        for (SanPham sp : ds) {
            System.out.println(sp);
        }
//        gọi phương thức sắp xếp
        Collections.sort(ds);
        System.out.println("Danh sách sau sắp xếp là: ");
        for (SanPham sp : ds) {
            System.out.println(sp);
        }
    }
}
