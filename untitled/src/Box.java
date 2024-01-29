public class Box {
    private Object obj;

    public Box(Object obj) {
        this.obj = obj;
    }
    public Object getObj(){
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
    public void printInfo(){
        System.out.printf("Box (%s) : %s", obj.getClass().getSimpleName(), obj.toString());
    }

    public static void main(String[] args) {
        Box box1 = new Box(20);
        Box box2 = new Box(30);
        if (box1.getObj() instanceof Integer && box2.getObj() instanceof Integer){
            int sum = (Integer) box1.getObj() + (Integer) box2.getObj();
            System.out.println("sum = " + sum);
        }
        else {
            System.out.println("Ошибка");
        }
        //System.out.println((Integer) box1.getObj() + (Integer) box2.getObj());
    }
}

