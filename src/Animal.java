public class Animal {
    String name;
    String color;
    String noise;
    Animal(String name, String color){
        this.name = name;
        this.color = color;
        this.noise = "squeak";
    }
    public String toString(){
        return this.name + "-" + this.color;
    }

    public void speak(){
        System.out.println(this.noise);
    }
}
