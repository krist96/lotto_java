package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* Poczatek 1 ETAP
         * 1. przyjmujemy od uzytkownika 6 roznych (unikalnych) liczb.*/
        Set<Integer> liczbyGracza = new HashSet<>();

        for(int i = 1; liczbyGracza.size() < 6; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj liczby [Podaj liczby od 1 do 49] : ");
            int liczbaPobrana = scan.nextInt();
            if(liczbaPobrana > 0 && liczbaPobrana < 50) {
                liczbyGracza.add(liczbaPobrana);
            }else{
                System.out.println("Niepoprawna liczba. [Podaj liczby od 1 do 49]");
            }
        }
        System.out.println("ZbiĂłr przyjÄty od uzytkownika: " + liczbyGracza);
        /*Koniec 1 ETAP*/
        /*Poczatek Etap 2*/
        Set<Integer> liczbyWylosowane = new HashSet<>();

        for(int i = 1; liczbyWylosowane.size() < 6; i++) {
            int liczba = (int)Math.round((Math.random()*48)+1);
            liczbyWylosowane.add(liczba);
        }
        System.out.println("ZbiĂłr wylosowany:  " + liczbyWylosowane);
        /*Koniec Etap 2*/
        /*Poczatek Etapu 3*/
        Set<Integer> liczbyTrafione = new HashSet<>();
        liczbyTrafione = porownanie(liczbyGracza, liczbyWylosowane);
        System.out.println("TrafiĹeĹ: " + liczbyTrafione.size() + " liczb." +
                " Trafione liczby to: " + liczbyTrafione);
        /*Koniec Etapu 3*/

    }
    private static <E> Set<E> porownanie(Set<? extends E> set1, Set<? extends E> set2){
        var temp = new HashSet<E>(set1);
        temp.retainAll(set2);
        return temp;
    }
}