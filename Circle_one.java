
package circleapp;

//this class only deal with everythng to do with circle 1
class Circle_one {
     int x1 ; 
    int y1 ;
    float radius1;
    
    //setters 
    public void setx1(int x1){
        this.x1 = x1;
    }
    public void sety1(int y1){
        this.y1 = y1;
    }
    public void setradius1(float radius1){
        this.radius1 = radius1;
    }
    //getters
    public int getx1(){
        return x1;
    }
    public int gety1(){
        return y1;
    }
    public float getradius1(){
        return radius1;
    }
    public float calculateArea(){
            float area;
            area = (float)(radius1*radius1*Math.PI);//casting all data types to float
            return area;
        }
        public float calculateCircumference(){
            float circumference;
            circumference = (float)(2*Math.PI*radius1);//casting all data types to float
            return circumference;
        }
        public float calculateDiameter(){
            float diameter ;
            diameter = (float)(2*radius1);//casting all data types to float
            return diameter;
        }
    
}
