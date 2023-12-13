
class assignmentQ1{

    // Practical implementation of method overloading
    public int add(int a, int b){
        int c = a + b;
        return c;
    }
    public int add(int a, int b, int d){
        int c = a + b;
        return c;
    }
    public int add(int a, int b, int d, int e){
        int c = a + b;
        return c;
    }
    public double add(double a, double b){
        double c = a + b;
        return c;
    }

    public static void main(String[] args) {

        assignmentQ1 obj = new assignmentQ1();
        
        int r1 = obj.add(2, 3);
        int r2 = obj.add(3, 4, 5);
        int r3 = obj.add(5, 6, 7, 8);
        double r4 = obj.add(2.9, 6.7);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

    
    }
}