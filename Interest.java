import java.lang.Math;

class Interest {
    public double calculateInterest(double d, int t) { 
        if (d < 2000 && t >= 2) {
            double rate = 0.05; 
            double ci = d * Math.pow((1 + rate), t);
            return ci;
        } else if (d >= 2000 && d < 6000 && t >= 2) {
            double rate = 0.07; 
            double ci = d * Math.pow((1 + rate), t);
            return ci;
        } else if (d >= 6000 && t >= 1) { 
            double rate = 0.08; 
            double ci = d * Math.pow((1 + rate), t);
            return ci;
        } else if (t >= 5) {
            double rate = 0.1;
            double ci = d * Math.pow((1 + rate), t);
            return ci;
        } else {
            double rate = 0.03; 
            double ci = d * Math.pow((1 + rate), t);
            return ci;
        }
    }
}
