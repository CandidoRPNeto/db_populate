package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public class Solicitacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private UUID id_usuario;
    private Date data_solicitacao;
    private String texto;
    private boolean aprovacao;
    private String tipo_solicitacao;
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
	public Date getData_solicitacao() {
		return data_solicitacao;
	}
	public void setData_solicitacao(Date data_solicitacao) {
		this.data_solicitacao = data_solicitacao;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public boolean isAprovacao() {
		return aprovacao;
	}
	public void setAprovacao(boolean aprovacao) {
		this.aprovacao = aprovacao;
	}
	public String getTipo_solicitacao() {
		return tipo_solicitacao;
	}
	public void setTipo_solicitacao(String tipo_solicitacao) {
		this.tipo_solicitacao = tipo_solicitacao;
	}

}

