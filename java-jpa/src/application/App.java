package application;

import dominio.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa(1, "Erick Rocha", "Ericksaggi31@gmail.com");
        Pessoa p2 = new Pessoa(2, "Erick Saggiorato", "Ericksaggi@gmail.com");
        Pessoa p3 = new Pessoa(3, "Erick", "ErickRsaggi@gmail.com");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
