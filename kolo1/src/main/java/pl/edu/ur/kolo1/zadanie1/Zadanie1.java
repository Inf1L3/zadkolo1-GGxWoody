/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.kolo1.zadanie1;

/**
 *
 * @author student
 */
public class Zadanie1 {

    public void odliczanie() {
        for (int i = 0; i <= 10; i++) {
            if (i == 1 || i == 3 || i == 6 || i == 8) {
                continue;
            }
            System.out.println(i);
        }
    }
}
