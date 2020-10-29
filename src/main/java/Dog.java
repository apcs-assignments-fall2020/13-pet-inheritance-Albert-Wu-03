public class Dog extends Pet {
    // Instance variable(s)
    private String breed;

    // Constructors
    public Dog(String name, int age, String c){
        super(name, age);
        this.breed = c;
    }

    public Dog(){
        super("Max", 1);
        this.breed = "Dog";

    }

    // makeNoise() method
    public void makeNoise() {
        System.out.println("Wang"); //I don't know how to type a dog's noise.
    }

    // toString method
    public String toString() {
        String str = "Name: " + this.getName() + ", Age: " + this.getAge() + ", Breed: " + this.breed;
        return str;
    }

    // Getter
    public String getBreed(){
        return this.breed;
    }

    // Setter
    public void setBreed(String breed){
         if(breed.trim().length() != 0){
            this.breed = breed;
         }
    }
}