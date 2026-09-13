package com.example.estruturasrepeticao;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int venda = 1;
        double total = 0;

        while (venda <= 5) {
            System.out.print("Digite o valor da venda: ");
            double valor = sc.nextDouble();

            total = total + valor;
            venda++;
        }

        System.out.println("Faturamento total do dia: R$ " + total);

        sc.close();
    }
}