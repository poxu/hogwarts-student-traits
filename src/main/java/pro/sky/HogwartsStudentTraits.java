package pro.sky;

import pro.sky.student.GriffindorStudent;

public class HogwartsStudentTraits {
    public static void main(String[] args) {
        Hogwarts hogwarts = new Hogwarts();
        GriffindorStudent potter = new GriffindorStudent(
                "Harry Potter",
                12,
                13,
                4,
                20,
                4
        );
        GriffindorStudent hermione = new GriffindorStudent(
                "Hermione Granger",
                12,
                16,
                4,
                19,
                5
        );
        GriffindorStudent ron = new GriffindorStudent(
                "Ron Weasly",
                12,
                22,
                4,
                14,
                8
        );
        hogwarts.compareAnyStudents(hermione, potter);
        hogwarts.compareGriffindorStudents(hermione, potter);
        System.out.println(hermione);
    }
}
