public class GreatCircle {
    public static void main(String[] args) {

        // initiation of variables
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        // computing shortest distance
        double a = (Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2))) +
                (Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math
                        .cos(Math.toRadians(y1 - y2)));

        // computing shortest distance in nautical miles
        double distance = 60 * Math.toDegrees(Math.acos(a));

        // Print the distance
        System.out.println(distance + " nautical miles");
    }
}
