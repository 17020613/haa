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
public class quaCam extends HoaQua{
    private String nguonGoc;
    private String loaiCam;
    
    public void setnguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }
    public String getnguonGoc() {
        return nguonGoc;
    }
    public void setloaiCam(String loaiCam) {
        this.loaiCam = loaiCam;
    }
    public String getloaiCam() {
        return loaiCam;
    }
    
    // in ra loai cam
    public void gioithieuCam(){
        System.out.println("Day la loai cam: " + this.getloaiCam());
    }
    // in ra ngay nhap cam
    public void ngaynhapCam(){
        System.out.println("Ngay nhap Cam la: " + this.getngayNhap());
    }
}
