package Bridgelabz;

public class VariableTypes {
    int num = 10;  //Instance Variable
    static int num2  = 20;  //Static Variable

    public void localMethod(){
        int num3  = 30;          //Local variable
        System.out.println("Local Variable "+num3);
    }

    public static void main(String[] args) {
        VariableTypes obj = new VariableTypes();
        System.out.println("Instance Variable "+obj.num);
        obj.localMethod();

        System.out.println("Static Variable "+num2);
        //System.out.println();
    }
}
