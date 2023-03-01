public class Task1 {
        public static void main(String[] args) {
            double degrees = 30.0;
            double radians = degrees * Math.PI / 180.0;

            double sin = Math.sin(radians);
            double cos = Math.cos(radians);

            System.out.println("Синус 30 градусів: " + sin);
            System.out.println("Косинус 30 градусів: " + cos);
        }
}
