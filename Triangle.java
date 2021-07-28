
public class Triangle implements TriangleInterface, Comparable<Triangle> {
	Point a, b, c;
	Edge ab, bc, ac;
	Point[] triangle = new Point[3];
	int time;
	int visited = 0;
	public Triangle(Point a, Point b, Point c, Edge ab, Edge bc, Edge ac, int time) {
		this.a = a;
		this.b = b;
		this.c = c;
		triangle[0] = a;
		triangle[1] = b;
		triangle[2] = c;
		this.ab = ab;
		this.bc = bc;
		this.ac = ac;
		this.time = time;
	}

	@Override
	public PointInterface[] triangle_coord() {
		return triangle;
	}

	@Override
	public String toString() {
		String s = a.toString() + b.toString() + c.toString();
		return s;
	}

	@Override
	public int compareTo(Triangle o) {
		return (time - o.time);
//		return 0;
	}
	
}
