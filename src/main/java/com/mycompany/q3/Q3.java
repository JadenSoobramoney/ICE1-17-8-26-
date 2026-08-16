/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q3;

import java.util.Scanner;

/**
 *
 * @author emeris
 */
public class Q3 {
        public static String[] arrWeek={"Monday   ","Tuesday  ","Wednesday","Thursday ","Friday   ","Saturday ","Sunday   "};
        public static  String[] arrFlowers={"Roses","Tulips","Lillies"};

        public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[][] ArrSales= new int[7][3];
        

        
        
        //input sequence
        for (int r =0;r<ArrSales.length;r++){
            
                for (int c =0;c<ArrSales[1].length;c++){
                    System.out.println("Enter the sales amount of "+arrFlowers[c]+" on "+ arrWeek[r]);
                    ArrSales[r][c]= input.nextInt();
            
                     }               
        
        }
        //End of sequence
        System.out.print("\nFLOWER SHOP WEEKLY SALES REPORT" );
        System.out.print("\n===================================" );
        System.out.print("\nDAY     \t\t" );
        
        for (int k =0;k<ArrSales[1].length;k++){System.out.print(arrFlowers[k].toUpperCase()+"\t");}
        System.out.print("Total");
        
        
        System.out.print(ColRowDisp(ArrSales));
        
        
            
            
            

            
        
    }
    public static String ColRowDisp(int[][] ArrInput){
    String Final="";
        int[] ArrColSum=new int[ArrInput[1].length];
        int FinTot=0;
        
        for (int Set =0;Set<ArrColSum.length;Set++){
        ArrColSum[Set]=0;
        }
        for (int i =0;i<ArrInput.length;i++){
                int Sum=0;
                Final=Final+("\n"+arrWeek[i]+"\t");
                
                
            for (int j =0;j<ArrInput[1].length;j++){
                Final=Final+("\t" +ArrInput[i][j]);
                Sum=Sum+ArrInput[i][j];
                ArrColSum[j]=ArrColSum[j]+ArrInput[i][j];
            } 
            Final=Final+("\t"+ Sum);
            FinTot=FinTot+Sum;
            }
        Final=Final+("\n---------------------------------------------------------------");
                Final=Final+("\nTOTAL    \t\t");
            
            for (int Week =0;Week<ArrColSum.length;Week++){ Final=Final+(ArrColSum[Week]+"\t");
            }
            Final=Final+FinTot;
            for(int Out=0; Out<ArrColSum.length;Out++){
                Final=Final+"\nTotal sales for "+arrFlowers[Out]+": " + ArrColSum[Out];}
            Final=Final+"\nTotal sales for this week R"+ FinTot;
            
            

            
            return Final;
    
    
    
    
    
    
    }
}
