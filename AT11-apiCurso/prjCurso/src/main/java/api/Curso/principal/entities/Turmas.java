package api.Curso.principal.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Turmas {
	@Id
	private double data_inicio;
	private double data_termino;
	private double horario_aulas;
	private double numero_vagas;
	
	public Turmas() {
		
	}
	
	public Turmas(double data_inicio, double data_termino, double horario_aulas, double numero_vagas) {
		this.data_inicio = data_inicio;
		this.data_termino = data_termino;
		this.horario_aulas = horario_aulas;
		this.numero_vagas = numero_vagas;
	}

	public double getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(double data_inicio) {
		this.data_inicio = data_inicio;
	}

	public double getData_termino() {
		return data_termino;
	}

	public void setData_termino(double data_termino) {
		this.data_termino = data_termino;
	}

	public double getHorario_aulas() {
		return horario_aulas;
	}

	public void setHorario_aulas(double horario_aulas) {
		this.horario_aulas = horario_aulas;
	}

	public double getNumero_vagas() {
		return numero_vagas;
	}

	public void setNumero_vagas(double numero_vagas) {
		this.numero_vagas = numero_vagas;
	}
}
