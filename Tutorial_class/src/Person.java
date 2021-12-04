public class Person {
    double weight;
    double height;
    int age;
    String name;

    int getAge() {
        return this.age; //this 指向此類別本身
    }
    String getMyName() {
        return this.name; //this 指向此類別本身
    }

    void ShoutMyName() {
        System.out.println("MY NAME IS " + getMyName().toUpperCase() + "!!!!!!!!!!!"); //於類別內呼叫getMyName函數
    }

    double calcBMI() {
        double prefixHeight = this.height/100;
        return this.weight / Math.pow(prefixHeight,2);  //about Math.pow() https://www.educative.io/edpresso/how-to-use-the-mathpow-method-in-java
    }
}
