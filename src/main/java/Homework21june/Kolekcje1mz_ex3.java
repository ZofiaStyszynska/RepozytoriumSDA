package Homework21june;

import java.util.ArrayList;
import java.util.List;

public class Kolekcje1mz_ex3 {
    public static void addFirstLast(List<Double> list) {
        double firstNumber = list.get(0);
        double lastNumber = list.get(list.size() - 1);
        double sum = firstNumber + lastNumber;
        System.out.println(firstNumber + " + " + lastNumber + " = " + sum);
    }

    public static void multiplyFirstLast(List<Double> list) {
        double firstNumber = list.get(0);
        double lastNumber = list.get(list.size() - 1);
        double product = firstNumber * lastNumber;
        System.out.println(firstNumber + " * " + lastNumber + " = " + product);


    }

    public static void divideSecPenult(List<Double> list) {

        double secondNumber = list.get(1);
        double penultNumber = list.get(list.size() - 2);
        double product = secondNumber / penultNumber;
        if (list.size() >=2){
        System.out.println(secondNumber + " / " + penultNumber + " = " + product);}
        else {
            System.out.println("Lista jest za krótka.");
        }


    }

    public static void main(String[] args) {
        List<Double> floatPointNums = new ArrayList<>();
        floatPointNums.add(23.7);
        floatPointNums.add(47.98);
        floatPointNums.add(87.9);
        floatPointNums.add(347.45);
        floatPointNums.add(76.09);
        floatPointNums.add(3.908);
        floatPointNums.add(4.9);
        floatPointNums.add(98.7);
        floatPointNums.add(78.9);
        floatPointNums.add(8.067);

        addFirstLast(floatPointNums);
        multiplyFirstLast(floatPointNums);
        divideSecPenult(floatPointNums);
        //System.out.println(floatPointNums.get(0)+floatPointNums.get(floatPointNums.size()-1));
    }
}
