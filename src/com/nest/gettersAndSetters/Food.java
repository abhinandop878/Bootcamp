package com.nest.gettersAndSetters;

public class Food {
        int tea;
        int coffeeMocachino;
        int espresso;
        int coldCoffee;
        int iceTea;

    public Food(int tea, int coffeeMocachino, int espresso, int coldCoffee, int iceTea) {
        this.tea = tea;
        this.coffeeMocachino = coffeeMocachino;
        this.espresso = espresso;
        this.coldCoffee = coldCoffee;
        this.iceTea = iceTea;
    }

    public int getTea() {
        return tea;
    }

    public int getCoffeeMocachino() {
        return coffeeMocachino;
    }

    public int getEspresso() {
        return espresso;
    }

    public int getColdCoffee() {
        return coldCoffee;
    }

    public int getIceTea() {
        return iceTea;
    }
}
