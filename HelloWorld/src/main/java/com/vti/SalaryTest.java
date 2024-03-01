package com.vti;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.vti.entity.Salary;
import com.vti.entity.Salary.SalaryName;
import com.vti.repository.SalaryRepository;

public class SalaryTest {
	
	public static void main(String[] args) {
		SalaryRepository repository = new SalaryRepository();

		System.out.println("***********GET ALL Salary***********");

		List<Salary> salarys = repository.getAllSalarys();

		for (Salary salary : salarys) {
			System.out.println(salary);
		}

		System.out.println("\n\n***********GET Salary BY ID***********");

		Salary salaryById = repository.getSalaryByID((short) 2);
		System.out.println(salaryById);

		System.out.println("\n\n***********GET Salary BY NAME***********");

		Salary salaryByName = repository.getSalaryByName(SalaryName.SCRUMMASTER);
		System.out.println(salaryByName);

//		System.out.println("\n\n***********CREATE Salary***********");
//
//		Salary salaryCreate = new Salary();
//		SalaryCreate.setName(SalaryName.PM);
//		repository.createSalary(salaryCreate);
//		for (Salary salary : salarys) {
//			System.out.println(salary);
//		}
//
//		System.out.println("\n\n***********UPDATE Salary 1***********");
//
//		repository.updateSalary((short) 3, "DEV");
//
//		System.out.println("\n\n***********UPDATE Salary 2***********");
//
//		Salary salaryUpdate = new Salary();
//		SalaryUpdate.setId((short) 2);
//		SalaryUpdate.setName("PM");
//		repository.updateSalary(salaryUpdate);
//
//		System.out.println("\n\n***********DELETE SalaryS***********");
//		repository.deleteSalary((short) 2);
//
//		System.out.println("***********CHECK Salary EXISTS BY ID***********");
//		System.out.println(repository.isSalaryExistsByID((short) 1));
//
//		System.out.println("***********CHECK Salary EXISTS BY NAME***********");
//		System.out.println(repository.isSalaryExistsByName("PM"));
	}
}
