public abstract class Dish {

    protected Dish(Color color, int volume) {
        this.color = color;
        this.volume = volume;
    }

    public static class Color{

        private int R;
        private int G;
        private int B;

        public Color(int r, int g, int b) {
            R = r;
            G = g;
            B = b;
        }

        @Override
        public String toString() {
            return "Color{ " + R + ", " + G + ", " + B + " }";
        }
    }

    private Color color;
    private int volume;
    private String material;

    public int getVolume() {
        return volume;
    }

    public String getMaterial() {
        return material;
    }



    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setColorRGB(int R, int G, int B){
        color = new Color(R, G, B);
    }

    public abstract void onDestroy();
    public abstract void onOvenCooking();

}
