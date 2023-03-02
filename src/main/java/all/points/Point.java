package all.points;

public class Point{
    int x;
    int y;
    protected Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    protected String check(int x, int y){
        return (this.x == x && this.y == y) ? "\n true the values are same":"\n false the values are same";    
    }
    protected Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
