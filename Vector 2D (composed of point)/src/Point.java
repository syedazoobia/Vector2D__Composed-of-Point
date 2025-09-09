public class Point {
    float x;
    float y;

    Point() { 
        this.x = 0;
        this.y = 0;
    }

    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getx(){
        return x;
    }

    public float gety(){
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
