class Triangle extends Shape {
    private double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public void displayShapeInfo() {
        System.out.println("Shape: Triangle");
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area: " + String.format("%.2f", calculateArea()));
    }
}