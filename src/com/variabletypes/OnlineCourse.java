package com.variabletypes;

public class OnlineCourse {

	static String instructorName;
	static double course_Price;
	static int discount;
	static int studentCount;
	static float ratings=4.5F;
	
	
	
	
	public static void main(String[] args) {
		String courseName="Java";
		int courseId=112;
		String category="Programming";
		String duration="6 Months";
		String Language="Hinglish";
		String level="Intermediate";
		boolean certificateAvailable=true;
		boolean isActive=true;
		
		
		
		
	System.out.println("Course ID :"+courseId);
	System.out.println("Course Name :"+courseName);
	System.out.println("Course Instructor Name :"+instructorName);
	System.out.println("Course Category :"+category);
	System.out.println("Course Duration :"+duration);
	System.out.println("Course Price :"+course_Price);
	System.out.println("Course Discount :"+discount);
	System.out.println("Course Student Count :"+studentCount);
	System.out.println("Course Ratings :"+ratings);
	System.out.println("Course Level :"+level);
	System.out.println("Course Language :"+Language);
	System.out.println("Course Certificate Availability :"+certificateAvailable);
	System.out.println("Course is Active :"+isActive);
}
}
