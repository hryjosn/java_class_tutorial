public class Person {
    double weight;
    double height;
    int age;
    String name;

    int getAge() {
        return this.age;
    }

    void ShoutMyName() {
        System.out.println("MY NAME IS " + this.name.toUpperCase() + "!!!!!!!!!!!");
    }

    double calcBMI() {
        double prefixHeight = this.height/100;
        return this.weight / Math.pow(prefixHeight,2);  //about Math.pow() https://www.educative.io/edpresso/how-to-use-the-mathpow-method-in-java
    }
}
