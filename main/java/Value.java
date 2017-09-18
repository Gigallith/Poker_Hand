/**
 * Created by user on 18/09/2017.
 */
public enum Value {
    DEUX("2"),
    TROIS("3"),
    QUATRE("4"),
    CINQ("5"),
    SIX("6"),
    SEPT("7"),
    HUIT("8"),
    NEUF("9"),
    DIX("10"),
    VALET("V"),
    DAME("D"),
    ROI("R"),
    AS("A");


    final String name;

    Value(String name) {
        this.name = name;
    }

    public static Value find(String str) {
        Value[] values = Value.values();
        Value value;
        for (Value i : values) {
            if (i.getName().equals(str))
                return i;
        }
        return null;

    }


    public String getName() {
        return name;
    }
}
