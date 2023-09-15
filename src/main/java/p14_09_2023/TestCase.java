package p14_09_2023;

import java.util.ArrayList;

public class TestCase {
    private String id;
    private String naziv;

    private final ArrayList<TestStep> testSteps;

    public TestCase(String id, String naziv) {
        this.id = id;
        this.naziv = naziv;
        this.testSteps = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void addTestStep(TestStep newTestSteps) {
        this.testSteps.add(newTestSteps);
    }

    public int brojacFailed() {
        int counter = 0;
        for (int i = 0; i < this.testSteps.size(); i++) {
            if (!this.testSteps.get(i).validate()) {
                counter++;
            }
        }
        return counter;
    }

    public String status() {
        if (brojacFailed() == 0) {
            return " TEST CASE PASSED";
        } else {
            return "TEST CASE FAILED";
        }
    }

    public boolean stanjeTC() {
        System.out.println("ID " + this.id + " - " + this.naziv);
        for (int i = 0; i < testSteps.size(); i++) {
            this.testSteps.get(i).stampaj();
        }
        System.out.println(this.testSteps.size() + " / " + brojacFailed());
        System.out.println(stanjeTC());
        return false;
    }
}

