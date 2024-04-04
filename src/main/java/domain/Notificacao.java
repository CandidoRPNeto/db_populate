package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public class Notificacao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private UUID id_usuario;
	private Date data_notificacao;
	private String mensagem;
	private boolean lida;

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

	public Date getData_notificacao() {
		return data_notificacao;
	}

	public void setData_notificacao(Date data_notificacao) {
		this.data_notificacao = data_notificacao;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public boolean isLida() {
		return lida;
	}

	public void setLida(boolean lida) {
		this.lida = lida;
	}

}
