/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compras;

/**
 *
 * @author Airam
 */
public class Cliente {
    private String nome;
    private String CPF;
    private String telefone;
    private String endereco;
    private String cartao;
    
  
    public Cliente(String nome, String CPF, String telefone, String endereco, String cartao) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cartao = cartao;
    }    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCartao() {
        return cartao;
    }

    public void setNumCartao(String cartao) {
        this.cartao = cartao;
    }
public void atualizarDadosCartao(String dadosCartao) {
this.cartao = dadosCartao;
System.out.println(dadosCartao);
}

public void fazPedido() {
System.out.println("Pedido Aprovado!");
}
}
