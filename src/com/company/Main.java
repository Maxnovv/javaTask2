package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ВВедите x первого вектора ");
        double x1 = s.nextDouble();
        System.out.println("ВВедите y первого вектора ");
        double y1 = s.nextDouble();
        System.out.println("ВВедите z первого вектора ");
        double z1 = s.nextDouble();
        System.out.println("ВВедите x второго вектора ");
        double x2 = s.nextDouble();
        System.out.println("ВВедите y второго вектора ");
        double y2 = s.nextDouble();
        System.out.println("ВВедите z второго вектора ");
        double z2 = s.nextDouble();
	    Vector v1= new Vector(x1,y1,z1);
        Vector v2 = new Vector(x2,y2,z2);
        System.out.println("Длина первого вектора: " + v1.length());
        System.out.println("Длина второго вектора: " + v2.length());
        System.out.println("Скалярное произведение: " + v1.scalarProduct(v2));
        System.out.println("векторное произведение: " + v1.crossProduct(v2));
        System.out.println("косинус: " + v1.cos(v2));
        System.out.println("сумма: " + v1.add(v2));
        System.out.println("сумма: " + v1.subtract(v2));
        System.out.println("Хэш первого вектора: " +  v1.hashCode());
        System.out.println("Хэш второго вектора: " +  v2.hashCode());
        System.out.println("Проверка equals: " + v1.equals(v2));

    }
}
