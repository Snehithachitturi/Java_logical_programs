blic class CountNumberOfDigitsInInteger {
public static void main(String args[]) {
// to store the number of digits 
int count = 0;
// given integer
int num = 1254566;
System.out.println("given number:: " + num);
// loop to count number of digits
while(num != 0){
num = num / 10;
count++;
}
System.out.println("Number of digits in the given integer are:: " + count);
}
}