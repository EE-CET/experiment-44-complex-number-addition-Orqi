import java.util.Scanner;

class Complex {
    double real1;
    double real2;
    double complex1;
    double complex2;
    Complex(double a, double b, double c, double d){
            real1=a;
            real2=b;
            complex1=c;
            complex2=d;
    }
    public void AddnDisplay(){
            double realres= real1+real2;
            double complexres=complex1+complex2;
            System.out.println(realres+" + "+complexres+"i");
    }

    // TODO: parameterized constructor Complex(int real, int imag)

    // TODO: Method to add two complex numbers: add(Complex other) returning new Complex
    // Or static method add(Complex c1, Complex c2)
}

public class ComplexAddition {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            double rl1=sc.nextDouble();
            double cp1=sc.nextDouble();
            double rl2=sc.nextDouble();
            double cp2=sc.nextDouble();
            Complex c1 = new Complex(rl1,rl2,cp1,cp2);
            c1.AddnDisplay();
    }

}
