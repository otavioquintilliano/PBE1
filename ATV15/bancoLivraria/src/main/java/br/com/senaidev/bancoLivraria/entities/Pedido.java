package br.com.senaidev.bancoLivraria.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "dt_pedido", nullable = false)
	private date dt_pedido;
	
	@Column(name = "fm_pagamento", nullable = false, length = 100)
	private String fm_pagamento;
}
