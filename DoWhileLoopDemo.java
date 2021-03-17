class DoWhilebreakDemo{
public static void main(String[] args){
int i=10;
do{
System.out.println("printing through do while loop: "+i);
i--;
if(i==7){
break;
}
}
while(i>=5);
}
}
