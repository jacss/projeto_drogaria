package br.aluno.drogaria.teste;

import br.aluno.drogaria.util.HibernateUtil;

public class HibernateUtilTeste {

	public static void main(String[] args) {
		HibernateUtil.getSessionFactory();
		HibernateUtil.getSessionFactory().close();
		

	}

	

}
