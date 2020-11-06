/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionsmatematiques;

import java.util.Scanner;

/**
 * Implementar i provar funcions matemàtiques
 * @author alumne
 */
public class FuncionsMatematiques {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FuncionsMatematiques programa = new FuncionsMatematiques();
        programa.inici();
    }

    /**
     * Programa principal
     */
    private void inici() {
        int n = 0;
        int f = 0;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double e = 0;
        double x = 0;
        boolean cert = false;
        double quantitat = 0;
        double percentatge = 0;
        double cent = 0;


        long digits = 0;
        double vmitjana = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("1. Calcular el factorial d'un número.\n2. Compta el número de dígits d'un número.\n3. Calcula la mitjana aritmètica de quatre números." +
                "\n4. Retorna el número més gran. \n5. Comprova si un número és parell. \n6. Comprova si un número és imparell. \n7. Comprova si un número més múltiple d'un altre." +
                "\n8. Calcula el valor del polinomi ax^4 + bx^3 + cx^2 + dx^1 + ex.\n9. Aplica un percentatge de descompte a una quantitat. \n10. Comprova si un número és perfecte, és a dir, que el seu valor és igual a la suma dels seus divisors\n" +
                "11. Converteix graus centígrads a farenheit.");
        System.out.println("\nSelecciona opció: ");
        int opcio = lector.nextInt();
        switch (opcio) {
            case 1:
                System.out.println("El factorial es " + factorial(f));
                break;
            case 2:
                System.out.println("Número de dígits: "+comptaDigits(digits));
                break;
            case 3:
                System.out.println("Mitjana: "+mitjana(n1, n2, n3, n4));
                break;
            case 4:
                System.out.println("Núm més gran: "+mesGran(n1, n2, n3));
                break;
            case 5:
                System.out.println("Parell: "+esParell(n));
                break;
            case 6:
                System.out.println("Imparell: "+esImparell(n));
                break;
            case 7:
                System.out.println("Multiple: "+esMultiple(n, 0));
                break;
            case 8:
                System.out.println("Resultado: "+valorPolinomiGrau5(a, b, c, d, e, x));
                break;
            case 9:
                System.out.println("Quantitat total: "+descomptar(quantitat, percentatge));
                break;
            case 10:
                System.out.println("Perfecte: "+esNombrePerfecte(n));
                break;
            case 11:
                System.out.println("Fahrenheit: "+centigradToFarenhait(cent));
                break;
        }
    }

    /**
     * Calcula el factorial d'un nombre enter
     * @param n un número 
     * @return el valor de n!
     */
    int factorial(int n) {
        Scanner lector = new Scanner (System.in);
        System.out.println("Valor n: ");
        n = lector.nextInt();
        int f = 1;
        for (int x=2;x<=n;x++)
            f = f * x;
        return f;
    }
    
    /**
     * Compta els dígits d'un número
     * @param n un número 
     * @return un enter amb el número de dígits de n
     */
    int comptaDigits(long n) {
        Scanner lector = new Scanner (System.in);
        System.out.println("Escriu un número: ");
        n = lector.nextLong();
        int digits = 0;
        while(n !=0)
        {
            n = n/10;
            digits++;
        }

        return digits;
    }
    
    /**
     * Calcula la mitjana aritmètica de quatre números
     * @param n1 un número
     * @param n2 un número
     * @param n3 un número
     * @param n4 un número
     * @return la mitjana aritmètica dels números dels quatre paràmetres
     */
    private double mitjana(double n1, double n2, double n3, double n4) {
        Scanner lector = new Scanner (System.in);
        System.out.println("Escribe valor n1: ");
        n1 = lector.nextDouble();
        System.out.println("Escribe valor n2: ");
        n2 = lector.nextDouble();
        System.out.println("Escribe valor n3: ");
        n3 = lector.nextDouble();
        System.out.println("Escribe valor n4: ");
        n4 = lector.nextDouble();
        double vmitjana = 0;
        vmitjana = (n1 + n2 + n3 + n4)/4;
        return vmitjana;
    }
    
    /**
     * Retorna el número més gran
     * @param n1 un número
     * @param n2 un número
     * @param n3 un número
     * @return el número més gran
     */
    private int mesGran(int n1, int n2, int n3) {
        Scanner lector = new Scanner (System.in);
        int nmesgran = 0;
        System.out.println("Valor n1: ");
        n1 = lector.nextInt();
        System.out.println("Valor n2: ");
        n2 = lector.nextInt();
        System.out.println("Valor n3: ");
        n3 = lector.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                nmesgran = n1;
            } else {
                nmesgran = n3;
            }
        } else if (n2 > n3) {
            nmesgran = n2;
        } else {
            nmesgran = n3;
        }
        return nmesgran;
    }

    /**
     * Comprova si un número és parell
     * @param n un número
     * @return cert si el paràmetre es parell i fals en cas contrari
     */
    boolean esParell(int n) {
        boolean cert = true;
        Scanner lector = new Scanner (System.in);
        System.out.println("Introdueix un num: ");
        n = lector.nextInt();
        if (n%2 == 0){
            cert = true;
        }else{
            cert = false;
        }
        return cert;
    }

    /**
     * Comprova si un número és imparell
     * @param n un número
     * @return cert si el paràmetre es parell i fals en cas contrari
     */
    boolean esImparell(int n) {
        boolean cert = true;
        Scanner lector = new Scanner (System.in);
        System.out.println("Introdueix un num: ");
        n = lector.nextInt();
        if (n%2 == 1){
            cert = true;
        }else{
            cert = false;
        }
        return cert;
    }

    /**
     * Comprova si un número més múltiple d'un altre
     * @param n el dividend
     * @param d el divisor
     * @return cert si n és múltiple de d i fals en cas contrari
     */
    boolean esMultiple(int n, int d) {
        Scanner lector = new Scanner (System.in);
        boolean cert=false;
        System.out.print("Introdueix valor n: ");
        n = lector.nextInt();
        System.out.print("Introdueix valor d: ");
        d = lector.nextInt();

        int resta=n%d;
        if (resta==0) {
            cert=true;
        }else{
            cert=false;
        }
        return cert;

    }

    /**
     * Calcula el valor del polinomi ax^4 + bx^3 + cx^2 + dx^1 + ex
     * @param a el coeficient de grau 4
     * @param b el coeficient de grau 3
     * @param c el coeficient de grau 2
     * @param d el coeficient de grau 1
     * @param e el coeficient de grau 0
     * @param x el valor de la variable
     * @return el càlcul del valor del polinomi segons els paràmetres proporcionats
     */
    double valorPolinomiGrau5(double a, double b, double c, double d, double e, double x) {
        Scanner lector = new Scanner(System.in);
        a = 3;
        b = 3;
        c = 3;
        d = 3;
        e = 3;
        System.out.println("Valor variable:" );
        x = lector.nextDouble();
        double resultado = a*Math.pow(x, 4) + b*Math.pow(x, 3) + c*Math.pow(x, 2) + d*Math.pow(x, 1) + e*x;

        return resultado;
    }
    
    /**
     * Aplica un percentatge de descompte a una quantitat
     * @param quantitat quantitat inicial
     * @param percentatge percentatge a descomptar
     * @return la quantitat obtinguda després d'aplicar el descompte
     */
    double descomptar(double quantitat, double percentatge) {
        Scanner lector = new Scanner(System.in);
        double quantitatTotal = 0;

        System.out.println("Quantitat: ");
        quantitat = lector.nextDouble();
        System.out.println("Percentatge: ");
        percentatge = lector.nextDouble();

        quantitatTotal = quantitat-(quantitat*(percentatge/100));

        return quantitatTotal;
    }
    
    /**
     * Comprova si un número és perfecte, és a dir, que el seu valor és igual a
     * la suma dels seus divisors
     * @param n un número
     * @return cert si el número és perfecte i fals en cas contrari
     */
    boolean esNombrePerfecte(int n) {
        Scanner lector = new Scanner(System.in);
        boolean cert=false;
        int i = 0;
        int suma = 0;

        System.out.println("Valor n: ");
        n = lector.nextInt();
        for (i = 1; i < n; i++) {
            if (n%i == 0) {
                suma = suma + i;
            }
        }
        if (suma == n) {
            cert = true;
        } else {
            cert = false;
        }
        return cert;
    }
    
    /**
     * Converteix graus centígrads a farenheit
     * @param cent temperatura en graus centígrada
     * @return la temperatura en graus farenheit
     */
    double centigradToFarenhait(double cent) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Valor Cº: ");
        cent = lector.nextDouble();
        double far = cent * 1.8 + 32;
        return far;
    } 


}
