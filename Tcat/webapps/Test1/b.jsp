<%!
    public class Circle {
        
        float r = 20.0f;

        public Circle(float r){
            this.r = r;
        }

        public float getArea(){
            return 3.14f*r*r;
        }

    }

    Circle c = new Circle(10.5f);
%>

<%
    out.println(c.getArea());
%>