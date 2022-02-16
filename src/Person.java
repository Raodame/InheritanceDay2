public class Person {

    private String name;

    public Person(){
        name = "Harry";
    }

    public Person(String name){
        this.name = name;
        System.out.println("In Person constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
