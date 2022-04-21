
package circleapp;


class Circle_three {
    int x3 ; 
    int y3 ;
    float radius3;
    
    //setters 
    public void setx3(int x3){
        this.x3 = x3;
    }
    public void sety3(int y3){
        this.y3 = y3;
    }
    public void setradius3(float radius3){
        this.radius3 = radius3;
    }
    //getters
    public int getx3(){
        return x3;
    }
    public int gety3(){
        return y3;
    }
    public float getradius3(){
        return radius3;
    }
    public float calculateArea(){
            float area;
            area = (float)(radius3*radius3*Math.PI);//casting all data types to float
            return area;
        }
        public float calculateCircumference(){
            float circumference;
            circumference = (float)(2*Math.PI*radius3);//casting all data types to float
            return circumference;
        }
        public float calculateDiameter(){
            float diameter ;
            diameter = (float)(2*radius3);//casting all data types to float
            return diameter;
        }
    
}
