package domain;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private UUID id_dependencia;
	private String login;
	private String senha;
	private String nome;
	private String cpf;
	private Date data_nascimento;
	private char sexo;
	private double telefone;
	private String email;
	private String endereco;
	private int renda_mensal;
	private String naturalidade;
	private String nacionalidade;
	private String pais_nacimento;
	private String uf;
	private String estado_civil;
	private String grau_instrucao;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getId_dependencia() {
		return id_dependencia;
	}

	public void setId_dependencia(UUID id_dependencia) {
		this.id_dependencia = id_dependencia;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getTelefone() {
		return telefone;
	}

	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getRenda_mensal() {
		return renda_mensal;
	}

	public void setRenda_mensal(int renda_mensal) {
		this.renda_mensal = renda_mensal;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getPais_nacimento() {
		return pais_nacimento;
	}

	public void setPais_nacimento(String pais_nacimento) {
		this.pais_nacimento = pais_nacimento;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	public String getGrau_instrucao() {
		return grau_instrucao;
	}

	public void setGrau_instrucao(String grau_instrucao) {
		this.grau_instrucao = grau_instrucao;
	}
}
