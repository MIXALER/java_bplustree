package destiny.bplus.value;

public abstract class Value
{

    public static final byte UNKNOW = 100;
    public static final byte STRING = 1;
    public static final byte INT = 2;
    public static final byte LONG = 3;
    public static final byte BOOLEAN = 4;

    public abstract int getLength();

    public abstract byte getType();

    public abstract int compare(Value value);

}
