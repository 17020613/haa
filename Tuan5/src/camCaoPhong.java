/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lochoi
 */
public class camCaoPhong extends quaCam{
    private  int hangLoai;
    private String hanSuDung;

    public int getHangLoai() {
        super.getloaiCam();
       
        return hangLoai;
    }

    public void setHangLoai(int hangLoai) {
        this.hangLoai = hangLoai;
    }

    public String getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(String hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    //phương thức in ra chất lượng của cam
    public void chatluong(){
        System.out.println("Cam cao phong hang loai : "+ this.getHangLoai());
    }

    //phương thức in ra nguồn gốc của cam
    public void nguonGocCamCP(){
        System.out.println("hang nhap tu : " + this.getnguonGoc());
    }
}
