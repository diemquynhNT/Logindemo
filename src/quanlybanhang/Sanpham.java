/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybanhang;

/**
 *
 * @author pengu73
 */
public class Sanpham {
    private int IdSanPham;
    private String TenSanPham;
    private float Gia;

    public int getIdSanPham() {
        return IdSanPham;
    }

    public void setIdSanPham(int IdSanPham) {
        this.IdSanPham = IdSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }
    
    public Sanpham(){}
    public Sanpham(int id,String name,float  gia){
        this.IdSanPham=id;
        this.TenSanPham=name;
        this.Gia=gia;
    }
    
}
