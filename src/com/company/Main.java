package com.company;

import java.util.Scanner;

public class Main {

    //explicacoes na Classe
    public static void main(String[] args) {
        System.out.println("insira um texto qualquer(coloque um " +
                "texto com maiusculas e minusculas");
        Scanner bot = new Scanner(System.in);
        String txt = bot.nextLine();
        Altera op = new Altera();
        System.out.println(op.maiusculo(txt));
        System.out.println(op.minusculo(txt));
        System.out.println("insira a letra que voce gostaria de deixar maiuscula");
        int num = bot.nextInt();
        System.out.println(op.umaLetraMaiusculo(txt,num));
        System.out.println("insira a letra que voce gostaria de deixar minuscula");
        num = bot.nextInt();
        System.out.println(op.umaLetraMinusculo(txt,num));
        System.out.println("agora insira quas posicoes na tabela ascii " +
                "que voce gostaria que o texto " +
                "andasse ");
        num = bot.nextInt();
        System.out.println(op.criptografia(txt,num));

    }
}
