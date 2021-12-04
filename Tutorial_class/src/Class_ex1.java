public class Class_ex1 {
    public static void main(String[] args) {
        Person Cindy = new Person();
        Cindy.name = "Cindy";
        Cindy.age = 18;
        Cindy.height = 168.3;
        Cindy.weight = 48.6;
        Cindy.ShoutMyName();
        System.out.println("I am " + Cindy.getAge() + "years old");
        System.out.println("Wow my BMI is " + Cindy.calcBMI());
        System.out.println("==================================");
        Person Henry = new Person();
        Cindy.name = "Henry";
        Cindy.age = 20;
        Cindy.height = 155.3;
        Cindy.weight = 80.6;
        Cindy.ShoutMyName();
        System.out.println("I am " + Henry.getAge() + "years old");
        System.out.println("Wow my BMI is " + Henry.calcBMI());
        System.out.println("==================================");

    }
}
