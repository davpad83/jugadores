package bean;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class Documento implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1077590596583170813L;
	@Column(name="Tipodoc", columnDefinition="char(3)")
	private String Tipo;
	@Column(name="Nrodoc")
	private Integer Numero;
	
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public Integer getNumero() {
		return Numero;
	}
	public void setNumero(Integer numero) {
		Numero = numero;
	}
	
}
