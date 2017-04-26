import java.util.HashSet;
import java.util.Set;

class Point3DSolution { 

	public int solution(Point3D[] a) {
		
		Set<Integer> squareRadius = new HashSet<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			Point3D point3d = a[i];
			
			int x = point3d.x * point3d.x;
			int y = point3d.y * point3d.y;
			int z = point3d.z * point3d.z;
			
			int squareRadiu = x + y + z;
			
			System.out.println("squareRadiu of " + point3d.x + ", " + point3d.y + " and " + point3d.z + " are " + squareRadiu);
			
			squareRadius.add(squareRadiu);	
			System.out.println("Squareradius size" + squareRadius.size());
		}
			
		
		return squareRadius.size();
	}

}
