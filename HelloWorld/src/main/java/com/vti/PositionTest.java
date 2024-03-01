package com.vti;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.vti.entity.Position;
import com.vti.entity.Position.PositionName;
import com.vti.repository.PositionRepository;

public class PositionTest {
	
	public static void main(String[] args) {
		PositionRepository repository = new PositionRepository();

		System.out.println("***********GET ALL PosittionS***********");

		List<Position> posittions = repository.getAllPosittions();

		for (Position posittion : posittions) {
			System.out.println(posittion);
		}

		System.out.println("\n\n***********GET Posittion BY ID***********");

		Position posittionById = repository.getPositionByID((short) 2);
		System.out.println(posittionById);

		System.out.println("\n\n***********GET Posittion BY NAME***********");

		Position posittionByName = repository.getPositionByName(PositionName.SCRUMMASTER);
		System.out.println(posittionByName);

//		System.out.println("\n\n***********CREATE Posittion***********");
//
//		Position positionCreate = new Position();
//		positionCreate.setName(PositionName.PM);
//		repository.createPosition(positionCreate);
//		for (Position posittion : posittions) {
//			System.out.println(posittion);
//		}
//
//		System.out.println("\n\n***********UPDATE Posittion 1***********");
//
//		repository.updatePosittion((short) 3, "DEV");
//
//		System.out.println("\n\n***********UPDATE Posittion 2***********");
//
//		Posittion posittionUpdate = new Posittion();
//		posittionUpdate.setId((short) 2);
//		posittionUpdate.setName("PM");
//		repository.updatePosittion(posittionUpdate);
//
//		System.out.println("\n\n***********DELETE PosittionS***********");
//		repository.deletePosittion((short) 2);
//
//		System.out.println("***********CHECK Posittion EXISTS BY ID***********");
//		System.out.println(repository.isPosittionExistsByID((short) 1));
//
//		System.out.println("***********CHECK Posittion EXISTS BY NAME***********");
//		System.out.println(repository.isPosittionExistsByName("PM"));
	}
}
