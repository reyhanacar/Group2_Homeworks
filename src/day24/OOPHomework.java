package day24;

public class OOPHomework {
    public static void main(String[] args) {


        Students student1 = new Students("Ayşe", "Yılmaz", 34, new int[]{35, 78, 43});
        Students student2 = new Students("Ali", "Aslan", 28, new int[]{25, 90, 45});

        student1.showinfo();
        System.out.println();
        student2.showinfo();

        System.out.println();
        System.out.println(student1.getGPA());
        System.out.println(student2.getGPA());


        if (student1.getGPA() > student2.getGPA()){
            System.out.printf("%s %s isimli öğrencinin ortalaması büyüktür.", student1.firstname, student2.Lastname);
        }else{
            System.out.printf("%s %s isimli öğrencinin ortalaması büyüktür.", student1.firstname, student2.Lastname);
        }

    }
}