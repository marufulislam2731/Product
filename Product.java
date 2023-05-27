package beginnerjava;
import java.util.Scanner;
public class Product {
    public static void main(String[] args){
    Scanner input= new Scanner(System.in);

    int ID, Price; 
    String Description, Title, Categorie;
    
    System.out.println("ID:");
    ID= input.nextInt();
    System.out.println("Price:");
    Price= input.nextInt();
    System.out.println("Description:");
    Description= input.nextLine();
    System.out.println("Title:");
    Title= input.nextLine();
    System.out.println("Categori: ");
    Categorie= input.nextLine();
    
     System.out.println("ID: "+ID);
     System.out.println("Price: "+Price);
     System.out.println("Description: "+Description);
     System.out.println("Title: "+Title);
     System.out.println("Categori: "+Categorie);
    }
}