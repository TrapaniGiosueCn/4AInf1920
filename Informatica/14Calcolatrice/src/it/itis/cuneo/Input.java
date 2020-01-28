//Trapani Giosuè

package it.itis.cuneo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Input {
    public static int somma(int n1, int n2)
    {
        int s;
        s = n1+n2;
        return s;
    }

    public static int sottrazione(int n1, int n2)
    {
        int sot;
        sot = n1-n2;
        return sot;
    }

    public static int moltiplicazione(int n1, int n2)
    {
        int m;
        m = n1*n2;
        return m;
    }

    public static int divisione(int n1, int n2)
    {
        int d;
        d = n1/n2;
        return d;
    }

    public static void main(String[] args) throws IOException {
        int num=0;

        System.out.println("\nInserire il primo numero");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        int aa = Integer.parseInt(string);

        System.out.println("\nInserire il secondo numero");
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String string2 = br2.readLine();
        int ab= Integer.parseInt(string2);

        num= somma(aa,ab);
        System.out.println("\nLa somma vale: "+num);
        num=sottrazione(aa,ab);
        System.out.println("La sottrazione vale: "+num);
        num=moltiplicazione(aa,ab);
        System.out.println("La moltiplicazione vale: " +num);
        num=divisione(aa,ab);
        System.out.println("La divisione vale: "+num);
    }
}