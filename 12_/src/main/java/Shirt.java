import java.io.IOException;

public class Shirt {

    public class BadSyntaxException extends IOException{
        BadSyntaxException(String msg){
            super(msg);
        }
    }

    String number;
    String model;
    String color;
    String value;

    Shirt(String a) throws BadSyntaxException {
        String[] sep = a.split(",");
        if(sep.length != 4) throw new BadSyntaxException("bad string");
        number = sep[0];
        model = sep[1];
        color = sep[2];
        value = sep[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                " number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", value='" + value + '\'' +
                " }";
    }
}
