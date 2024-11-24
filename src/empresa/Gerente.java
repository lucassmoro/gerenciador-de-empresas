/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Lucas
 */
public class Gerente extends Pessoa{
    
    private Double basesalary;
    private Date dataAdmissao;
    private Cargos cargo;
    private String id;
    
    public Gerente(String nome, String sobrenome, String sexo,
            String cpf,  LocalDate idade, Endereco endereco, Double baseSalary, Cargos cargo, String id) {
        super(nome, sobrenome, sexo, cpf, idade, endereco);
        this.basesalary = basesalary;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.id = id;
    }
    
    public void setFuncionaroSalary(Funcionario funcionario, Double novoSalario) {
        funcionario.setFuncionarioSalary(0.01, this, id);
    }
    
    public Double getBasesalary() {
        return basesalary;
    }
    @Override
    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Cargos getCargo() {
        return cargo;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
