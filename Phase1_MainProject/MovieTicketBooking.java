package Phase1_MainProject;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MovieTicketBooking {

	static Scanner sc = new Scanner(System.in);
	String mveName = "", time = "", d = "", seatno = "";
	int fare = 0, totFare = 0;
	static List<List<String>> mainList = new ArrayList<>();
	static List<String> list = new ArrayList<>();
	static List<String> seatList = new ArrayList<>();
	static LinkedList<String> view = new LinkedList<>();
	static boolean isBooked = true;

	public void Admin() {
		// predefined username and password
		String username = "Admin123";
		String password = "666999";
		System.out.println("Enter Username : ");
		String un = sc.next();
		System.out.println("Enter Password : ");
		String op = sc.next();
		if (un.equals(username) && op.equals(password)) {
			System.out.println("Logged in successfully!!!\n");
			System.out.println("Do you want to update your password(Y/N)?");
			String p = sc.next();
			if (p.equalsIgnoreCase("Y")) {
				System.out.println("Enter new Password : ");
				String newpassword = sc.next();
				if (!newpassword.equals("")) {
					System.out.println("Password updated Successfully!!!");
					System.out.println("\nEXIT");
				}
			} else {
				System.out.println("EXIT");
			}
		} else {
			System.out.println("Please enter valid username or password!\n");
			System.out.println("Do you want to continue? (Y/N)");
			if (sc.next().equalsIgnoreCase("Y")) {
				Admin();
			} else {
				System.out.println("EXIT");
			}
		}
	}

	public void seatview() {
		view = new LinkedList<>();
		LinkedList<Character> rowChar = new LinkedList<>();
		for (char i = 'A'; i <= 'F'; i++) {
			rowChar.add(i);
		}
		LinkedList<Integer> seatInt = new LinkedList<>();
		for (int i = 1; i <= 10; i++) {
			seatInt.add(i);
		}
		System.out.println("\nDefault Seating Arrangement for all days:-");
		for (int i = 0; i < rowChar.size(); i++) {
			System.out.println("\n");
			for (int j = 0; j < seatInt.size(); j++) {
				String s = rowChar.get(i) + Integer.toString(seatInt.get(j));
				view.add(s);
				System.out.print(s + "  ");
			}
		}
		System.out.println();
	}

	public void user() {
		boolean flag = true;
		do {
			mveName = "Enthiran";
			fare = 250;
			System.out.println("\nMovie name = " + mveName);
			System.out.println("Fare = " + fare);
			list.add(mveName);
			list.add(String.valueOf(fare));
			// ---------------------------------------------------------------------------------
			do {
				System.out.println(
						"\nSelect date (1/2/3/4/5) : \n1)01-08-2022 \n2)02-08-2022 \n3)03-08-2022 \n4)04-08-2022 \n5)05-08-2022");
				int date = sc.nextInt();

				switch (date) {
				case 1:
					d = "01-08-2022";
					flag = false;
					break;
				case 2:
					d = "02-08-2022";
					flag = false;
					break;
				case 3:
					d = "03-08-2022";
					flag = false;
					break;
				case 4:
					d = "04-08-2022";
					flag = false;
					break;
				case 5:
					d = "05-08-2022";
					flag = false;
					break;
				default:
					System.out.println("Select valid date!");
					flag = true;
				}
			} while (flag);
			list.add(d);
			// ---------------------------------------------------------------------------------
			flag = true;
			do {
				System.out.println("Select Show time (1/2/3) : \n1)9Am - 12Pm \n2)1pm - 4pm \n3)6pm - 9pm");
				int show = sc.nextInt();
				switch (show) {
				case 1:
					time = "9Am - 12Pm";
					flag = false;
					break;
				case 2:
					time = "1pm - 4pm";
					flag = false;
					break;
				case 3:
					time = "6pm - 9pm";
					flag = false;
					break;
				default:
					System.out.println("Select valid show timing!");
					flag = true;
				}
			} while (flag);
			list.add(time);
			seat();
		} while (flag);
	}

	public void seat() {
		boolean seatFlag = true;
		do {
			System.out.println("\nSelect row from A - F");
			char row = sc.next().charAt(0);
			System.out.println("Select seat number (1 - 10)");
			int seat = sc.nextInt();
			seatno = row + String.valueOf(seat);
			if (view.contains(seatno)) {
				// Row and seat numbers are checked
				if (seatList.contains(seatno)) {
					System.out.println("This seat already booked.. Kindly book another");
					System.out.println("Do you want to continue? (Y/N)");
					if (sc.next().equalsIgnoreCase("Y")) {
						seatFlag = true;
						seat();
						isBooked = false;
					} else {
						display();
					}
				} else {
					seatFlag = false;
					list.add(seatno);
					seatList.add(seatno);
				}
			} else {
				System.out.println("Invalid row or seat number...Kindly select row(A-F) and Seat No(1-10)!");
				seat();
				isBooked = false;
				seatFlag = false;
			}
		} while (seatFlag && isBooked);

		if (isBooked) {
			System.out.println("Do you want to book another seat? (Y/N)");
			if (sc.next().equalsIgnoreCase("Y")) {
				seat();
			} else {
				mainList.add(list);
				list = new ArrayList<>();
				display();
			}
		}
	}

	public void display() {

		if (mainList.size() > 0) {
			totFare = 0;
			for (List<String> entry : mainList) {
				List<String> li = entry;
				int seatCount = 1;
				System.out.println("\nMovie : " + li.get(0));
				System.out.println("Fare : " + li.get(1));
				System.out.println("Date : " + li.get(2));
				System.out.println("Timing : " + li.get(3));
				System.out.print("Seat no(s) : " + li.get(4));
				if (li.size() > 4) {
					for (int i = 5; i < li.size(); i++) {
						System.out.print(", " + li.get(i));
						seatCount++;
					}
				}
				System.out.println();
				totFare = Integer.parseInt(li.get(1)) * seatCount;
				System.out.println("Total Fare : " + totFare);
			}

		} else {
			System.out.println("Movie : " + mveName);
			System.out.println("Fare : " + fare);
			System.out.println("Timing : " + time);
			System.out.println("Seat no : " + seatno);
		}

		LinkedHashMap<String, String> book = new LinkedHashMap<String, String>();
		int m = 0;
		for (List<String> listMain : mainList) {
			System.out.println("\nSeating arrangement of " + listMain.get(2) + " at the showtime " + listMain.get(3)
					+ " will be :-\n");
			for (String key : view) {
				if (listMain.contains(key)) {
					book.put(key, "BOOKED");
				} else {
					book.put(key, "Not Booked");
				}
				System.out.print(key + "(" + book.get(key) + ")" + "\t");
				m++;
				if (m % 10 == 0)
					System.out.println("\n");
			}
		}
		System.out.println("Do you want to confirm the bookings? (Y/N)");
		if (sc.next().equalsIgnoreCase("Y")) {
			System.out.println("Tickets Booked Successfully!!!");
		} else {
			System.out.println("Tickets are cancelled!");
		}
	}

	public static void main(String[] args) {
		MovieTicketBooking t = new MovieTicketBooking();
		boolean flag = true;
		System.out.println("Welcome to Login page!!!");
		do {
			System.out.println("\nSelect any one of the below options (1/2/3)");
			System.out.println("\n1) Login & update password \n2) Seating Arrangement & Booking the ticket \n3) Exit");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				t.Admin();
				System.out.println("\nDo you want to see the Home page options? (Y/N)");
				if (sc.next().equalsIgnoreCase("Y")) {
					flag = true;
				} else
					flag = false;
				break;
			case 2:
				t.seatview();
				t.user();
				System.out.println("\nDo you want to see the Home page options? (Y/N)");
				if (sc.next().equalsIgnoreCase("Y")) {
					flag = true;
					isBooked = true;
					seatList= new ArrayList<>();
				} else
					flag = false;
				break;
			case 3:
				flag = false;
				System.out.println("\nClosing the FrontDesk!");
				System.exit(0);
				break;
			default:
				System.out.println("Please select valid option!");
				System.out.println("\nDo you want to continue? (Y/N)");
				if (sc.next().equalsIgnoreCase("Y"))
					flag = true;
				else
					flag = false;
				break;
			}
		} while (flag);
		System.out.println("\nClosing the FrontDesk!");
		System.exit(0);
		sc.close();
	}
}
