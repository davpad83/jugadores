package bean;

import javax.persistence.*;
@Entity
@Table(name="clubes")

public class Club {
	@Id @Column(columnDefinition="smallint")
	private Integer id_Club;
	@Column(columnDefinition="char(30)")
	private String nombre;
	
	public Integer getId_Club() {
		return id_Club;
	}
	public void setId_Club(Integer id_Club) {
		this.id_Club = id_Club;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
