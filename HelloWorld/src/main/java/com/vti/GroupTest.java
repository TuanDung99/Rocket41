package com.vti;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.vti.entity.Group;
import com.vti.repository.GroupRepository;

public class GroupTest {
	
	public static void main(String[] args) {
		GroupRepository repository = new GroupRepository();

		System.out.println("***********GET ALL GroupS***********");

		List<Group> groups = repository.getAllGroups();

		for (Group group : groups) {
			System.out.println(group);
		}

		System.out.println("\n\n***********GET Group BY ID***********");

		Group groupById = repository.getGroupByID((short) 2);
		System.out.println(groupById);

//		System.out.println("\n\n***********GET Group BY NAME***********");
//
//		Group groupByName = repository.getGroupByName("Marketing");
//		System.out.println(groupByName);

//		System.out.println("\n\n***********CREATE Group***********");
//
//		Group groupCreate = new Group();
//		groupCreate.setName("waiting12346");
//		repository.createGroup(groupCreate);
//
//		System.out.println("\n\n***********UPDATE Group 1***********");
//
//		repository.updateGroup((short) 3, "Security");
//
//		System.out.println("\n\n***********UPDATE Group 2***********");
//
//		Group groupUpdate = new Group();
//		groupUpdate.setId((short) 2);
//		groupUpdate.setName("Security2");
//		repository.updateGroup(groupUpdate);
//
//		System.out.println("\n\n***********DELETE GroupS***********");
//		repository.deleteGroup((short) 2);
//
//		System.out.println("***********CHECK Group EXISTS BY ID***********");
//		System.out.println(repository.isGroupExistsByID((short) 1));
//
//		System.out.println("***********CHECK Group EXISTS BY NAME***********");
//		System.out.println(repository.isGroupExistsByName("Security"));
	}
}
