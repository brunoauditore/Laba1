package java;

/**
 * Created by root on 05.12.17.
 */
public class Main {
    public static void main(String[] args) {
        Credit credit1 = new Credit();
        Credit credit2 = new Credit(1000,10,1010,"Privat_Bank","Ivanov");
        Credit credit3 = new Credit(3000,5,"Aval","Petrov");

        credit1.resultValues(2000,10,2020,"Unicredit" , "Stepanov");

        System.out.println("Об'єкт 1: " + credit1.toString());
        System.out.println("Сума 1: " + credit1.printStaticSum());
        System.out.println("Сума 1: " + credit1.printSum());

        System.out.println("Об'єкт 2: " + credit2.toString());
        System.out.println("Сума 2: " + credit2.printStaticSum());
        System.out.println("Сума 2: " + credit2.printSum());

        System.out.println("Об'єкт 3: " + credit3.toString());
        System.out.println("Сума 3: " + credit3.printStaticSum());
        System.out.println("Сума 3: " + credit3.printSum());
    }
 }
