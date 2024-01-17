package QuanLyDiem;

public class KhoaToan extends NamHoc2024{
    public KhoaToan(String ten, String cccd) {
        super(ten, cccd);
    }

    @Override
    public void tinhDTB() {
        System.out.println("Day la phuong thuc tinh diem trung binh cua khoa toan");
    }
}
