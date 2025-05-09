package company;

import java.time.LocalDate;

public class HangThucPham extends HangHoa {
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;
    private String nhaCungCap;

    public HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan, String nhaCungCap) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;

        if (ngayHetHan.isAfter(ngaySanXuat)) {
            this.ngaySanXuat = ngaySanXuat;
            this.ngayHetHan = ngayHetHan;
        } else {

            throw new IllegalArgumentException("Ngày hết hạn phải sau ngày sản xuất");
        }
    }
        @Override
        public double tinhVAT() {
            return donGia * 0.08; // VAT 8% cho thực phẩm
        }

        @Override
        public String danhGiaMucDoBan () {
            LocalDate today = LocalDate.now();
            if (soLuongTon > 0 && ngayHetHan.isBefore(today)) {
                return "Hàng hết hạn, khó bán";
            } else {
                return "Bán được";
            }
        }
        public LocalDate getNgaySanXuat () {
            return ngaySanXuat;
        }
        public LocalDate getNgayHetHan () {
            return ngayHetHan;
        }
        public String getNhaCungCap () {
            return nhaCungCap;
        }

        public void setNgaySanXuat (LocalDate ngaySanXuat){
            if (ngayHetHan.isAfter(ngaySanXuat)) {
                this.ngaySanXuat = ngaySanXuat;
            }
        }

        public void setNgayHetHan (LocalDate ngayHetHan){
            if (ngayHetHan.isAfter(ngaySanXuat)) {
                this.ngayHetHan = ngayHetHan;
            }
        }

        public void setNhaCungCap (String nhaCungCap){
            this.nhaCungCap = nhaCungCap;
        }
    }