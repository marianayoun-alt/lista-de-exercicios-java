package com.example.estruturasrepeticao;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cliente = 1;

        while (cliente <= 10) {
            System.out.print("Digite a nota de satisfação do cliente: ");
            sc.nextInt();

            cliente++;
        }

        System.out.println("Quantidade de avaliações registradas: " + (cliente - 1));

        sc.close();
    }
}