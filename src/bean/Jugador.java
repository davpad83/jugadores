package bean;

import javax.persistence.*;

@Entity
@Table(name="jugadores")
public class Jugador {
	@EmbeddedId
	public Documento doc;
	@ManyToOne @JoinColumn(name="Id_Club")
	public Club club;

	public Documento getDoc() {
		return doc;
	}
	public void setDoc(Documento doc) {
		this.doc = doc;
	}
	public Club getClub() {
		return club;
	}
	public void setClub(Club club) {
		this.club = club;
	}
	
	
}
