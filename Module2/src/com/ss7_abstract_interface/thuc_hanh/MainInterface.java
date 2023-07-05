package com.ss7_abstract_interface.thuc_hanh;

import java.util.ArrayList;

interface DongVat {
    String MAU_LONG = "Vàng";
    void hanhDong();
    default void keu() {
        System.out.println("Động vật Kêu....");
    }
}
class Meo implements DongVat{

    @Override
    public void hanhDong() {
        System.out.println("Mỹ Diệu đang ngồi!!!");
    }
    @Override
    public  void keu () {
        System.out.println("Mỹ Diệu kêu meo meo!!!");
    }
}
class Cun implements DongVat {

    @Override
    public void hanhDong() {
        System.out.println("Nguyễn Văn Dúi đang chạy....");
    }
    @Override
    public  void keu () {
        System.out.println("Dúi kêu gâu gâu!!!");
    }
}

public class MainInterface {
    public static void main(String[] args) {
        ArrayList<DongVat> idols = new ArrayList<>();
        idols.add(new Meo());
        idols.add(new Cun());
        for (DongVat idol : idols ) {
            idol.hanhDong();
            idol.keu();
        }
    }
}
