package com.ss10_list.thuc_hanh;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listCard = new ArrayList<>();
        listCard.add("Chuối");
        listCard.add("Thịt");
        listCard.add("Cam");

        listCard.set(2, "Hành");
        listCard.remove("Hành");
        System.out.println(listCard.contains("Cà chua"));
        for (int i = 0; i < listCard.size() ; i++) {
            System.out.println(listCard.get(i));
        }
    }
}
