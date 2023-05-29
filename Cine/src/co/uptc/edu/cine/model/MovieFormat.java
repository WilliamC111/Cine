package co.uptc.edu.cine.model;

public enum MovieFormat {
    THREE_D("3D"), FOUR_K("4K"), TWO_D("2D"), IMAX("IMAX"), ULTRA_TWO_D("Ultra 2D");

    private String name;

    private MovieFormat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
