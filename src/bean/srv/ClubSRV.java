package bean.srv;

import java.util.List;

import bean.Club;
import bean.Jugador;
import bean.dao.HibernateClubDAO;

public class ClubSRV {
	private static HibernateClubDAO dao;
	static {
		dao = HibernateClubDAO.getInstancia();
	}
	
	public List<Club> listClubes(){
		return dao.listClubes();
	}
	
	public List<Jugador> listJugadores(){
		return dao.listJugadores();
	}
	
	public List<Object[]> jugadoresPorClub(){
		return dao.jugadoresPorClub();
	}
}
