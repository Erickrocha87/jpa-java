package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager(); // fazendo isso automaticamente vamos ter a conexão com o banco de // dados
        Pessoa p = em.find(Pessoa.class, 1);

        System.out.println(p);
        System.out.println("Pronto!");
        em.close();
        emf.close();
    }
}
