package TinhDaHinh;

public class Test {
    public static void main(String[] args) {
        NhanSu ns1 = new PhoPhong("Hippo", "12345", "Nam Định");
        System.out.println("Lương của phó phòng: "+ns1.tinhLuong(21));
        System.out.println("Nhân sự 1: "+ns1.getTen()+ " "+ "CCCD: "+ns1.getCccd()+" "+"Que quan: "+ns1.getQue());
        System.out.println("Sau khi lên làm trưởng phòng");
        ns1 = new TruongPhong(ns1.getTen(), ns1.getCccd(), ns1.getQue());
        System.out.println("Nhân sự 1: "+ns1.getTen()+ " "+ "CCCD: "+ns1.getCccd()+" "+"Que quan: "+ns1.getQue());
        System.out.println("Lương của trưởng phòng: "+ns1.tinhLuong(21));
    }
}
