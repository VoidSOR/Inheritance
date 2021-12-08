public class Scottish extends Cat {

    private String name;

    public Scottish(int age,String owner,String name){
        super(age,owner);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "Cat name:  " + name + "Cat Age:  " + getAge() + "Cat Owner:  " + getOwner();
    }
}
