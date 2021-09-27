package ru.LilShkrek;

public class Main {

    public static void main(String[] args) {
        System.out.println("hi");
        System.out.println(args[0]); //Добавил сверху в поле Main-edit configurations-lol - это то, что кладётся в массив args
        double d2 = 1.8;
        double kek = d2 + 5;//Написал d2+5.var и выбрал нижнее
        System.out.println(5 > 8); //Выведет false
        double a1 = 0.5;
        double a2 = 0.5;
        double sum = 1.1;
        double f1 = 0.1;
        double f2 = 0.2;
        System.out.println((a1 + a2) > sum);
        System.out.println(f1 + f2); //Выведет 0.30000000000000004
        System.out.println(1/3); //Выведет 0
        System.out.println(1.0/3); //Выведет 0.333333
        String s1 = "lol";
        System.out.println(s1 == "lol"); //Так нельзя сравнивать
        System.out.println(s1.equals("lol")); //Так надо    Строки - ссылочный тип данных
    }
}
