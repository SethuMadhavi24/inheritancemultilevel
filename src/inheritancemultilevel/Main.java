package inheritancemultilevel;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Dinosaur \n 2.Lava Dinosaur \n 3.Dragon Dianosaur");
		System.out.println("Enter type: ");
		int n = sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Enter species:");
			String species=sc.next();
			System.out.println("Enter Consumption:");
			String consumptiontype=sc.next();
			Dinosaur dino=new Dinosaur(species,consumptiontype);
			dino.displaydinodetails();
			break;
		case 2:
			System.out.println("Enter species:");
			String species1=sc.next();
			System.out.println("Enter Consumption:");
			String consumptiontype1=sc.next();
			System.out.println("Breathes fire?(y/n):");
			String breath=sc.next();
			System.out.println("Is heat Resistence?(y/n):");
			String heat=sc.next();
			Lavadino ldino=new Lavadino(species1,consumptiontype1,breath,heat);
			ldino.displaydinodetails();
			break;
		case 3:
			System.out.println("Enter species:");
			String species2=sc.next();
			System.out.println("Enter Consumption:");
			String consumptiontype2=sc.next();
			System.out.println("Breathes fire?(y/n):");
			String breath2=sc.next();
			System.out.println("Is heat Resistence?(y/n):");
			String heat2=sc.next();
			System.out.println("Enter no of wings:");
			int noofwings=sc.nextInt();
			System.out.println("Enter no of Scales:");
			int noofscales=sc.nextInt();
			Dragondino ddino=new Dragondino(species2,consumptiontype2,breath2,heat2,noofwings,noofscales);
			ddino.displaydinodetails();
			break;
			
		}
		
	}
}
