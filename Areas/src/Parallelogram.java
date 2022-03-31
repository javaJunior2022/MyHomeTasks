public abstract class Parallelogram implements Figure {

    private final double a;
    private final double b;

    public Parallelogram(){
        this.a=1;
        this.b=1;

    }


    public Parallelogram (double a){
        this.a=a;
        this.b=a;
    }

    public double getArea(){
        return a*b;
    }

    public Parallelogram (double a, double b){
        this.a=a;
        this.b=b;

    }
}