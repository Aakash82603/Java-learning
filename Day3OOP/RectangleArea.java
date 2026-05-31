package Day3OOP;
class Rectangle{
    int length;
    int width;
    Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    int area(){
        return length*width;
    }
    int perimeter(){
        return 2*(length+width);
    }
    boolean isSquare(){
        if (length==width){
            return true;
        }
        else{
            return false;
        }

    }
    void display(){
        System.out.println("The area of the rectangle is "+area());
        System.out.println("The perimeter of the rectangle is "+perimeter());
        System.out.println("The square of the rectangle is "+isSquare());
    }
}
public class RectangleArea {
    public static void main(String[] args) {
        //Rectangle r=new Rectangle(10,20);
       Rectangle r1=new Rectangle(10,90);

       // r.display();
        r1.display();
    }
}
