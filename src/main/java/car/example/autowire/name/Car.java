package car.example.autowire.name;

public class Car {
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Car Specification" + specification.toString());
    }
}
