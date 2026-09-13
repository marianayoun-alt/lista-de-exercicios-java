package com.example.estruturasrepeticao;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0;
        String continuar;

        do {
            System.out.print("Digite o valor do produto: ");
            double valor = sc.nextDouble();

            total = total + valor;

            System.out.print("Deseja continuar? (sim ou não): ");
            continuar = sc.next();

        } while (continuar.equalsIgnoreCase("sim"));

        System.out.println("Total das vendas: R$ " + total);

        sc.close();
    }
}