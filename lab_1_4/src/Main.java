import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double H, R;

        System.out.println("Set your cone...");

        System.out.print("H : ");
        H = scanner.nextDouble();

        System.out.print("R : ");
        R = scanner.nextDouble();

        Cone cone = new Cone(H, R);

        System.out.println("Square lateral surface: " + cone.SquareLateralSurface());
        System.out.println("Volume: " + cone.VolumeCone());
    }
}
