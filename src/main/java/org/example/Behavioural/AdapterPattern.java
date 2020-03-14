package org.example.Behavioural;

abstract class ToyDuck
{
    abstract void squeakSound();
}

class PlasticToyDuck extends ToyDuck
{
    public void squeakSound()
    {
        System.out.println("Quack Quack");
    }
}

class BirdAdapter extends ToyDuck
{
    Bird bird;
    public BirdAdapter(Bird bird)
    {
        this.bird = bird;
    }

    public void squeakSound()
    {
        bird.speak();
    }
}
interface Bird
{
    public void fly();
    public void speak();
}

class Eagle implements Bird
{
    public void fly()
    {
        System.out.print("Flying So High\n");
    }
    public void speak()
    {
        System.out.println("EEEhhhh EEEhhhh");
    }
    public void flyAndSpeak()
    {
        System.out.println("...Happening together : ");
        fly();
        speak();
    }
}



public class AdapterPattern
{
    public AdapterPattern()
    {
        Eagle myEagle = new Eagle();
        ToyDuck myToyDuck = new PlasticToyDuck();
        ToyDuck birdAdapter = new BirdAdapter(myEagle);
        System.out.println(">>My Toy Duck...");
        myToyDuck.squeakSound();
        System.out.println(">> Eagle..");
        myEagle.fly();
        myEagle.speak();
        myEagle.flyAndSpeak();
        System.out.println("BirdAdapter...");
        birdAdapter.squeakSound();
    }

}
