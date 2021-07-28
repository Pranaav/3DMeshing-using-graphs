
public class Point implements PointInterface, Comparable<Point> {
	float x;
	float y;
	float z;
	LinkedList<Point> l;
	LinkedList<Triangle> trl;
	LinkedList<Edge> edl;
	int visited = 0;
	public Point(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
		l = new LinkedList<Point>();
		trl = new LinkedList<Triangle>();
		edl = new LinkedList<Edge>();
	}

	@Override
	public float getX() {
		return x;
	}

	@Override
	public float getY() {
		return y;
	}

	@Override
	public float getZ() {
		return z;
	}

	@Override
	public float[] getXYZcoordinate() {
		float[] d = new float[3];
		d[0] = x;
		d[1] = y;
		d[2] = z;
		return d;
	}

	@Override
	public String toString() {
//		float x1 = Math.round(x*1000)/1000;
//		float y1 = Math.round(y*1000)/1000;
//		float z1 = Math.round(z*1000)/1000;
		String s = String.valueOf(x) + String.valueOf(y) + String.valueOf(z);
		return s;
	}
	
	public void addpoi(Point poi) {
		l.add(poi);
//		System.out.println(this+" "+poi+" "+l.size);
	}
	public void addtrian(Triangle tr) {
		trl.add(tr);
	}
	public void addedg(Edge ed) {
		edl.add(ed);
	}

	@Override
	public int compareTo(Point o) {
		float u = x - o.x;
		if(u==0) {
			u = y - o.y;
			if(u==0) {
				u = z - o.z;
			}
		}
		if(u>0) {
			return 1;
		}
		else {
			if(u<0) {
				return -1;
			}
			else {
				return 0;
			}
		}
	}
	
	public float length(Point b) {
		float len1 = (b.x - x);
		len1 = len1*len1;
		float len2 = (b.y - y);
		len2 = len2*len2;
		float len3 = (b.z - z);
		len3 = len3*len3;
		return len1 + len2 + len3;
	}
	
}
