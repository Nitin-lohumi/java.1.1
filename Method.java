 class Method {
    // Method to calculate the area of a circle
     void area(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + area + " sq units");
    }

    // Method to calculate the area of a rectangle
     void area(int length, int width) {
        double area = length * width;
        System.out.println("The area of the rectangle is " + area + " sq units");
    }

    // Method to calculate the area of a triangle
     void area(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is " + area + " sq units");
    }

    public static void main(String[] args) {
        Method calculator = new Method();
        calculator.area(5);

        calculator.area(10, 20);

        calculator.area(10.10, 5);
    }
}
