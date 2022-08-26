package com.bilgeadam.course04.marathon01;

import java.util.Scanner;

public class ShapeTest {

	private static final int MAX_EDGE = 4;
	private static final int MIN_EDGE = 3;

	private Scanner input;

	public static void main(String[] args) {
		ShapeTest shapeTest = new ShapeTest();
		shapeTest.readInput();

		System.out.println("Bye...");

	}

	private void readInput() {

		boolean shaping = true;
		while (shaping) {
			Shape shape = createNewShape();
			shaping = inputScreen(shape, shaping);
			if (!shaping)
				break;
			else
				calculateShape(shape);
		}
	}

	private boolean inputScreen(Shape shape, boolean shaping) {

		this.input = new Scanner(System.in);
		System.out.println("Please enter the side lengths of the shape (for MAX 4 sides) you want to calculate: (Enter -1 for exit)");
		for (int i = 0; i < ShapeTest.MAX_EDGE; i++) {
			System.out.print("Please enter the length of the " + (i + 1) + ". side (For finish enter 0): ");
			int edge = input.nextInt();
			if (edge == -1) {
				shaping = false;
				break;
			} else if (edge == 0) {
				break;
			}
			shape.edges[i] = edge;
		}
		return shaping;
	}

	private Shape createNewShape() {
		Shape shape = new Shape();
		shape.edges = new int[MAX_EDGE];
		return shape;

	}

	private void calculateShape(Shape shape) {
		int elementCounter = 0;
		for (int number : shape.edges) {
			if (number != 0) {
				elementCounter++;
			}
		}
		System.err.println((elementCounter >= ShapeTest.MIN_EDGE) ? shape.output(elementCounter) : ("Cannot be a shape with two or less sides"));

	}
}
