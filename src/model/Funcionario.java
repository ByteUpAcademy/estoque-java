package model;

import java.util.Date;

public class Funcionario {


    private Long id;

    private String nome;

    private String sobrenome;

    private String sexo;

    private String cargo;

    private double salario;

    private String cpf;

    private Date dataDeNascimento;

    public Funcionario(Long id, String nome, String sobrenome, String sexo, String cargo, double salario, String cpf, Date dataDeNascimento) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.cargo = cargo;
        this.salario = salario;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Funcionario() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }




}
