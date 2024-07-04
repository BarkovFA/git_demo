package task3;

public class ComplexNumber {
    private double real;
    private double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.imaginary = imaginary;
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber com) {
        return new ComplexNumber(this.real + com.real, this.imaginary + com.imaginary);
    }

    public ComplexNumber other(ComplexNumber com) {
        double newReal = this.real * com.real - this.imaginary * com.imaginary;
        double newImag = this.real * com.real + this.imaginary * com.imaginary;
        return new ComplexNumber(newReal, newImag);
    }


}
