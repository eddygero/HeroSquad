package model;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;

public class Hero {

    private final String name;
    private final Integer age;
    private final String specialPower;
    private final String weakness;
    private final String yourSquad;

    private static final ArrayList<Hero> instances = new ArrayList<>();

    public Hero(String name, Integer age, String specialPower, String weakness, String yourSquad){
        this.name = name;
        this.specialPower = specialPower;
        this.weakness = weakness;
        this.age = age;
        this.yourSquad = yourSquad;

        boolean check = false;
        for (Hero instance : instances) {
            if (instance.getName().equals(name)) {
                showMessageDialog(null, "The Hero exists in one of the Squads");
                check = true;
            }
        }
        if (!check){
            instances.add(this);
        }
    }

    public String getYourSquad() {
        return yourSquad;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public String getWeakness() {
        return weakness;
    }

    public static ArrayList<Hero> getAll() {
        return instances;
    }
}