package com.intellekta.ARM;

import java.io.*;
import java.util.LinkedList;


public class ImportClients {

    public static LinkedList<Clients> cardsToClients(LinkedList<Clients> clients) throws IOException, ClassNotFoundException {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Clients.out"))) {
            Clients client = (Clients) objectInputStream.readObject();
            clients.add(client);
        }catch (FileNotFoundException fileNotFoundException) {
            return new LinkedList<>();
        }
        return clients;
    }

    public static void checkImport(LinkedList<Clients> clients) {
        for (Clients clients1: clients) {
            System.out.println(clients1);
        }
    }
}
