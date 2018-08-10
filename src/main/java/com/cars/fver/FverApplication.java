package com.cars.fver;

import entities.Auto;
import entities.Instalator;
import entities.Klient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class FverApplication {

	public static void main(String[] args) {
		SpringApplication.run(FverApplication.class, args);

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("PresistanceUnit"); // czysty hibernate, potrzebny plik persistance.xml
	EntityManager em = emf.createEntityManager();// niebardzo ogarniam

	em.getTransaction().begin();
	Klient klient = new Klient();

	Instalator inst = new Instalator();

	//Jak dodawać obiekty z formularza??
	Auto auto = new Auto("Ford","focus", "mk2",2019,"KR 778 GA");
	klient.addauto(auto);
	auto.setKlient(klient);

	em.persist(klient);
	em.getTransaction().commit();
}}