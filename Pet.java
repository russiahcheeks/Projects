public class Pet {

    // Private data fields
    private String name;
    private String type;
    private int age;

    // Default constructor
    public Pet() {
        this.name = "Pet Name";
        this.type = "Animal";
        this.age = 1;
    }

    // Custom constructor with 3 parameters
    public Pet(String name, String type, int age) {
        this.setName(name);
        this.setType(type);
        this.setAge(age);
    }

    // Set methods (mutators)
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Get methods (accessors)
    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int getAge() {
        return this.age;
    }

    // Custom speak() method
    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        }
        else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        }
        else {
            return "Noise";
        }
    }

    // toString method
    public String toString() {
        String output = "";
        output += "Pet information:\n";
        output += "Type: " + this.type + "\n";
        output += "Name: " + this.name + "\n";
        output += "Sound: " + this.speak() + "\n";
        output += "Age: " + this.age + "\n";
        return output;
    }
}
