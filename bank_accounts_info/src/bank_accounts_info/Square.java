package bank_accounts_info;

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}
