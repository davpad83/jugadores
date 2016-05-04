package bean.dao;

import java.util.List;

import hbt.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bean.Club;
import bean.Jugador;


public class HibernateClubDAO {
	private static HibernateClubDAO instancia = null;
	private static SessionFactory sf = null;

	public static HibernateClubDAO getInstancia(){
		if(instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new HibernateClubDAO();
		} 
		return instancia;
	}
	
	@SuppressWarnings("unchecked")
	public List<Club> listClubes(){
		Session session = sf.openSession();
		List<Club> list = session.createQuery("from Club").list();
		session.close();
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public List<Jugador> listJugadores(){
		Session session = sf.openSession();
		List<Jugador> list = session.createQuery(
				"select j from Jugador j join j.club order by j.club")
				.list();
		session.close();
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> jugadoresPorClub(){
		Session session = sf.openSession();
		List<Object[]> list = session.createQuery(
				"select j.club.nombre, count(*) from Jugador j join j.club  group by j.club.nombre")
				.list();
		session.close();
		return list;
	}
	

}
