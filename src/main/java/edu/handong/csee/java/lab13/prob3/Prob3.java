package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;

import javafx.scene.shape.Circle;


public class Prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter radius: ");
		n1 = keyboard.nextDouble();
		Circle circle = new Circle(n1);
		Circle c1 = circle;

		System.out.println("Radius: "+ c1.getRadius());
		c1.display();

		System.out.print("Enter length and width: ");
		n1 = keyboard.nextDouble();
		n2 = keyboard.nextDouble();
		Rectangle r1 = new Rectangle(n1, n2);

		System.out.println("Length: "+ r1.get_Length());
		System.out.println("Width: "+ r1.get_Width());
		r1.display();
		}

	}

}
