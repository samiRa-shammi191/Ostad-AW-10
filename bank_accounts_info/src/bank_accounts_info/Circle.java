package bank_accounts_info;

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
