package assignment01.Assignment4.IntNumber;

public class IntNumber {
    private int x1;
    private float x2 ;
    private Double x3;
    private long x4;

    public IntNumber(int x1,float x2,Double x3,long x4) {
        super();
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
    }

    @Override
    public String toString() {
        return x1+" "+x2+" "+x3+" "+x4 ;
    }
}

