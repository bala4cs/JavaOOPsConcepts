package com.oops.learning.single.Hirerachialinheritance;

public class HirerachialInheritance {
	
	public static void main(String args[]) {
		SiblingOne firstSibling = new SiblingOne();
		firstSibling.printSiblingOnedDetails();
		firstSibling.printParentInfo();
		
		SiblingTwo secondSibling = new SiblingTwo();
		secondSibling.printSiblingTwoDetails();
		secondSibling.printParentInfo();
		
	}
}
