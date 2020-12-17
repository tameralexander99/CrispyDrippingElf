package com.example.afkcompanion;

public class ChampionDatabase {

    private int id;
    private String Name;
    private String Faction;

    //constructor
    public ChampionDatabase(int id, String name, String faction) {
        this.id = id;
        Name = name;
        Faction = faction;
    }

    //non parameter constructor just in case
    public ChampionDatabase() {
    }

    //toString to print
    @Override
    public String toString() {
        return "ChampionDatabase{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Faction='" + Faction + '\'' +
                '}';
    }

    //getter and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFaction() {
        return Faction;
    }

    public void setFaction(String faction) {
        Faction = faction;
    }
}
