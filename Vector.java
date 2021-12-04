package Vector;

public class Vector {
    double[] vectorArray;
    public Vector(double[] array) {
        this.vectorArray = array;
    }
    public void increment(double value) {
        for (int i = 0; i < this.vectorArray.length; i++) {
            this.vectorArray[i] += value;
        }
    }
    public void decrement(double value) {
        for (int i = 0; i < this.vectorArray.length; i++) {
            this.vectorArray[i] -= value;
        }
    }
    public double vectorLength() {
        double sum = 0;
        for (int i = 0; i < this.vectorArray.length; i++) {
            sum += this.vectorArray[i]*this.vectorArray[i];
        }
        return Math.sqrt(sum);
    }
    public double dotProduct(Vector vector) {
        if (this.vectorArray.length != vector.vectorArray.length) {
            System.out.println("wrong length!");
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.vectorArray.length; i++) {
            sum += this.vectorArray[i]*vector.vectorArray[i];
        }
        return sum;
    }
    public double getAngle(Vector vector) {
        double cos = this.dotProduct(vector)/(this.vectorLength() * vector.vectorLength());
        return Math.acos(cos);
    }
}
