
import java.util.Scanner;

	public class HW1 {
		static Scanner sc = new Scanner(System.in);
		static int quantity,choice,total=0,price1=0,price2=0,price3=0,quantity1,quantity2,quantity3,all,vat,discount;
		static String coupon;
		static int pizza(int pizza){
			price1 = quantity*250;
			quantity1=quantity1+quantity;
			total = total+price1;
			return pizza;
		}
		static int chicken(int chicken){
			price2 = quantity*120;
			quantity2=quantity2+quantity;
			total=total+price2;
			return chicken;
		}
		static int coke(int coke){
			price3 = quantity*45;
			quantity3=quantity3+quantity;
			total=total+price3;
			return coke;
		}
		static void discount(int discount){
			if(coupon.equals("y")){
				discount = total*5/100;
				System.out.printf("| Coupon                                  |   %5d     |\n",discount);
			}
		}
		static int table(int all){
				vat = total*7/100;
				discount=total*5/100;
				System.out.println("+------- Menu --------+------- Qty -------+--- Price ---+");
				if(price1 !=0){
					System.out.printf("| Pizza               |     %5d         |   %5d     |\n",quantity1,quantity1*250);
					}if(price2 !=0){
						System.out.printf("| Chicken             |     %5d         |   %5d     |\n",quantity2,quantity2*120);
					}if(price3 !=0){
						System.out.printf("| Coke                |     %5d         |   %5d     |\n",quantity3,quantity3*45);
					}
				System.out.println("+---------------------+-------------------+-------------+");
				if(coupon.equals("y")){
					discount(discount);
				}
				System.out.printf("| Vat7%%                                   |   %5d     |\n",vat);
				System.out.printf("| Total                                   |   %5d     |\n",total+vat-discount);
				System.out.println("+-----------------------------------------+-------------+");
				System.out.println("");
			return all;
		}

			static void homework() {
				int pizza=250,chicken=120,coke=45;
				System.out.println("--------- Welcome to SKE Restaurant --------");
				System.out.printf("1.) Pizza\t %5d Baht.\n",pizza);
				System.out.printf("2.) Chicken\t %5d Baht.\n",chicken);
				System.out.printf("3.) Coke\t %5d Baht.\n",coke);
				System.out.println("4.) Total");
				System.out.println("5.) Exit");
				System.out.println("");
				do{	
					System.out.print("Enter your Choice: ");
					choice = sc.nextInt();
					if(choice == 5){
						System.out.println("================= Thank you =================");
						break;
					}if(choice == 4){
						System.out.print("Do you have a discount coupon (y/n): ");
						coupon = sc.next();
						table(all);
						if(total>=1000){
							System.out.println("You get 5% discount coupon next time.");
							System.out.println("");
						}
					}
					if(choice != 4){
						System.out.print("Enter Quantity: ");
					quantity = sc.nextInt();
					System.out.println("");
					switch(choice){
					case 1:
						pizza(pizza);
						break;
					case 2:	
						chicken(chicken);
						break;
					case 3:
						coke(coke);
						break;
					default:
						break;
					}}
				}while(choice!=5);
			}
			public static void main(String[] args) {
				homework();
			}
	}
