import static org.junit.Assert.*;

import org.junit.Test;

public class test3DSolution {

	@Test
	public void testDivisleBy3() {
		Point3DSolution solution = new Point3DSolution();
		
		Point3D point3d1 = new Point3D(0, 5, 1);
		Point3D point3d2 = new Point3D(1, 4, 2);
		Point3D point3d3 = new Point3D(2, 3, 5);
		Point3D point3d4 = new Point3D(3, 2, 3);
		Point3D point3d5 = new Point3D(4, 1, -2);
		Point3D point3d6 = new Point3D(5, 0, -1);
		
		Point3D[] a = {point3d1, point3d2, point3d3, point3d4, point3d5, point3d6};
		
		assertEquals(4, solution.solution(a));
	}
	
}

