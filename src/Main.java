import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] commandArray = inputRoute();
        int l = routeLen(commandArray);
        int[][] createdMatrix = creatMatrix(l);
        int [] path = saveRoute(createdMatrix, commandArray);
        int answer = analyzeRoute(path);
        System.out.println(answer);
    }

    public static char[] inputRoute() {
        Scanner vvod = new Scanner(System.in);
        String route = vvod.nextLine();
        char[] m1 = new char[route.length()];
        for (int i = 0; i < route.length(); i++) {
            m1[i] = route.charAt(i);
        }
        //System.out.println(m1);
        return m1;
    }

    public static int routeLen(char[] m) {
        int l = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] == 'S') l++;
        }
        return l;
    }

    public static int[] saveRoute(int[][] matrix, char[] route) {
        int[] savedRoute = new int[routeLen(route)];
        int i = matrix.length / 2;
        int j = matrix[i].length / 2;
        savedRoute[0] = matrix[i][j]; int derection=0;
        for (int k = 1; k < route.length; k++) {
            if (route[i] == 'S') {
                stepF(derection, i,j);
                savedRoute[i] = matrix[i][j];
            }
            if (route[i] == 'R')
            derection = turnR(derection);
            if (route[i] =='L')
            derection = turnL(derection);
        }
        return savedRoute;
    }
    public static int analyzeRoute(int[] route){
        int countSteps = 0;
        for (int i = 0; i < route.length-2; i++) {
            for (int j = i++; j < route.length-1; j++) {
            if (route[i]!= route[j]) countSteps++; else return countSteps;
        }
        }
        return -1;
    }
    public static int[][] creatMatrix(int len) {
        int qCol = len + 1;
        int qRow = qCol;
        int[][] m1 = new int[qRow][qCol];
        int filling = -1;
        for (int i = 0; i < qRow; i++) {
            for (int j = 0; j < qCol; j++) {
                m1[i][j] = filling++;
            }
        }
        return m1;
    }
    public static int turnR (int position){
        return  position++%4;
    }
    public static int turnL (int position){
        return  (position+3)%4;
    }
    public static void stepF(int pos, int x, int y){
        if (pos == 0) x--;
        if (pos == 1) y--;
        if (pos == 2) x++;
        if (pos == 3) y++;
    }
}