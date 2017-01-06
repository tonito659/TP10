package com.solarus;

import edu.princeton.cs.introcs.StdDraw;
import java.util.Scanner;



public class Main {

    public final static int X_MAX= 20;
    public final static int Y_MAX= 20;
    public final static float WIDTH= 1;


    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int taille_goban = 0;

        System.out.println("taille du goban ? 9,13,19");
        taille_goban = sc.nextInt();





        // RELATIF A LA FENETRE ET AUX AXES QQQUE L ON UTILISERA TOUT AU COURS DU PROGRAMME
        StdDraw.setCanvasSize(700, 700);
        StdDraw.setXscale(-WIDTH, X_MAX + WIDTH);
        StdDraw.setYscale(-WIDTH, Y_MAX + WIDTH);

        //StdDraw.filledPolygon();

        int min, max;
        switch (taille_goban) {
            case 9:
                min = 6;
                max = 14;
                for (int y = min; y <= max; ++y) {
                    StdDraw.line(min, y, max, y);
                    StdDraw.line(y, min, y, max);
                    StdDraw.filledCircle(10,10,0.1);
                }
                break;
            case 13:
                min = 4;
                max = 16;
                for (int y = min; y <= max; ++y) {
                    StdDraw.line(min, y, max, y);
                    StdDraw.line(y, min, y, max);
                    StdDraw.filledCircle(7,7,0.1);
                    StdDraw.filledCircle(7,10,0.1);
                    StdDraw.filledCircle(7,13,0.1);
                    StdDraw.filledCircle(10,7,0.1);
                    StdDraw.filledCircle(10,10,0.1);
                    StdDraw.filledCircle(10,13,0.1);
                    StdDraw.filledCircle(13,13,0.1);
                    StdDraw.filledCircle(13,1013,0.1);
                    StdDraw.filledCircle(13,7,0.1);

                }
                break;
            case 19:
                min = 1;
                max = 19;
                for (int y = min; y <= max; ++y) {
                    StdDraw.line(min, y, max, y);
                    StdDraw.line(y, min, y, max);
                    StdDraw.filledCircle(4,4,0.1);
                    StdDraw.filledCircle(4,10,0.1);
                    StdDraw.filledCircle(4,16,0.1);
                    StdDraw.filledCircle(10,4,0.1);
                    StdDraw.filledCircle(10,10,0.1);
                    StdDraw.filledCircle(10,16,0.1);
                    StdDraw.filledCircle(16,4,0.1);
                    StdDraw.filledCircle(16,10,0.1);
                    StdDraw.filledCircle(16,16,0.1);
                }
                break;
        }

    }
}
