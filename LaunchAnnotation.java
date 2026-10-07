class Animal{
    public void animalUsuallyHuntsAndEats()
    {
        System.out.println("Animal is eating....");
    }
}

class Tiger extends Animal{
    @Override 
    public void animalUsuallyHuntsAndEats()
    {
        System.out.println("Tiger is hunting and eating");
    }
}

public class LaunchAnnotation {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        tiger.animalUsuallyHuntsAndEats();
    }
}
