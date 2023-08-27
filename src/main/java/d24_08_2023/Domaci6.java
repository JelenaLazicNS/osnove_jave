package d24_08_2023;

import java.util.ArrayList;

public class Domaci6 {
    public static void main(String[] args) {
        //niz linkova
        //niz ocekivanih status kodova za linkove iz prvog niza (expected status codes)
        //niz status kodova koje vracaju linkovi iz prvog niza (actual status codes)
        //linkovi
        //https://cms.demo.katalon.com/cart/
        //https://cms.demo.katalon.com/shop/
        //https://cms.demo.katalon.com/account/
        //https://cms.demo.katalon.com/cart/
        //https://cms.demo.katalon.com/test/
        //expected status codes
        //200
        //200
        //404
        //204
        //200
        //actual status codes
        //200
        //200
        //400
        //200
        //404
        //Assertion Error: Link <link> expected status code <expected code> but got <actual code>

        ArrayList<String> links = new ArrayList<>();

        links.add("https://cms.demo.katalon.com/cart/");
        links.add("https://cms.demo.katalon.com/shop/");
        links.add("https://cms.demo.katalon.com/account/");
        links.add("https://cms.demo.katalon.com/cart/");
        links.add("https://cms.demo.katalon.com/test/");

        ArrayList<Integer> expectedCodes = new ArrayList<>();

        expectedCodes.add(200);
        expectedCodes.add(200);
        expectedCodes.add(404);
        expectedCodes.add(204);
        expectedCodes.add(200);

        ArrayList<Integer> actualCodes = new ArrayList<>();

        actualCodes.add(200);
        actualCodes.add(200);
        actualCodes.add(400);
        actualCodes.add(200);
        actualCodes.add(404);

        for (int i = 0; i<links.size(); i++) {
            int expectedStatus = expectedCodes.get(i);
            int actualStatus = actualCodes.get(i);

            if (expectedStatus != actualStatus) {
                System.out.println("Assertion Error: " + links.get(i)+" expected status code "+expectedStatus+" but got " +actualStatus);
            }
        }
    }
}
