package com.example.cadastrocliente;

import com.example.cadastrocliente.model.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplo {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Clientes-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNome("Armazém Paraíba");

        entityManager.persist(cliente);

        entityManager.find(Cliente.class, 1);
        System.out.println(cliente.getNome());

        entityManager.close();
        entityManagerFactory.close();
    }
}
