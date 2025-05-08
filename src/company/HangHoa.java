package company;

public abstract class HangHoa {
    protected final String maHang;
    protected String tenHang;
    protected int soLuongTon;
    protected double donGia;

    public HangHoa(String maHang, String tenHang, int soLuongTon, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }
    public String getMaHang() { return maHang; }
    public String getTenHang() { return tenHang; }
    public int getSoLuongTon() { return soLuongTon; }
    public double getDonGia() { return donGia; }

    public void setTenHang(String tenHang){
        this.tenHang = tenHang;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    public void setSoLuongTon(int soLuongTon){
        if(soLuongTon >= 0) this.soLuongTon = soLuongTon;
    }
    public void setDonGia(double donGia) {
        if(donGia >= 0) this.donGia = donGia;
    }
    public abstract double tinhVAT();
    public abstract String danhGiaMucDoBan();
}