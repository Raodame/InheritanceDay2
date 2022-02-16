public class Teacher extends Person{

    private String degreeLevel;

    public Teacher(){
        degreeLevel = "Bachelors";
        System.out.println("In Teacher constructor");
    }

    public Teacher(String name, String degreeLevel){
        super(name);
        this.degreeLevel = degreeLevel;
    }

    public String getDegreeLevel() {
        return degreeLevel;
    }

    public void setDegreeLevel(String degreeLevel) {
        this.degreeLevel = degreeLevel;
    }

    public void setName(String name, String degreeLevel){
        super.setName(name);
        this.degreeLevel = degreeLevel;
    }
}
