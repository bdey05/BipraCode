package bdey;

import java.util.Arrays;

public class twopoints{
	public static void main (String[]args){
		double [][] points = {{ -1, 0, 3},
                {-1, -1, -1},
                {3.5, 2, -1},
                {-1.5, 4, 2},
                {5.5, 4, -0.5}};
		int point1 = 0;
		int point2 = 1;
		double pointDistance = getDistance(points[point1][0], points[point1][1], points[point1][2], points[point2][0], points[point2][1], points[point2][2]);
		
		for(int i = 0; i<points.length; i++){
			for(int j = i+1; j<points.length; j++){
				double x = getDistance(points[i][0], points[i][1], points[i][2], points[j][0], points[j][1], points[j][2]);
				
				if(pointDistance > x){
					pointDistance = x;
					point1 = i;
					point2 = j;
				}
			}
	}
		System.out.println("The two points nearest to each other in 3D space are: " + Arrays.toString(getPoint1(point1, points)) + " and " + Arrays.toString(getPoint2(point2, points)) + "." + " They have a distance of " + pointDistance);
	}
	public static double getDistance(double x1, double y1, double z1, double x2, double y2, double z2){
		return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2) + Math.pow((z2-z1),2));
	}
	public static double[]getPoint1(int m, double[][]r){
		double[]points1 = new double[3];
		points1[0] = r[m][0];
		points1[1] = r[m][1];
		points1[2] = r[m][2];
		return points1;
	}
	public static double[]getPoint2(int m, double[][]r){
		double[]points2 = new double[3];
		points2[0] = r[m][0];
		points2[1] = r[m][1];
		points2[2] = r[m][2];
		return points2;
	}
	
	}
