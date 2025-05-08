package company;

public class HangDienMay extends HangHoa{
    private int thoiGianBaoHanh;
    private double congSuat;
    public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia, int thoiGianBaoHanh, double congSuat);{
        super(maHang, tenHang, soLuongTon, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
        if(thoiGianBaoHanh >= 0)
            this.thoiGianBaoHanh = thoiGianBaoHanh;
        if(congSuat >= 0)
            this.congSuat = congSuat;
    }
    @Override
    public double tinhVAT() {
        return donGia * 0.15; // VAT 15% cho điện máy
    }

    @Override
    public String danhGiaMucDoBan() {
        if(soLuongTon < 3) {
            return "Bán được";
        } else {
            return "Bán chậm";
        }
    }
}