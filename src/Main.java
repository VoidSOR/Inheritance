public class Main {
    public static void main(String[] args) {

        British lori = new British(4, "German", "Lori");
        Scottish baxter = new Scottish(3, "Fix", "Baxter");

        lori.sayMeow();
        baxter.sayMeow();

        System.out.println("Cat name:  " + lori.getName() +  "age: " + lori.getAge() + "Owner:  " + lori.getOwner());
        System.out.println("Cat name: " + baxter.getName() + "AGe:  " + baxter.getAge() + "Owner:  " + baxter.getOwner());

        System.out.println(lori.toString());
        System.out.println(baxter.toString());

        British martin = new British(4, "Alex", "Martin");
        British anotherMartin = new British(4, "Alex", "Martin");


    }
}
