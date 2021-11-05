public class Series {

    private double a[];

    Series(double a[]){
        this.a = a;
    }

    double[] getGarmonicSeries(){

        for(int i = 0; i < a.length; i++){
            a[i] = 1/a[i];
        }
        return a;

    }

}
