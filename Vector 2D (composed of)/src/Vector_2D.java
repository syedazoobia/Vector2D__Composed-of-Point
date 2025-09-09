public class Vector_2D{
    private Point start;
    private Point end;

    public Vector_2D(){
        this.start = new Point(0,0);
        this.end = new Point(0,0);
    }

    public Vector_2D(Point s, Point e){
        this.start = s;
        this.end = e;
    }

    public Vector_2D(float x, float y) {
        this.start = new Point(0, 0);
        this.end = new Point(x, y);
    }

    public Vector_2D(Vector_2D other){
        this.start = other.start;
        this.end = other.end;
    }

    public float getx(){
        return end.getx() - start.getx();
    }

    public float gety(){
        return end.gety() - start.gety();
    }

    public Vector_2D add(Vector_2D other){
        return new Vector_2D(this.getx() + other.getx() , this.gety() + other.gety());
    }
        
     public Vector_2D sub(Vector_2D other){
        return new Vector_2D(this.getx() - other.getx() , this.gety() - other.gety());
    }

     public float dot_product(Vector_2D other){
        return (this.getx() * other.getx() + this.gety() * other.gety());
    }

    public float magnitude(){
        return (float) Math.sqrt(this.getx() * this.getx() + this.gety() * this.gety());
    }
}