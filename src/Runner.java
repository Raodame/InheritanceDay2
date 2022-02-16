public class Runner {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("John", "Masters");
//        System.out.println(teacher.getDegreeLevel());
//        System.out.println(teacher.getName());


        System.out.println(teacher.getName());
        System.out.println(teacher.getDegreeLevel());

        teacher.setName("Asher");

        System.out.println(teacher.getName());
    }
}