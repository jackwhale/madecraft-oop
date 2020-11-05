package exercises;

public class Ocean {

//     Create a class called Ocean.
    public Ocean() {

    }

    public static void main(String[] args) {
        //     There make make a SeaCreature called “Spongebob”.
        SeaCreature spongebob = new SeaCreature("Spongebob");
        //     Use the methods in the class to make him eat, and laugh.
        spongebob.eat();
        spongebob.laugh();

        //     Make Patrick and Squidward and print their name, and make them laugh.

        SeaCreature patrick = new SeaCreature("Patrick");
        SeaCreature squidward = new SeaCreature("Squidward");

        System.out.println(patrick.getName());
        patrick.laugh();

        System.out.println(squidward.getName());
        squidward.laugh();
    }
}
