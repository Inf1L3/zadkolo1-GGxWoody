/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.kolo1.zadanie2;

/**
 *
 * @author student
 */
public class Zadanie2 {

    public static int Fibb(int Index) {
        if (Index == 1 || Index == 2) {
            return 1;
        } else {
            return Fibb(Index - 1) + Fibb(Index - 2);
        }
    }
}
