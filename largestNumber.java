class largestNumber{
public static void main(String[] args){
int a=100;
int b=200;
int c=300;
int largest=(a>b)&&(a>c)?a:(b>c)?b:c;
System.out.println("largest of" + a + "and" + b + "is" + largest);
}
}