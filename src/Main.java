//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VerkeersBoete boete = new VerkeersBoete();
        boete.setNaamDader("Jan Smit");
        boete.setKenteken("04-SPZ-8");
        boete.setBedrag(100);

        System.out.println(boete);

        ParkeerBoete boete1 = new ParkeerBoete("Jan Smit", "04-SPZ-8", "2");
        boete1.bepaalBedrag();
        System.out.println(boete1);

    }
}