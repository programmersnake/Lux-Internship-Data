package jva_046.day_3.overriding_practic;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Person abstractPerson = new Person();
        abstractPerson.setName( "P" );

        System.out.println();

        Pupil pupil = new Pupil();
        pupil.setName( "Denis" );
        pupil.setNumberOfClass( 5 );

        Student student = new Student();
        student.setName( "Denis Kostin" );
        student.setNumberOfCourse( 3 );

        System.out.println();

        Programmer programmer = new Programmer();
        programmer.setName( "Denis Kostin Alexandrovitch" );
        programmer.setYearsOfExperience( 1 );

        Cooker cooker = new Cooker();
        cooker.setName( "Cooker name" );
        cooker.setYearsOfExperience( 3 );

        Unemployed unemployed = new Unemployed();
        unemployed.setName( "Unemployed name" );
        String[] skills = {"cook", "study", " count", "read", "write texts" };
        unemployed.setSkills( skills );

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add( abstractPerson );
        personArrayList.add( pupil );
        personArrayList.add( student );
        personArrayList.add( programmer );
        personArrayList.add( cooker );
        personArrayList.add( unemployed );

        System.out.println();

        for (Person person : personArrayList) {
            person.can();
        }

    }

}
