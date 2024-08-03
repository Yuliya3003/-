package org.example;
//Написать класс Калькулятор (необобщенный), который содержит обобщенные статические
// методы: sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
// над которыми должна быть произведена операция. Методы должны возвращать результат своей работы.
public class Calculator {
    public static double sum(Number num1, Number num2){
         return num1.doubleValue() + num2.doubleValue();
    }
    public static double multiply(Number num1, Number num2){
        return num1.doubleValue()*num2.doubleValue();
    }
    public static double divide(Number num1, Number num2){
        if (num2.doubleValue() == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1.doubleValue() / num2.doubleValue();
    }
    public static double subtract(Number num1, Number num2){
        return num1.doubleValue() - num2.doubleValue();
    }
}
