package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa(null, "Erick Rocha", "Ericksaggi31@gmail.com");
        Pessoa p2 = new Pessoa(null, "Erick Saggiorato", "Ericksaggi@gmail.com");
        Pessoa p3 = new Pessoa(null, "Erick", "ErickRsaggi@gmail.com");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager(); //fazendo isso automaticamente vamos ter a conexão com o banco de dados

        em.getTransaction().begin();
        em.persist(p1); //persist -> pega um objeto e salvo no bd
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit(); //confirma as alterações
        System.out.println("Pronto");
        
    }
}
