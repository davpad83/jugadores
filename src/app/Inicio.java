package app;

import java.util.List;

import bean.Club;
import bean.Jugador;
import bean.srv.ClubSRV;

public class Inicio {
//
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClubSRV servicio = new ClubSRV();
		//mostrarClub ( servicio.listClubes());
		//mostrarJugador ( servicio.listJugadores());
		mostrarCantidad ( servicio.jugadoresPorClub());
		System.exit(0);
	}
	
	static void mostrarClub(List<Club> clubes) {
		System.out.println("Lista de clubes\n");
		for(Club c : clubes) {
			System.out.println(c.getNombre());
		}
	}
	
	static void mostrarJugador(List<Jugador> jugadores) {
		System.out.println("Lista de jugadores\n");
		for(Jugador j : jugadores) {
			System.out.println(j.getDoc().getTipo()+" "
					+ j.getDoc().getNumero()+" " 
					+ j.getClub().getNombre());
		}
	}
	
	static void mostrarCantidad(List<Object[]> cantidades) {
		System.out.println("Lista de jugadores\n");
		for(Object[] tupla : cantidades) {
			System.out.println(tupla[0]+" "
							+ tupla[1]);
		}
	}
}
