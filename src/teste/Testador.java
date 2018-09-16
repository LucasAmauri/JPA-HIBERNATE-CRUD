package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import Dao.automovelDAO;
import jpa.JPAUtil;
import jpa.model.automovel;

public class Testador {
	
	public static void main(String[] args) throws Exception {
		
		automovel veiculo;
		veiculo = new automovel();
		
		automovelDAO a1;
		a1 = new automovelDAO();
		veiculo.setMarca("Chevrolet");
		veiculo.setModelo("Onix");
		veiculo.setAnoFrabricacao(2011);
		veiculo.setObservacao("Não tem volante");
		veiculo.setAnoModelo(2002);
		
	
		a1.salvar(veiculo); //adiciona dadoas setados acima
		a1.excluir(5); // exclui os dados que tem o id 5 no banco de dados
		a1.consultarPorId(2); //consulta qual sao as informações do veiculo que contém o id 2
	
		

}
	
	
	
}