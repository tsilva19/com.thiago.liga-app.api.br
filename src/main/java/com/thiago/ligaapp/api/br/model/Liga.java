package com.thiago.ligaapp.api.br.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
public class Liga {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("_id")
	private Long id;
	
	@Column(nullable=false)
	private String emblema;
	
	@Column(length = 250, nullable=false)
	private String name;
	
	@Column
	private int pontos;

	
	
}
