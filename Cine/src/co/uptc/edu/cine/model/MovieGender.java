package co.uptc.edu.cine.model;

public enum MovieGender {
    ACTION("Accion"), ADVENTURE("Aventura"), ANIMATION("Animacion"), BIOGRAPHY("Biografica"),
    CATASTROPHE("Catastrofe"), COMEDY("Comedia"), CRIME("Crimen"), DOCUMENTARY("Documental"),
    DRAMA("Drama"), FAMILY("Familiar"), FANTASY("Fantasia"), FILM_NOIR("Cine negro"),
    HISTORY("Historica"), HORROR("Horror"), MUSIC("Musica"), MUSICAL("Musical"), MISTERY("Misterio"),
    ROMANCE("Romance"), SCIFI("Ciencia ficcion"), SHORT_FILM("Cortos"), SPORT("Deportes"),
    SUPERHERO("Superheroes"), THRILLER("Suspenso"), WAR("Guerra"), WESTERN("Oeste");

    private String name;

    private MovieGender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
