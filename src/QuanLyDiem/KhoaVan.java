package QuanLyDiem;

public class KhoaVan extends NamHoc2024{
    public KhoaVan(String ten, String cccd) {
        super(ten, cccd);
    }

    @Override
    public void tinhDTB() {
        System.out.println("Day la phuong thuc tinh diem trung binh cua khoa van");
    }
}
