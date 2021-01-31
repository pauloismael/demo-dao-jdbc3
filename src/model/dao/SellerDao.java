package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	// inserir o objeto no banco de dados
		void insert(Seller obj);
		// atualiza o objeto no banco de dados
		void update(Seller obj);
		// deleta o objeto no banco de dados pelo ID
		void deleteById(Integer id);
		// encontrar o objeto pelo id
		Seller findById(Integer id);
		// retorna todos departamentos
		List<Seller> findAll();
		List<Seller> findByDepartment (Department department);
}
