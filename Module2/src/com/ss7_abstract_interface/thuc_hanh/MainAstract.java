package com.ss7_abstract_interface.thuc_hanh;

abstract class DongVat1 {
    public  abstract void noi();
    public void ngu() {
        System.out.println("Động vật đang ngủ!!!");
    }
}
class Meo1 extends DongVat1 {

    @Override
    public void noi() {
        System.out.println("Mèo kêu meo meo");
    }
}

public class MainAstract {
    public static void main(String[] args) {
        DongVat1 dongVat = new Meo1();
        dongVat.ngu();
        dongVat.noi();
    }
}
