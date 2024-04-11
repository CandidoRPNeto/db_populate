package br.ucsal.cartao_system;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import domain.Notificacao;
import domain.Usuario;

public class Populate {
    Random random = new Random();
	char[] letras = {'M', 'F', 'O'};
	String[] uf = {"BA","BA","BA","BA","BA","BA","BA","BA","PA","SP","RJ","RS","PR"};
	String[] grauInstrucao = {"Ensino Fundamental", "Ensino Médio", "Graduação", "Pós-graduação", "Doutorado"};
    String[] estadoCivil = {"Solteiro", "Casado", "Divorciado", "Viúvo"};
	
	
	public Usuario generateUser() {
		Usuario us = new Usuario();
		us.setId(UUID.randomUUID());
        Calendar dataIniC = Calendar.getInstance(), dataFimC = Calendar.getInstance();
        dataIniC.add(Calendar.YEAR, -90);
        dataFimC.add(Calendar.YEAR, -18);
        Date dataIni = dataIniC.getTime(), dataFim = dataFimC.getTime();
		Date dataAleatoria = new Date((long) (dataIni.getTime() + Math.random() * (dataFim.getTime() - dataIni.getTime())));
        double telefoneAleatorio = random.nextDouble() * (557199999999L - 557100000000L) + 557100000000L;
		String nome = "a d";
        String email = nome.toLowerCase().replace(" ", "") + random.nextInt(90) + 10;
        String cpf = "";
        for (int i = 0; i < 11; i++) {
            int digito = random.nextInt(10);
            cpf += digito;
        }
		
		us.setCpf(cpf);
		us.setLogin(cpf);
		us.setSenha(email + cpf);
		us.setData_nascimento(dataAleatoria);
		us.setSexo(letras[(int) Math.floor(Math.random() * letras.length)]);
        us.setTelefone(telefoneAleatorio);
        us.setEmail(email + "@email.com.br");
        us.setRenda_mensal(random.nextInt(90000) + 10000);
        us.setNaturalidade("Brasileiro");
        us.setNacionalidade("Brasil");
        us.setPais_nacimento("Brasil");
        us.setUf(uf[(int) Math.floor(Math.random() * uf.length)]);
        us.setEstado_civil(estadoCivil[(int) Math.floor(Math.random() * estadoCivil.length)]);
        us.setGrau_instrucao(grauInstrucao[(int) Math.floor(Math.random() * grauInstrucao.length)]);
        
		return us;
//		  nome VARCHAR(100) NOT NULL,
//		  endereco VARCHAR(100) NOT NULL,
	}
	
	public Notificacao generateNotificacao(UUID userId) {
		Notificacao nt = new Notificacao();
        Calendar dataIniC = Calendar.getInstance(), dataFimC = Calendar.getInstance();
        dataIniC.add(Calendar.YEAR, -2);
        Date dataIni = dataIniC.getTime(), dataFim = dataFimC.getTime();
		Date dataAleatoria = new Date((long) (dataIni.getTime() + Math.random() * (dataFim.getTime() - dataIni.getTime())));
		nt.setId(UUID.randomUUID());
		nt.setId_usuario(userId);
		nt.setData_notificacao(dataAleatoria);
		nt.setMensagem("Usuario Notificado");
		nt.setLida(random.nextBoolean());
		return nt;
	}
}
