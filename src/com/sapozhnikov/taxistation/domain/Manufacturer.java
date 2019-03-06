package com.sapozhnikov.taxistation.domain;

public enum Manufacturer {
    ACURA("Acura"),
    ALFA_ROMEO("Alfa Romeo"),
    AUDI("Audi"),
    BMW("BMW"),
    FIAT("Fiat"),
    FORD("Ford"),
    IVECO("Iveco"),
    LADA("Lada"),
    MAZDA("Mazda"),
    PEUGEOT("Peugeot"),
    PORSCHE("Porsche"),
    RENAULT("Renault"),
    SUZUKI("Suzuki"),
    MERCEDES("Mercedes"),
    VOLKSWAGEN("VolksWagen");

    private final String name;

    Manufacturer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
