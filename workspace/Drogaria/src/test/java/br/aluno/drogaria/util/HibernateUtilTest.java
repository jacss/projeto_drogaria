package br.aluno.drogaria.util;

import org.hibernate.Session;
import org.junit.Test;

public class HibernateUtilTest {
	@Test
	public void connect() {
		Session session = HibernateUtil.getFabricaDeSessoes().openSession();
		session.close();
		HibernateUtil.getFabricaDeSessoes().close();
	}

}
