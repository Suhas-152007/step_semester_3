
public class TrafficLight {
    private String color;

    TrafficLight(String color) {
        this.color = color;
    }

    void showAction() {
        if (color.equalsIgnoreCase("red")) {
            System.out.println("Stop!");
        } else if (color.equalsIgnoreCase("yellow")) {
            System.out.println("Get Ready!");
        } else if (color.equalsIgnoreCase("green")) {
            System.out.println("Go!");
        } else {
            System.out.println("Invalid traffic light color.");
        }
    }

    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("green");
        light.showAction();
    }
}