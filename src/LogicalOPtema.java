public class LogicalOPtema {

//ex 1
public void countTo100(int a) {
    for (int A = a; A <= 100; A++) {
        System.out.println(A+" ");
    }
}
//ex 2
public void countToMinus100(int a) {
    for (int B = a; B >= -100; B--) {
        System.out.println(B+" ");
    }
}
//ex 3
public void countFirstIntToSecondInt(int a, int b) {
    for (int i = a; i <= b; i++) {
        System.out.println(i);
    }
    for (int i = a; i >= b; i--) {
        System.out.println(i);
    }
}
//ex 4
public void countBetweenFirstAndLast(int first, int second) {
    if(first < second){
        for (int i = first; i <= second; i++) {
            System.out.println(i);
        }
    } else if(second < first){
        for (int i = second; i <= first; i++) {
            System.out.println(i);
        }
    }
}
//ex5
public void printEvenNr() {

    for(int i = 100; i>= 1;i-=2){
        System.out.println(i);
    }
}
//ex 6
public void printOddNr() {
    for (int i = 0; i <= 100; i++) {
        if (i % 2 != 0) {
            System.out.println(i);
        }
    }
}
//ex 7
public int sumFromNrTo100( int a){
        int sum = 0;
        for(int i = a; i<= 100;i++){
            sum += i;
        }
        return sum;
    }
//ex 8
public float ForLoopAverage(){
    float sum=0;
    for(float i=95;i<=100;i++){
        sum= sum+i;
    }
    return sum/100;
}
//ex 9
public String printstarsForLoop() {
    int a, b;
    for (a = 0; a <= 6; a++) {
        for (b = 1; b <= 7 - a; b++)
            System.out.print("*");
        System.out.println("");
    }
    return " ";
}








}
