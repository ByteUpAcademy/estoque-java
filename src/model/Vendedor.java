package model;

import java.util.Date;

public class Vendedor extends Funcionario {

    private double comissao;

    public Vendedor() {

    }

    public Vendedor(Long id, String nome, String sobrenome, String sexo, String cargo, double salario, String cpf, Date dataDeNascimento, double comissao) {
        super(id, nome, sobrenome, sexo, cargo, salario, cpf, dataDeNascimento);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void vender(double valorDoCarro) {
        if(valorDoCarro <= 0.0) {
            System.out.println("O valor informado do carro esta invalido");
        } else {
            this.comissao = valorDoCarro * 0.05;
        }

    }


}
