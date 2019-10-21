public class Cone {

    private double H;
    private double R;
    private double L;

    public Cone(double H, double R) {
        this.H = H;
        this.R = R;
        L = Math.sqrt(H * H + R * R);
    }

    public double SquareLateralSurface() {
        return Math.PI * R * L;
    }

    public double VolumeCone() {
        return 1.0/3 * Math.PI * Math.pow(R, 2) * H;
    }
}
