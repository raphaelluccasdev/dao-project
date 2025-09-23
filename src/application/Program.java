package application;

import model.entities.Departament;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Departament obj = new Departament(1, "Books");

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);

        System.out.println(seller);

    }
}
