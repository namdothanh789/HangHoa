package company;

import java.util.ArrayList;
import java.util.List;

public class DanhSachHangHoa {
    private List<HangHoa> danhSachHangHoa;

    public DanhSachHangHoa() {
        danhSachHangHoa = new ArrayList<>();
    }

    // Thêm hàng hóa vào kho
    public void themHangHoa(HangHoa hangHoa) {
        for (HangHoa hh : danhSachHangHoa) {
            if (hh.getMaHang().equals(hangHoa.getMaHang())) {
                throw new IllegalArgumentException("Mã hàng đã tồn tại");
            }
        }
        danhSachHangHoa.add(hangHoa);
    }

    public boolean xoaHangHoa(String maHang) {
        return danhSachHangHoa.removeIf(hh -> hh.getMaHang().equals(maHang));
    }

    public HangHoa timKiemTheoMa(String maHang) {
        for (HangHoa hh : danhSachHangHoa) {
            if (hh.getMaHang().equals(maHang)) {
                return hh;
            }
        }
        return null;
    }
}
