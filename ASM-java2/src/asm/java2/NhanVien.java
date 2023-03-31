
package asm.java2;

import java.io.Serializable;

public class NhanVien implements Serializable{
    private String MaNV;
    private String TenNV;
    private int TuoiNV;
    private String email;
    private double Luong;

    public NhanVien() {
    }

    public NhanVien(String MaNV, String TenNV, int TuoiNV, String email, double Luong) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.TuoiNV = TuoiNV;
        this.email = email;
        this.Luong = Luong;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public int getTuoiNV() {
        return TuoiNV;
    }

    public void setTuoiNV(int TuoiNV) {
        this.TuoiNV = TuoiNV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }
     
    public Object[] Todarow(){
    return new Object[]{
      MaNV,TenNV,TuoiNV,email,Luong  
    };
};
    
    
}
