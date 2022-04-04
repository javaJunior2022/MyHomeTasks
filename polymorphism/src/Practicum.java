public class Practicum {

    public static void main(String[] args) {
        // Координаты точки
        int x = 4;
        int y = 2;
        // Цвет точки
        String color = "розовый";

        Point point = new ColorPoint(x, y, color);

        System.out.println("Заданная точка была окрашена: " + point.getName());
    }

    static class Point {
        private final int x;
        private final int y;
        private String name;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void setName(String name) {
            this.name = name;
        }

        protected String makeName() {
            return "(" + x + "," + y + ")";
        }

        public String getName() { return name; }

    }
}
