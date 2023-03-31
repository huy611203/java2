/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package asm.java2;

import java.util.ArrayList;


public interface DaoNhanVien {
    public void Them(NhanVien p);
    public void Sua(int viTri, NhanVien p);
    public void Xoa(int viTri);
    public ArrayList<NhanVien> select();
    public void setList(ArrayList<NhanVien> ds);
}
