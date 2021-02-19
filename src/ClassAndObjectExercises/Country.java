package ClassAndObjectExercises;

class Country {
    void comingSoonMethod() {
        System.out.println("coming soon");
    }

    public static void main(String[] args) {
        Country rwanda = new Country();
        Country india = new Country();
        rwanda.comingSoonMethod();
    }
}

class Planet {
    void revolve() {
        System.out.println("revolve");
    }

    public static void main(String... args) {
        Planet earth = new Planet();
        Planet jupiter = new Planet();
        earth.revolve();
    }

}
