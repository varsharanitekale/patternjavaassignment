public class pattern {
    public static void main(String[] args){
        for(int i=1; i<=5; i++){
                 } System.out.print("*");
 System.out.println("");
 System.out.println("---------------");
   for(int j=1;j<=5; j++){
       System.out.print("*\t");
   }
   System.out.println("");
   System.out.println("----------------");
   for(int k=1; k<=5; k++){
    System.out.println("*");
       
   }
   System.out.println("");
   System.out.println("----------------");
/*    Right Pyramid pattern */
   for(int a=1; a<=5; a++){
    for( int b=1;  b<=a ;b++ ){
       System.out.print("* ");
       
        
    }System.out.println();

}
System.out.println("");
System.out.println("-----------");
//  square pattern
for( int p=1; p<=3; p++){
    for(int q=1; q<=5; q++){
        System.out.print("* ");
    }System.out.println("");

}
System.out.println("------------------");
//  right lower  pyramid pattern
 for( int i=1; i<=5; i++){
    for(int j=5; j>=i; j--){

        System.out.print("* ");
    }System.out.println("");
}
/// left rotated pyramid.....
for(int a=1; a<=5; a++){
    for( int b=1;  b<=a ;b++ ){
       System.out.print("* ");
       
        
    }System.out.println();

}
for( int i=1; i<=5; i++){
    for(int j=4; j>=i; j--){

        System.out.print("* ");
    }System.out.println("");
}
// right  pyrimidal number
for(int s=1; s<=5; s++){
    for(int t=1; t<=s; t++){
        System.out.print(t+" ");
    }System.out.println("");
}
int counter=1;
for(int g=1; g<=7; g++){
    for(int k=1; k<=g; k++){
        System.out.print(counter+" ");
        counter++;

    }System.out.println("");
}
// equallateral trianle pattern;
for(int z=1; z<=5; z++){
    for(int x=1; x<=5-z; x++){
        System.out.print(" ");
    }
    for(int y=1; y<=z; y++){
        System.out.print(" * ");
    }System.out.println("");

}

// left side pyramid pattern star;
for(int a=1; a<= 5; a++){
    for(int r=1; r<= 2*(5-a); r++){
        System.out.print("  ");
 }
    for( int b=1;  b<=a; b++ )
    {
       System.out.print("  * ");
       
        
    }System.out.println("  ");

}
System.out.println("-===============-");
System.out.println("");
for( int t= 1; t<=5; t++){
    for(int r=1; r<=t; r++){
        System.out.print("  ");
    }
    for(int f=5; f>=t; f-- ){
        System.out.print("  * ");

    }System.out.println("");
}
// both triangle pyramidal.....
System.out.println("===============");
for(int z=1; z<=5; z++){
    for(int x=1; x<=5-z; x++){
        System.out.print("  ");
    }
    for(int y=1; y<=z; y++){
        System.out.print("   * ");
    }System.out.println(" ");

}
for( int t= 1; t<=4; t++){
    for(int r=1; r<=t; r++){
        System.out.print("  ");
    }
    for(int f=4; f>=t; f-- ){
        System.out.print("   * ");

    }System.out.println("  ");
}
System.out.println("============");
// number equlateral lower triangle
 
    }
}
