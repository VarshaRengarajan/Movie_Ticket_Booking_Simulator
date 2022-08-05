package Phase1project;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Booking {
    
    public static String bookingDate;
    public static int row;
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<String> selectedSeatList = new ArrayList<String>();
    public static LinkedList<String> seats = new LinkedList<String>();
    public static HashMap<Integer,String> rows = new HashMap<>();
    public static int seatCount =0;
    public static boolean nextseatflag = false;

	public static void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("Let's start to book your tickets!");
		System.out.println("Please enter the date for booking:");
		bookingDate=sc.next();
		System.out.println("Select the show time from below:");
		ArrayList<String> showTime = new ArrayList<String>();
		showTime.add("11AM");
		showTime.add("1PM");
		showTime.add("6PM");
		System.out.println(showTime);
		String time = sc.next();
		if(time.equals("11AM")){
			displayRows();
			displaySeats();
			
		}
		else if(time.equals("1PM")){
			displayRows();
			displaySeats();
		}
		else if(time.equals("6PM")){
			displayRows();
			displaySeats();
		}
	}
	
	public static void displayRows(){
		rows.put(1,"A");
		rows.put(2,"B");
		rows.put(3,"C");
		rows.put(4,"D");
		rows.put(5,"E");
	    
	    boolean flag = true;
	    while (flag){
    		try {
                System.out.println("Please select your row: "+rows);
    		    row = sc.nextInt();
                if ((rows.get(row))!=null) {
                    System.out.println("Your selected row: "+row+":"+rows.get(row));
                    flag=false;
                }
                else if (rows.get(row).equals("n")){}
            }
            catch (NullPointerException e) {
                System.out.println("You entered an invalid option");
            }
	    }
        
		System.out.println("-----------------------------------");
	}
	public static void displaySeats(){
		seats.add("1");
		seats.add("2");
		seats.add("3");
		seats.add("4");
		seats.add("5");
		seats.add("6");
		seats.add("7");
		seats.add("8");
		seats.add("9");
		seats.add("10");
		
		
		seatSelection();
		
		System.out.println("Do you need to book another seat?\n Enter 'yes' or 'no'");
		String nextseatOption = sc.next();
		
		if(nextseatOption.equals("yes")){
		    nextseatflag = true;
		    seatSelection(nextseatflag);
    		payment(seatCount);
		}
		else if (nextseatOption.equals("no")){
		    System.out.println("-----------------------------------");
			payment(seatCount);
			
		}
		
		System.out.println("Your ticket details: Date: "+bookingDate+", row: "+rows.get(row)+" "+selectedSeatList);
	}
	
	public static void seatSelection(){
	    System.out.println("Please select your seat: "+seats);
	    int seat = sc.nextInt();
		System.out.println("Please enter your name: ");
		String name = sc.next();
		selectedSeatList.add(seat+"-"+name);
		seats.set(seat-1,name);
		seatCount+=1;
		System.out.println("Your seat is booked!!");
		System.out.println("-----------------------------------");
	}
	
	public static void seatSelection(boolean nextseatflag){
	    while (nextseatflag){
    			System.out.println("Please select your seat: "+seats);
    		    int seat1 = sc.nextInt();
			    if (seats.contains(Integer.toString(seat1))){
			        System.out.println("Please enter your name: ");
        			String name1 = sc.next();
        			selectedSeatList.add(seat1+"-"+name1);
        			seats.set(seat1-1,name1);
        			System.out.println("Your seat is booked!!");
        			System.out.println("-----------------------------------");
        			seatCount+=1;
        			System.out.println("Do you need to book another seat?\n Enter 'yes' or 'no'");
        			String nextseatOption1 = sc.next();
                    if(nextseatOption1.equals("no")){
        		        nextseatflag = false;
        		        System.out.println("-----------------------------------");
        		    }
			    }
			    else{
			    System.out.println("seat already booked\nPlease select another seat");
			    }
    		}
	}
	
	
	public static void payment(int numberofSeats){
		int ticketPrice = 120;
		int price = numberofSeats*ticketPrice;
		System.out.println("The total payable amount is:Rs "+price);
		System.out.println("-----------------------------------");
		
	}
}
	