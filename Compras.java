/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import compras.Cliente;

/**
 *
 * @author Airam
 */
public class Compras {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Vini", "555555555", "9999-9999", "Rua V, 777", "7777888899995555");
        
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCPF());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Cartão: " + cliente.getCartao());

      
        cliente.atualizarDadosCartao("Dados do Novo Cartão: 3333555544448888");
        cliente.fazPedido();
    }
}

