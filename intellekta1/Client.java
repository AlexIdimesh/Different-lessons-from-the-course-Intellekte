package com.intellekta1;

public class Client {

    private String lastName; // имя
    private String firstName; // фамилия
    private String secondName; // отвество

    private int amountOfBoughtDrawings; // общее число купленных картин

    private int fortune;   // финансовое состояние

    public Client(String lastName, String firstName, String secondName, int amountOfBoughtDrawings, int fortune) {
        this.lastName = (lastName == null) ? "default" : lastName;
        this.firstName = (firstName == null) ? "client" : firstName;
        this.secondName = (secondName == null) ? "absolute" : secondName;
        this.amountOfBoughtDrawings = (amountOfBoughtDrawings < 0) ? 0 : amountOfBoughtDrawings;
        this.fortune = (fortune < 0) ? 0 : fortune;
    }

    public String preferredStyleOfDrawings() {
        return "No preferred style";
    }

    @Override
    public String toString() {
        String str = preferredStyleOfDrawings();
        return "Name:" + " " + lastName + " " + firstName + " " + secondName + '\'' +
                "Amount of bought drawings:" + " " + amountOfBoughtDrawings + '\'' +
                "Fortune: " + " " + fortune + '\'' +
                "Style:" + str;
    }

}
