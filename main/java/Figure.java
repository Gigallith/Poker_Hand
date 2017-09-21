/**
 * Created by user on 20/09/2017.
 */
public enum Figure {
    PAIRE("Paire"),
    DOUBLE_PAIRE("double paire"),
    BRELAN("brelan"),
    SUITE("suite"),
    COULEUR("couleur"),
    FULL("full"),
    CARRE("carré"),
    QF("quinte flush");

    private String name;

    Figure(String name) {
        this.name = name;
    }
}
