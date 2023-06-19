package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		System.out.println("\n=== TEST 1: Department Insert ===");

		Department department = new Department(null, "Music");
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		departmentDao.insert(department);
		
		System.out.println("Inserted Id: " + department.getId());
		
		System.out.println("\n=== TEST 2: Department Update ===");
		
		Department department2 = new Department(8, "x");
		
		departmentDao.update(department2);
		System.out.println("Update! ");
		
		System.out.println("\n=== TEST 3: Department DELETE ===");
		
		departmentDao.deleteById(8);
		
		System.out.println("Deleted!");
		
		System.out.println("\n=== TEST 4: Department findBy ===");
		
		Department department3 = departmentDao.findByid(3);
		
		System.out.println(department3);
		
		System.out.println("\n=== TEST 5: Department findBy ===");
		
		departmentDao.findAll();
		
		for(Department department4 : departmentDao.findAll()) {
			System.out.println(department4);
		}
		
	}

}
