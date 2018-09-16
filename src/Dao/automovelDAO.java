package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jpa.model.automovel;

public class automovelDAO extends automovel {
	
	private EntityManager getEntityManager() {
	    EntityManagerFactory factory = null;
	    EntityManager entityManager = null;
	    try {
	      //Obtém o factory a partir da unidade de persistência.
	      factory = Persistence.createEntityManagerFactory("hibernate");
	      //Cria um entity manager.
	      entityManager = factory.createEntityManager();
	      //Fecha o factory para liberar os recursos utilizado.
	    } finally {
	      factory.close();
	    }
	    return entityManager;
	  }

	
	
	public automovel salvar(automovel automovel) throws Exception {
	    EntityManager entityManager = getEntityManager();
	    try {
	      // Inicia uma transação com o banco de dados.
	      entityManager.getTransaction().begin();
	      System.out.println("Salvando a pessoa.");
	      // Verifica se o automovel ainda não está salva no banco de dados.
	      if(automovel.getId() == null) {
	        //Salva os dados.
	        entityManager.persist(automovel);
	      } else {
	        //Atualiza os dados do veiculo( se o id for nulo, automovel sera inserido.
	        automovel = entityManager.merge(automovel);
	      }
	      // Finaliza a transação.
	      entityManager.getTransaction().commit();
	    } finally {
	      entityManager.close();
	    }
	    return automovel;
	  }
	
	public void excluir(long id) {
	    EntityManager entityManager = getEntityManager();
	    try {
	      // Inicia uma transação com o banco de dados.
	      entityManager.getTransaction().begin();
	      // Consulta o veiculo na base de dados através do seu ID.
	      automovel automovel = entityManager.find(automovel.class, id);
	      System.out.println("Excluindo os dados do id: " + automovel.getMarca());
	      // Remove o veiculo da base de dados.
	      entityManager.remove(automovel);
	      // Finaliza a transação.
	      entityManager.getTransaction().commit();
	    } finally {
	      entityManager.close();
	    }
	  }
	
	
	 public automovel consultarPorId(long id) {
		    EntityManager entityManager = getEntityManager();
		    automovel automovel = null;
		    try {
		      //Consulta um veiculo pelo seu ID.
		      automovel = entityManager.find(automovel.class, id);
		    } finally {
		      entityManager.close();
		    }
		    return automovel;
		  }
		}
	
	

