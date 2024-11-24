/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Lucas
 */
public class Funcionario extends Pessoa implements Serializable{
    
    private Double baseSalary;
    private Cargos cargo;
    private Date dataAdmissao;
    
    
    public Funcionario(String nome, String sobrenome, String sexo,
            String cpf,  LocalDate idade, Endereco endereco, Double baseSalary, Cargos cargo) {
        
        super(nome, sobrenome, sexo, cpf, idade, endereco);
        this.baseSalary = baseSalary;
        this.cargo = cargo;
        this.dataAdmissao = new Date();
    }
    
    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setFuncionarioSalary(Double baseSalary, Gerente gerente, String senha) {
        if (senha.equals(gerente.getId())) { // ajustar para novas classes futuras
            this.baseSalary = baseSalary;
        } else {
            throw new SecurityException("ACESSO NEGADO");
        }
    }
    
    public Cargos getCargo() {
        return cargo;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }

    @Override
    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    
}
