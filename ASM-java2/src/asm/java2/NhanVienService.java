
package asm.java2;

import java.util.ArrayList;


public class NhanVienService implements DaoNhanVien{
    private ArrayList<NhanVien> nv = new ArrayList<>();
    @Override
    public void Them(NhanVien p) {
       nv.add(p);
    }

    @Override
    public void Sua(int viTri, NhanVien p) {
        nv.set(viTri, p);
    }

    @Override
    public void Xoa(int viTri) {
        nv.remove(viTri);
    }

    @Override
    public ArrayList<NhanVien> select() {
          return nv;
    }

    @Override
    public void setList(ArrayList<NhanVien> ds) {
          nv = ds;
    }
    
}
