package com.shows.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

@Entity
@Table(name = "Shows")
public class shows {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Informe o nome do Artista!")
	private String nomedoartista;

	@NotNull(message = "Informe o tempo de show")
	private int tempodeshow;

	@NotNull(message = "Informe o valor do ingresso")
	private String valordoingresso;

	@NotNull(message = "Informe a localização do local")
	private String local;

	@PastOrPresent
	private int classificacaoetaria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomedoartista() {
		return nomedoartista;
	}

	public void setNomedoartista(String nomedoartista) {
		this.nomedoartista = nomedoartista;
	}

	public int getTempodeshow() {
		return tempodeshow;
	}

	public void setTempodeshow(int tempodeshow) {
		this.tempodeshow = tempodeshow;
	}

	public String getValordoingresso() {
		return valordoingresso;
	}

	public void setValordoingresso(String valordoingresso) {
		this.valordoingresso = valordoingresso;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getClassificacaoetaria() {
		return classificacaoetaria;
	}

	public void setClassificacaoetaria(int classificacaoetaria) {
		this.classificacaoetaria = classificacaoetaria;
	}
	

}
