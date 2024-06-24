import java.util.ArrayList;

class Bee {
    private String name;

    public Bee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class BeeHive {
    private ArrayList<Bee> beeList;

    public BeeHive(int numBees) {
        this.beeList = new ArrayList<Bee>();
        for (int i = 0; i < numBees; i++) {
            this.beeList.add(new Bee("bee" + i));
        }
    }

    public ArrayList<Bee> getBeeList() {
        return this.beeList;
    }

    public void renameBees(ArrayList<String> newNames) {
        int numNamesToAssign = this.beeList.size();
        if (newNames.size() < this.beeList.size()) {
            numNamesToAssign = newNames.size();
        }

        for (int i = 0; i < numNamesToAssign; i++) {
            this.beeList.get(i).setName(newNames.get(i));
        }
    }

    public static void main(String[] args) {
        BeeHive myHive = new BeeHive(3);
        ArrayList<String> newNames = new ArrayList<String>();
        newNames.add("bob");
        newNames.add("macey");
        newNames.add("anna");

        myHive.renameBees(newNames);
        for (Bee b : myHive.getBeeList()) {
            System.out.println(b.getName());
        }
    }
}
