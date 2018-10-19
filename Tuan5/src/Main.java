/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lochoi
 */
public class Main {
    public static void main(String[] args) {
        HoaQua hq = new HoaQua();
        quaCam qc = new quaCam();
        quaTao qt = new quaTao();
        camSanh cs = new camSanh();
        camCaoPhong ccp = new camCaoPhong();
        //Qua Cam
        qc.setnguonGoc("Trung Quoc");
        qc.setloaiCam("cam Chua");
        qc.setngayNhap("14-10");
        qc.setGia(9000);
        qc.gioithieuCam();
        qc.ngaynhapCam();
        //Qua Tao
        System.out.println("\n");
        qt.setGia(15000);
        qt.setngayNhap("13-10");
        qt.setcanNang(50);
        qt.setloaiTao("Tao meo");
        qt.soluongTao();
        qt.giaTao();
        //Cam Sanh
        System.out.println("\n");
        cs.setviCam("chua");
        cs.setnguonGoc("Thai Lan");
        cs.setGia(10000);
        cs.ngcamSanh();
        cs.viCamSanh();
        //Cam Cao Phong
        System.out.println("\n");
        ccp.setHanSuDung("2020");
        ccp.setHangLoai(1);
        ccp.setnguonGoc("Binh Duong");
        ccp.setGia(20000);
        ccp.chatluong();
        ccp.nguonGocCamCP();
    }
}
