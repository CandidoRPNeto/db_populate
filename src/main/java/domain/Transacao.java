package domain;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transacao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private UUID id_usuario;
	private String beneficiario;
	private Date data_transacao;
	private double valor;
	private String tipo_transacao;
	private String categoria;
	private boolean sob_suspeita;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(UUID id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}

	public Date getData_transacao() {
		return data_transacao;
	}

	public void setData_transacao(Date data_transacao) {
		this.data_transacao = data_transacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipo_transacao() {
		return tipo_transacao;
	}

	public void setTipo_transacao(String tipo_transacao) {
		this.tipo_transacao = tipo_transacao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public boolean isSob_suspeita() {
		return sob_suspeita;
	}

	public void setSob_suspeita(boolean sob_suspeita) {
		this.sob_suspeita = sob_suspeita;
	}

}
