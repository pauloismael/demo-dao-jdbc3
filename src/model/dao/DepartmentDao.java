package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	// inserir o objeto no banco de dados
	void insert(Department obj);
	// atualiza o objeto no banco de dados
	void update(Department obj);
	// deleta o objeto no banco de dados pelo ID
	void deleteById(Integer id);
	// encontrar o objeto pelo id
	Department findById(Integer id);
	// retorna todos departamentos
	List<Department> findAll();
}
