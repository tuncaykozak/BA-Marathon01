package com.bilgeadam.course04.marathon01;

public class Shape {

	private static int shapeCounter = 0;

	int shapeNo;
	int[] edges;

	public Shape() {
		shapeNo = ++shapeCounter;
	}

	public int calculatePerimeter(int elementCounter) {
		int perimeter = 0;
		for (int sideLength : this.edges) {
			perimeter += sideLength;
		}
		return perimeter;

	}

	public int calculateArea(int elementCounter) {
		int area = 1;
		for (int i = 0; i < elementCounter; i++) {
			area *= this.edges[i];
		}
		return area;
	}

	public String output(int elementCounter) {

		return "Your " + this.shapeNo + ". shape's perimeter is " + this.calculateArea(elementCounter) + " and area is " + this.calculateArea(elementCounter);
	}

}
