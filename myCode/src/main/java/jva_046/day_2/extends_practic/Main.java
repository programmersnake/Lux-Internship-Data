package jva_046.day_2.extends_practic;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Person abstractPerson = new Person();
        abstractPerson.setName( "P" );

        System.out.println();

        Pupil pupil = new Pupil();
        pupil.setName( "Denis" );
        pupil.setNumberOfClass( 5 );

        pupil.study();

        System.out.println();

        Student student = new Student();
        student.setName( "Denis Kostin" );
        student.setNumberOfCourse( 3 );

        student.study();

        System.out.println();

        Programmer programmer = new Programmer();
        programmer.setName( "Denis Kostin Alexandrovitch" );
        programmer.setYearsOfExperience( 1 );

        programmer.programing();

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add( abstractPerson );
        personArrayList.add( pupil );
        personArrayList.add( student );
        personArrayList.add( programmer );

        System.out.println();

        for (Person person : personArrayList) {
            System.out.println(person.getName());
        }

    }

}
