import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
inputRoute();
    }
    public static char [] inputRoute (){
        Scanner vvod = new Scanner(System.in);
        String route = vvod.nextLine();
        char[] m1 = new char [route.length()];
        for (int i = 0; i < route.length(); i++) {
            m1[i]= route.charAt(i);
        }
        //System.out.println(m1);
        return m1;
    }
    static class Matrix {
        static int qRow;
        static int qCol;
        public Matrix(int qRow, int qCol) {
            this.qRow = qRow;
            this.qCol = qCol;
        }
        public static Matrix creatMatrix() {
            System.out.println("Введи максимальное количество шагов");
            Scanner vvod=new Scanner(System.in);
            qCol= vvod.nextInt()+1;qRow=qCol;
            Matrix m1 = new Matrix(qRow,qCol);
            return m1;
        }
    }
}