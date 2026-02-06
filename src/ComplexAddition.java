import java.util.Scanner;

class Complex {
    int real1;
    int real2;
    int complex1;
    int complex2;
    Complex(int a, int b, int c, int d){
            real1=a;
            real2=b;
            complex1=c;
            complex2=d;
    }
    public void AddnDisplay(){
            int realres= real1+real2;
            int complexres=complex1+complex2;
            System.out.println(realres+" + "+ complexres+"i");
    }

    // TODO: parameterized constructor Complex(int real, int imag)

    // TODO: Method to add two complex numbers: add(Complex other) returning new Complex
    // Or static method add(Complex c1, Complex c2)
}

public class ComplexAddition {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int rl1=sc.nextInt();
            int cp1=sc.nextInt();
            int rl2=sc.nextInt();
            int cp2=sc.nextInt();
            Complex c1 = new Complex(rl1,rl2,cp1,cp2);
            c1.AddnDisplay();
    }

}
