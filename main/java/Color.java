/**
 * Created by user on 18/09/2017.
 */
public enum Color {
    TREFLE("Tr"),
    COEUR("Co"),
    CARREAU("Ca"),
    PIQUE("Pi");

    private final String name;

    public static Color find(String str) {
        Color[] colors = Color.values();
        Color Color;
        for (Color i : colors) {
            if (i.getName().equals(str))
                return i;
        }
        return null;

    }

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
