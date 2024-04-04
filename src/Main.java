import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    creatMatrix();
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
    public static int routeLen (char m[]){
        int l = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] == 'S') l++;
        }
        return l;
    }
    public static int [] saveRoute (int matrix [][], char route[]) {
        int[] saveRoute = new int[routeLen(inputRoute())];
        for (int i = matrix.length / 2; i < matrix.length / 2 + 1; ) {
            for (int j = matrix.length / 2; j < matrix[i].length / 2 + 1; ) {
                saveRoute[0] = matrix[matrix.length / 2][matrix[i].length / 2];
                for (int k = 1; k < route.length; k++) {
                    if (route[i] == 'S') {
                        i++;
                        saveRoute[i] = matrix[i][j];
                    }
                    if (route[i] == 'R') {

                    }
                }
            }
        }
        return saveRoute;
    }
        public static int[][] creatMatrix() {
            int qCol = routeLen(inputRoute()) + 1;
            int qRow = qCol;
            int[][] m1 = new int[qRow][qCol];
            int filling = -1;
            for (int i = 0; i < qCol; i++) {
                for (int j = 0; j < qRow; j++) {
                    m1[i][j] = filling++;
                }
            }
            return m1;
        }
    }