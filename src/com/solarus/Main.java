package com.solarus;

import edu.princeton.cs.introcs.StdDraw;
import java.util.Scanner;

public class Main {

    public final static int X_MAX= 20;
    public final static int Y_MAX= 20;
    public final static float WIDTH= 1;


    public static void main (String [] args) {
        System.out.println("taille du goban ?");
        Scanner sc = new Scanner(System.in);
        int taille_goban= sc.nextInt();




        // RELATIF A LA FENETRE ET AUX AXES QQQUE L ON UTILISERA TOUT AU COURS DU PROGRAMME
        StdDraw.setCanvasSize(700,700);
        StdDraw.setXscale(-WIDTH, X_MAX + WIDTH);
        StdDraw.setYscale(-WIDTH, Y_MAX + WIDTH);

        for (int y = 1; y <= 19; ++y) {
            StdDraw.line(1, y, 19, y);
            StdDraw.line(y, 1, y, 19);
        }
        }

}
