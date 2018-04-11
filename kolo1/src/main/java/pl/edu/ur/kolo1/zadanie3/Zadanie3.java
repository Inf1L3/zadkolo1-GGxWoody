/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.kolo1.zadanie3;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Zadanie3 {

    private int[] tab = new int[10];

    public Zadanie3() {
        for (int i = 0; i < 10; i++) {
            tab[i] = 0;
        }
    }

    public void setTab() {
        for (int i = 0; i < 10; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Podaj liczbe " + i + " do wpisania:");
            int number = input.nextInt();
            input.nextLine();
            this.tab[i] = number;
        }
    }

    public void getTab() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ".  " + tab[i]);
        }
    }

    public int srednia() {
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            suma += this.tab[i];
        }
        return suma / 10;
    }
}
