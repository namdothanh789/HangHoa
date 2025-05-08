package company;

import java.time.LocalDate;

public class HangQuanAo extends HangHoa {
    private String nhaSanXuat;
    private LocalDate ngayNhapKho;
    public  HangQuanAo(String maHang, String tenHang, int soLuongTon, double donGia, String nhaSanXuat, LocalDate ngayNhapKho){
        super(maHang, tenHang, soLuongTon, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }
    @Override
    public double tinhVAT() {
        return donGia * 0.15;
    }

    @Override
    public String danhGiaMucDoBan() {
        if(soLuongTon > 60) {
            return "Hàng tồn kho, cần đẩy mạnh bán";
        } else {
            return "Bán chạy";
        }
    }
    public String getNhaSanXuat() { return nhaSanXuat; }
    public LocalDate getNgayNhapKho() { return ngayNhapKho; }

    public void setNhaSanXuat(String nhaSanXuat) { this.nhaSanXuat = nhaSanXuat; }
    public void setNgayNhapKho(LocalDate ngayNhapKho) { this.ngayNhapKho = ngayNhapKho; }
}

