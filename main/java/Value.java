/**
 * Created by user on 18/09/2017.
 */
public enum Value {
    DEUX("2","Deux"),
    TROIS("3","Trois"),
    QUATRE("4","Quatre"),
    CINQ("5","Cinq"),
    SIX("6","Six"),
    SEPT("7","Sept"),
    HUIT("8","Huit"),
    NEUF("9","Neuf"),
    DIX("10","Dix"),
    VALET("V","Valet"),
    DAME("D","Dame"),
    ROI("R","Roi"),
    AS("A","As");


    private final String strName;
    private final String name;

    Value(String strName, String name) {
        this.strName = strName;
        this.name = name;
    }

    public static Value find(String str) {
        Value[] values = Value.values();
        Value value;
        for (Value i : values) {
            if (i.getStrName().equals(str))
                return i;
        }
        return null;

    }


    public String getStrName() {
        return strName;
    }

    public String getName() {
        return name;
    }
}
