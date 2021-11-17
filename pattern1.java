public class pattern1 {
    public static void main(String[] args){
        for( int t= 1; t<=5; t++){
            for(int r=0; r<=t-1; r++)
            {
                System.out.print("   ");
            }
            
            for(int f=5; f>=t; f-- ){ 
                System.out.print( t+ "     ");
         
            }System.out.println("   ");
        }
        

        System.out.println("==============================================");



        for( int t=1; t<=5; t++){
            for(int r=0; r<=t-1; r++)
            {
                System.out.print("   ");
            }
            
            for(int f=t; f<=5; f++ ){ 
                
                System.out.print( f + "     ");
         
            }System.out.println("   ");
        }


        
        

    }
    
}
