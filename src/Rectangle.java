public class Rectangle {
    public double width;
    public double length;

        public Rectangle() {
        this.length=9;
        this.width=5;
        System.out.println("Rectangle створено");
            }
    public void info (){
        System.out.println("прямокутник: ширина = "+width+", довжина = "+length);
        System.out.println("Площа прямокутника: "+width*length);
        System.out.println("Периметр прямокутника: "+(width+length)*2);
    }

}
