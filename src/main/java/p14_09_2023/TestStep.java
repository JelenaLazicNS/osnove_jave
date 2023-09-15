package p14_09_2023;

public class TestStep {
    private String opis;
    private String actualValue;
    private String expectedValue;
    private String errorMessage;

    public TestStep(String opis, String actualValue, String expectedValue, String errorMessage) {
        this.opis = opis;
        this.actualValue = actualValue;
        this.expectedValue = expectedValue;
        this.errorMessage = errorMessage;
    }

    public String getOpis() {
        return opis;
    }

    public String getActualValue() {
        return actualValue;
    }

    public String getExpectedValue() {
        return expectedValue;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
    public boolean validate () {
        if (this.expectedValue.equals(this.actualValue)) {
            return true;
        } return false;
    }
    public void stampaj () {
        System.out.println("| "+this.opis+" |");
        if (validate()) {
            System.out.println("| Status (PASSED) |");
        } else  {
        System.out.println("| Status (FAILED) | "+this.errorMessage);

    }
}
}
