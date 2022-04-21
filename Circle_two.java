
package circleapp;
//deal with circle 2
class Circle_two {
     int x2 ; 
    int y2 ;
    float radius2;
    
    //setters 
    public void setx2(int x2){
        this.x2 = x2;
    }
    public void sety2(int y2){
        this.y2 = y2;
    }
    public void setradius2(float radius2){
        this.radius2 = radius2;
    }
    //getters
    public int getx2(){
        return x2;
    }
    public int gety2(){
        return y2;
    }
    public float getradius2(){
        return radius2;
    }
    public float calculateArea(){
            float area;
            area = (float)(radius2*radius2*Math.PI);//casting all data types to float
            return area;
        }
        public float calculateCircumference(){
            float circumference;
            circumference = (float)(2*Math.PI*radius2);//casting all data types to float
            return circumference;
        }
        public float calculateDiameter(){
            float diameter ;
            diameter = (float)(2*radius2);//casting all data types to float
            return diameter;
        }
    
}
