/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn_tableau2;
 import java.util.Scanner;
/**
 *
 * @author MOUSTAPHA
 */
public class Mn_tableau2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]monTableau=new int[10]; 
        int[]tab={12,15,13,10,8,9,13,14,18};
        int n;
        int indice=-1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrez_le_nombre_a_chercher:_");
        n=sc.nextInt();
        for(int i=0;i<tab.length;i++){
            if((tab[i]==n)&&(indice==-1)){
                indice=i;
            }
        }
        if(indice!=-1){
            System.out.println("Le_est_a_l'indice_");
            System.out.println(indice);
            
            
        }else{
            System.out.println("Le_nombre_n'est_pas_dans_le_tableau");
        }
    }
    
}
