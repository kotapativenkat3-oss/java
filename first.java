//*printing the hello world program in java*//
// public class first{
//     public static void main(String[] args) {
//         System.out.println("Hello World");
//         System.out.println("my name is pavan");
//     }
// }

//prointing the sum of two numbers in java//
// public class first{
//     public static void main(String[] args){
//         int num1=4;
//         int num2=5;
//         int sum = num1+num2;
//         System.out.println("The sum of two numbers is: "+sum);
//     }
// }

// class first{
//     public static void main(String[] args){
//         float marks=6.5f;
//         System.out.println(marks);
//     }
// }

// class first{
//     public static void main(String[] args){
//         int num1=50;
//         byte by=127;
//         short sh = 558;
//         long l = 56789L;

//         char c='K';  ////laterals 

//         boolean b=true;
//         System.out.println(num1);
//         System.out.println(by);
//         System.out.println(sh);
//         System.out.println(l);
//         System.out.println(c);
//         System.out.println(b);
//     }
// }


//Data types in java//
// class first{
//     public static void main(String[] args) {
//         // laterals
//         int num = 10_00_00_000;
//         double num1=12e10;
//         boolean b  = 10>1;
//         char num2 = 'a';
//         num2++;
//         System.out.println(num);
//         System.out.println(num1);
//         System.out.println(b);
//         System.out.println(num2);
//     }
// }

//Type conversions and casting in java//
// class first{
//     public static void main(String[] args){
//         byte b=127;
//         int a=b;
//         float f=12.55f;
//         int x=(int)f;
//         System.out.println(a);
//         System.out.println(x);
//     }
// }

// class first{
//     public static void main(String[] args){
//         //byte b=125;
//         int a =257;
//         byte k=(byte)a;

//         float f=5.6f;
//         int t=(int)f;
//         System.out.println(k);
//         System.out.println(t);
//     }
// }

//type promotion
// class first{
//     public static void main(String[] args){

//         byte a=10;
//         byte b=30;

//         int result = a*b;
//         System.out.println(result);
//     }
// }


//airthemetic operations
// class first{
//     public static void main(String[] args) {
//         int num1=5;
//         int num2=10;
//         int sum=num1+num2;
//         int sun=num1-num2;
//         int result=num1*num2;
//         int reck=num2/num1;
//         int kill=num2%num1;
//         System.out.println(sum);
//         System.out.println(sun);
//         System.out.println(result);
//         System.out.println(reck);
//         System.out.println(kill);

//     }
// }


// class first{
//     public static void main(String[] args){
//         int num1=7;
//         // num1+=2;  //num1=num1+2
//         // int num2=num1*5;  //num1=num1*5
//         // int num3=num1--;
//         //num1++  //posr increment // first it will fetch the value and then it will increment
//         // ++num1;   //pre increment 

//         int result=++num1;
//         //int resulr = ++num1; // first increment the value and then fetch the value
//         System.out.println(result);
//         // System.out.println(num2);
//         // System.out.println(num3);
//     }
// }

//Relational operators in java//
// == is a relational operator
//== equal to
// != not equal to
// > greate than < less than >= greater than or equal to <= less than or equal to 

// public class first{
//     public static void main(String[] args){
//         int x=6;
//         int y=6;
//         boolean result = x<y;
//         boolean result1 = x>y;
//         boolean result2 = x>=y;
//         boolean result3 = x<=y;
//         boolean result4 = x==y;
//         System.out.println(result);
//         System.out.println(result1);
//         System.out.println(result2);
//         System.out.println(result3);
//         System.out.println(result4);


//     }
// }

// //logical operators in java//
// public class first{
//     public static void main(String[] args){
//         int x=7;
//         int y=10;
//         int a=5;
//         int b=9;
//         boolean result = a>b;
//         System.out.println(result);
//     }
// }

// //conditional statements in java//
// public class first{
//     public static void main(String[] args){
//         int x=18;
//         if(x>10 && x<=20){
//             System.out.println("Hello world");
//         }else{
//             System.out.println("Bye");
//         }
//     }
// }

//Conditional statements in java using else if//
// public class first{
//     public static void main(String[] args){
//         int x=25;
//         int y=35;
//         int z=6;
//         if(x>y && x>z){
//             System.out.println(x+"is greater than "+y +" and "+z);
//         }else if(y>z && y>x){
//             System.out.println(y+" is greater than " +x+ " and " +z);
//         }else if(z>x && z>y){
//             System.out.println(z+" is greater than "+x+" and " +y);
//         }else{
//             System.out.println(" all are equal");
//         }
//     }
// }

//ternary operator in java//
// public class first{
//     public static void main(String[] args){
//         int a=9;
//         int result = 0;
//         if (a%2==0)
//             result=10;
//         else
//             result=20;
//         System.out.println(result);
//     }
// }

// public class first{
//     public static void main(String[] args){
//         int a=9;
//         if(a%2==0){
//             System.out.println("Even number");
//         }else{
//             System.out.println("Odd number");
//         }
//     }
// }

//Ternary operator in java//
// public class first{
//     public static void main(String[] args){
//         int a=8;
//         int result=0;
//         result = (a%2==0) ? 10 : 20;
//         System.out.println(result);
//     }
// }