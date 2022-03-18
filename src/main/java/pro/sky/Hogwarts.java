package pro.sky;

import pro.sky.student.GriffindorStudent;
import pro.sky.student.HogwartsStudent;
import pro.sky.student.HufflepuffStudent;
import pro.sky.student.RavenclawStudent;
import pro.sky.student.SlytherinStudent;

import java.util.function.Function;

public class Hogwarts {
    public void compareAnyStudents(HogwartsStudent first, HogwartsStudent second) {
        if (first.getMagicPower() > second.getMagicPower()) {
            System.out.println(first.getName() + " is stronger than " + second.getName());
        } else if (first.getMagicPower() == second.getMagicPower()) {
            System.out.println(first.getName() + " is equal in power to " + second.getName());
        } else {
            System.out.println(second.getName() + " is stronger than " + first.getName());
        }
        if (first.getTransgressionDistance() > second.getTransgressionDistance()) {
            System.out.println(first.getName() + " goes further than  " + second.getName());
        } else if (first.getTransgressionDistance() == second.getTransgressionDistance()) {
            System.out.println(first.getName() + " goes as far as " + second.getName());
        } else {
            System.out.println(second.getName() + " goes further than  " + first.getName());
        }
    }

    public void compareSlytherinStudents(SlytherinStudent first, SlytherinStudent second) {
        int firstSum = first.getCunning() + first.getAmbition()
                + first.getDecisiveness() + first.getPowerLust() + first.getResourcefulness();
        int secondSum = second.getCunning() + second.getAmbition()
                + second.getDecisiveness() + second.getPowerLust() + second.getResourcefulness();

        if (firstSum > secondSum) {
            System.out.println(first.getName() + " is better Slytherin than " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " is better Slytherin than " + first.getName());
        } else {
            System.out.println(first.getName() + " and " + second.getName() + " are equals as Slytherins");
        }
    }

    public void compareGriffindorStudents(GriffindorStudent first, GriffindorStudent second) {
        int firstSum = first.getBravery() + first.getHonor()
                + first.getNobility();
        int secondSum = second.getBravery() + second.getHonor()
                + second.getNobility();

        if (firstSum > secondSum) {
            System.out.println(first.getName() + " is a better Griffindor than " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " is better Griffindor than " + first.getName());
        } else {
            System.out.println(first.getName() + " and " + second.getName() + " are equals as Griffindors");
        }
    }

    public void compareHufflepuffStudents(HufflepuffStudent first, HufflepuffStudent second) {
        int firstSum = first.getHardwork()
                + first.getIntegrity() + first.getLoyalty();
        int secondSum = second.getHardwork()
                + second.getIntegrity() + second.getLoyalty();

        if (firstSum > secondSum) {
            System.out.println(first.getName() + " is a better Hufflepuff than " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " is better Hufflepuff than " + first.getName());
        } else {
            System.out.println(first.getName() + " and " + second.getName() + " are equals as Hufflepuff");
        }
    }

    public void compareRavenclawStudents(RavenclawStudent first, RavenclawStudent second) {
        int firstSum = first.getCreativity() + first.getIntelligence()
                + first.getSmartness() + first.getWisdom();

        int secondSum = second.getCreativity() + second.getIntelligence()
                + second.getSmartness() + second.getWisdom();

        if (firstSum > secondSum) {
            System.out.println(first.getName() + " is a better Ravenclaw than " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " is better Ravenclaw than " + first.getName());
        } else {
            System.out.println(first.getName() + " and " + second.getName() + " are equals as Ravenclaws");
        }
    }
}
