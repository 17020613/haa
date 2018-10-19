/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lochoi
 */
// ke thua tu qua Cam
public class camSanh extends quaCam {
    private String viCam;
    private String xuatKhau;
    public void setviCam(String viCam){
        this.viCam = viCam;
    }
    public String getviCam(){
        return viCam;
    }
    public void setxuatKhau(String xuatKhau){
        this.xuatKhau = xuatKhau;
    }
    public String getxuatKhau(){
        return xuatKhau;
    }
    
    //in ra vi Cam
    public void viCamSanh(){
        System.out.println("Vi cam Sanh: " + this.getviCam());
    }
    // nguon goc cam sanh
    public void ngcamSanh(){
        System.out.println("Nguon goc cam Sanh: " + this.getnguonGoc());
    }

}
