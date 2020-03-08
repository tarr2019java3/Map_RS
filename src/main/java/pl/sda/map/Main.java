package pl.sda.map;

public class Main {

    public static void main(String[] args) {
	// write your code


        Generyka<String>generyka=new Generyka<String>("test");
        System.out.println(generyka.getField());

        Generyka<Integer> generyka1 = new Generyka<Integer>(666);
        System.out.println(generyka1.getField());
    }
}
