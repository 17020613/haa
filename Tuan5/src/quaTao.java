/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lochoi
 */
// ke thua tu Hoa Qua
public class quaTao extends HoaQua {
    private double canNang;
    private String loaiTao;
    
    public void setcanNang(double canNang){
        this.canNang = canNang;
    }
    public double getcanNang(){
        return canNang;
    }
    public void setloaiTao(String loaiTao){
        this.loaiTao = loaiTao;
    }
    public String getloaiTao(){
        return loaiTao;
    }
    
    //in ra so luong tao da nhap
    public void soluongTao(){
        System.out.println("So luong tao da nhap: " + this.getcanNang());
    }
    // in ra loai Tao
    // in ra gia ban 1 can tao
    public void giaTao(){
        System.out.println("Gia ban 1 can la: " + this.getGia());
    }
}
