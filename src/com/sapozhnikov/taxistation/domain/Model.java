package com.sapozhnikov.taxistation.domain;

public enum Model {
    BRAVO("Bravo"),
    FIESTA("Fiesta"),
    GOLF("Golf"),
    GRANDVITARA("Grand Vitara"),
    GUILIA("Guilta"),
    KALINA("Kalina"),
    LOGAN("Logan"),
    MASSIF("Massif"),
    MDX("Mdx"),
    P308("308"),
    PANAMERA("Panamera"),
    Q5("Q5"),
    RX3("Rx3"),
    TRANSPORTER("Transporter"),
    X5("X5"),
    T1("T1");
    private final String name;

    Model(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
