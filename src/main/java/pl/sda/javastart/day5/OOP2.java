package pl.sda.javastart.day5;

public class OOP2 {
    public static void main(String[] args) {
        equalsExample();
        referenceExample();
        staticFinal();
        TestPerson testPerson1 = new TestPerson("Kowalski","Janusz");
        System.out.println(testPerson1.getIdentity());
    }

    private static void staticFinal() {
        TestPerson testPerson1 = new TestPerson();
        TestPerson testPerson2 = new TestPerson();
        System.out.println(testPerson1.getIdentity());
        System.out.println(testPerson2.getIdentity());
        System.out.println("ludzi na świecie jest: " + (TestPerson.counter - 1));

        CalculatorUtils utils = new CalculatorUtils();
        System.out.println(utils.add(3,7));
        System.out.println(CalculatorUtils.adding(4,5));
        testPerson1.setFirstName("Ola");
        ExperimentalObject eo = new ExperimentalObject(1,2, testPerson1);
        eo.setNotFinalImmutable(6);
        TestPerson testPersonFromEo = eo.getFinalMutable();
        System.out.println(eo.getFinalMutable().getFirstName());
        eo.getFinalMutable().setFirstName("AAA");
        System.out.println(eo.getFinalMutable().getFirstName());
        testPersonFromEo.setFirstName("Anna");
        System.out.println(eo.getFinalMutable().getFirstName());
    }


    private static void referenceExample() {
        String s1 = "napis";
        String s2 = "napis";
        String s3 = new String("napis");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        Long firstNumber = 127L;
        Long secondNumber = 127L;
        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber.equals(secondNumber));
        Long thirdNumber = 128L;
        Long fourthNumber = 128L;
        System.out.println(fourthNumber == thirdNumber);
        System.out.println(fourthNumber.equals(thirdNumber));
    }

    private static void equalsExample() {
        TestPerson testPerson1 = new TestPerson();
        TestPerson testPerson2 = new TestPerson();
        testPerson1.setFirstName("Anna");
        testPerson2.setFirstName("Anna");
        testPerson1.setIdentity(123);
        testPerson2.setIdentity(123);
        testPerson1.setSurname("Nowak");
        testPerson2.setSurname("N");
        System.out.println(testPerson1 == testPerson2);
        System.out.println(testPerson1.equals(testPerson2));
        System.out.println(testPerson1.hashCode() == testPerson2.hashCode());

        TestPerson testPerson3 = new TestPerson("Anna", "Nowak", 123);
        System.out.println(testPerson1.equals(testPerson3));
        testPerson3.setIdentity(111);
        System.out.println(testPerson1.equals(testPerson3));

        String a = "A"; //immutable
        String b = a + "!";

        Long aLong = new Long(123L);

    }
}




