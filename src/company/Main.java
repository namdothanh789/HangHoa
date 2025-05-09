package company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DanhSachHangHoa danhSach = new DanhSachHangHoa();
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Thêm hàng hóa vào danh sách
            // Thêm hàng thực phẩm
            HangThucPham thucPham = new HangThucPham(
                "TP001", 
                "Sữa tươi", 
                100, 
                15000, 
                LocalDate.of(2023, 5, 1),
                LocalDate.of(2023, 12, 31),
                "Vinamilk"
            );
            danhSach.themHangHoa(thucPham);
            System.out.println("Đã thêm hàng thực phẩm thành công.");
            
            // Thêm hàng điện máy
            HangDienMay dienMay = new HangDienMay(
                "DM001",
                "Tủ lạnh",
                5,
                5000000,
                24,
                1500
            );
            danhSach.themHangHoa(dienMay);
            System.out.println("Đã thêm hàng điện máy thành công.");
            
            // Thêm hàng quần áo
            HangQuanAo quanAo = new HangQuanAo(
                "QA001",
                "Áo thun",
                70,
                150000,
                "Nike",
                LocalDate.now()
            );
            danhSach.themHangHoa(quanAo);
            System.out.println("Đã thêm hàng quần áo thành công.");
            
            // Tim kiếm hàng hóa theo mã
            System.out.println("\nTìm kiếm hàng hóa theo mã:");
            HangHoa timKiem = danhSach.timKiemTheoMa("DM001");
            if (timKiem != null) {
                System.out.println("Tìm thấy: " + timKiem.getTenHang() + 
                                  ", Số lượng tồn: " + timKiem.getSoLuongTon() + 
                                  ", Đánh giá: " + timKiem.danhGiaMucDoBan());
            } else {
                System.out.println("Không tìm thấy hàng hóa với mã này");
            }
            
            // Xoa hàng hóa
            System.out.println("\nXóa hàng hóa:");
            boolean ketQuaXoa = danhSach.xoaHangHoa("TP001");
            if (ketQuaXoa) {
                System.out.println("Đã xóa hàng hóa thành công");
            } else {
                System.out.println("Không tìm thấy hàng hóa để xóa");
            }
            
            // Xác nhận xóa
            timKiem = danhSach.timKiemTheoMa("TP001");
            if (timKiem == null) {
                System.out.println("Xác nhận: Hàng hóa đã được xóa");
            }
            
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
