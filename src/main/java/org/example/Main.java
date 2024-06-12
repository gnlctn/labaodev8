package org.example;
import java.util.ArrayList;
import java.util.List;  

public class Main {
    public static void main(String[] args) {
        String[] Kelimeler={"metin","mutant","hakim","karar"};//metinmuhakimka olmalı
        List<String> Turetim = new ArrayList<>();

        for (int i=0; i < Kelimeler.length ; i++) {
            char[] a = Kelimeler[i].toCharArray();
            //String[] a = Kelimeler[i].split("");//[m,e,t,i,n]
            //System.out.println(a);
            int k=a.length;
            for(int j=0; j < k; j++){
                if (a[j] == a[k-1]){
                    break;
                }
                else {
                    Turetim.add(String.valueOf(a[j]));
                    //System.out.println(Turetim);
                }
            }
        }
        System.out.println(Turetim);
    }
}