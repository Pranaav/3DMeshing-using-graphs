
public class Edge implements EdgeInterface {
	Point a;
	Point b;
	LinkedList<Point> l;
	int si;
	int time;
	int visited =0;
//	int component = 0;
	PointInterface[] edge = new PointInterface[2];
	LinkedList<Triangle> triang;
	public Edge(Point a, Point b) {
		this.a = a;
		this.b = b;
		edge[0] = a;
		edge[1] = b;
		l = new LinkedList();
		si = 0;
		triang = new LinkedList();
	}
	@Override
	public PointInterface[] edgeEndPoints() {
		return edge;
	}
	public void addtriang(Triangle val) {
		triang.add(val);
		si++;
	}
//	public void anothtria(Point c) {
//		l.add(c);
////		si++;
//	}
	public int totaltriangle() {
		return si;
	}

	@Override
	public String toString() {
		String s = String.valueOf(a) + String.valueOf(b);
		return s;
	}
	public float length() {
		float len1 = (b.x - a.x);
		len1 = len1*len1;
		float len2 = (b.y - a.y);
		len2 = len2*len2;
		float len3 = (b.z - a.z);
		len3 = len3*len3;
		return len1 + len2 + len3;
	}
}
