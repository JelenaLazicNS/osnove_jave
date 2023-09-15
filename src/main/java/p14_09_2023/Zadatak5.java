package p14_09_2023;

public class Zadatak5 {
    public static void main(String[] args) {
        TestStep step1 = new TestStep("Open app", "", "","error");
        TestStep step2 = new TestStep("Check if login link is visible", "visible", "visible", "error");
        TestStep step3 = new TestStep("Click on login link", "", "", "error");
        TestStep step4 = new TestStep("Check if login button is visible", "visible", "invisible", "Login button is not visible");

        TestCase testCase = new TestCase("ID", "Validate Login Form");

        testCase.addTestStep(step1);
        testCase.addTestStep(step2);
        testCase.addTestStep(step3);
        testCase.addTestStep(step4);

        testCase.stanjeTC();
    }
}
