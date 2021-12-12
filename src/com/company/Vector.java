package com.company;

import static java.lang.Double.doubleToLongBits;

public class Vector
{
    private double x;
    private double y;
    private double z;
    public Vector(double x,double y,double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    // Длина вектора. Корень из суммы квадратов
    double length(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    // метод, вычисляющий скалярное произведение
    double scalarProduct(Vector vector){
        return vector.x*this.x+vector.y*this.y+vector.z*this.z;
    }

    // метод, вычисляющий векторное произведение
    Vector crossProduct(Vector vector){
        return new Vector(this.y*vector.z-this.z*vector.y,this.z*vector.x-this.x*vector.z,this.x*vector.y-this.y*vector.x);
    }

    // Косинус между двумя векторами
    double cos(Vector vector){
        return this.scalarProduct(vector)/(this.length()*vector.length());
    }

    // Сумма двух векторов
    Vector add(Vector vector){
        return new Vector(this.x+vector.x,this.y+vector.y,this.z+vector.z);
    }

    // Разность двух веторов
    Vector subtract(Vector vector){
        return new Vector(this.x-vector.x,this.y-vector.y,this.z-vector.z);
    }

    @Override
    public int hashCode() {
        long xbits = doubleToLongBits(x);
        long ybits = doubleToLongBits(y);
        long zbits = doubleToLongBits(z);
        xbits =  (int)(xbits ^ (xbits >>> 32));
        ybits =  (int)(ybits ^ (ybits >>> 32));
        zbits =  (int)(zbits ^ (zbits >>> 32));
        return (int) (11*xbits+7*ybits + 3*zbits);
    }
    public boolean equals(Vector vector)
    {
        return this.hashCode() == vector.hashCode();
    }
}

