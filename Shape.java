

public class Shape implements ShapeInterface
{	
	public Trie<Point> pointtri = new Trie();
	public Trie<Triangle> triangtri = new Trie();
	public Trie<Edge> edgetri = new Trie();
	public int time = 0;
	public int mes1 = 0;
	public int mes2 = 0;
	public int mes3 = 0;
//	public int benefitint = 0;
	LinkedList<Edge> edgelist = new LinkedList();
	LinkedList<Point> pointlist = new LinkedList();
	LinkedList<Triangle> trianglelist = new LinkedList();
//	public int allcomponent = 1;
//	public int mes = 2;
	@Override
	public boolean ADD_TRIANGLE(float[] triangle_coord) {
		
		Point a = new Point(triangle_coord[0], triangle_coord[1], triangle_coord[2]);
		Point b = new Point(triangle_coord[3], triangle_coord[4], triangle_coord[5]);
		Point c = new Point(triangle_coord[6], triangle_coord[7], triangle_coord[8]);
//		System.out.println("hello");
		float[] a1 = new float[] {triangle_coord[0] - triangle_coord[3], triangle_coord[1] - triangle_coord[4], triangle_coord[2] - triangle_coord[5]};
	    float[] b1 = new float[] {triangle_coord[3] - triangle_coord[6], triangle_coord[4] - triangle_coord[7], triangle_coord[5] - triangle_coord[8]};
//		Point c1 = new Point(triangle_coord[6] - triangle_coord[0], triangle_coord[7] - triangle_coord[1], triangle_coord[8] - triangle_coord[2]);
//		float cond = a.getX()*((b.getY()*c.getZ()) - (b.getZ()*c.getY()));
//		cond += a.getY()*((b.getZ()*c.getX()) - (b.getX()*c.getZ()));
//		cond += a.getZ()*((b.getX()*c.getY()) - (b.getY()*c.getX()));
//		System.out.println("hello");
	    float check1 = a1[0]*b1[1] - b1[0]*a1[1];
	    float check2 = a1[1]*b1[2] - b1[1]*a1[2];
	    float check3 = a1[0]*b1[2] - b1[2]*a1[0];
	    if((check1<0.0001f&&check1>-0.0001f)&&(check2<0.0001f&&check2>-0.0001f)&&(check3<0.0001f&&check3>-0.0001f)) {
			return false;
		}
		
//		if(x<0.0001f&&x>-0.0001f) {
//			return false;
//		}
		
//		if(x<0.0001f&&x>-0.0001f) {
//			return false;
//		}
		else {
//			benefitint = 0;
//			pointtri.insert(a.toString(), a);
//			pointtri.insert(b.toString(), b);
//			pointtri.insert(c.toString(), c);
//			a.addpoi(b);
//			b.addpoi(c);
//			a.addpoi(c);
//			b.addpoi(a);
//			c.addpoi(b);
//			c.addpoi(b);
//			int comp = 0;
			time++;
			TrieNode<Point> an = pointtri.search(a.toString());
//			System.out.println(a.toString() + "  ");
			TrieNode<Point> bn = pointtri.search(b.toString());
			TrieNode<Point> cn = pointtri.search(c.toString());
			if(an!=null) {
//				System.out.println("hello");
				a = an.val;
				
			}
			else {
				pointtri.insert(a.toString(), a);
				pointlist.add(a);
			}
			if(bn!=null) {
				b = bn.val;
			}
			else {
				pointtri.insert(b.toString(), b);
				pointlist.add(b);
			}
			if(cn!=null) {
				c = cn.val;
			}
			else {
				pointtri.insert(c.toString(), c);
				pointlist.add(c);
			}
			/*if(an!=null) {
				a = an.val;
				if(bn!=null) {
					b = bn.val;
//					pointtri.insert(c.toString(), c);
//					an.val.addpoi(c);
//					bn.val.addpoi(c);
//					c.addpoi(an.val);
//					c.addpoi(bn.val);
				}
				else {
//					pointtri.insert(b.toString(), b);
//					b.addpoi(an.val);
//					an.val.addpoi(b);
					if(cn!=null) {
						c = cn.val;
//						b.addpoi(cn.val);
//						cn.val.addpoi(b);
					}
					else {
//						pointtri.insert(c.toString(), c);
//						c.addpoi(an.val);
//						an.val.addpoi(c);
//						b.addpoi(c);
//						c.addpoi(b);
					}
				}
			}
			else {
//				pointtri.insert(a.toString(), a);
				if(bn!=null) {
					b = bn.val;
					if(cn!=null) {
						c = cn.val;
//						bn.val.addpoi(a);
//						cn.val.addpoi(a);
//						a.addpoi(bn.val);
//						a.addpoi(cn.val);
					}
					else {
//						pointtri.insert(b.toString(), b);
//						pointtri.insert(c.toString(), c);
//						bn.val.addpoi(c);
//						c.addpoi(bn.val);
//						a.addpoi(bn.val);
//						bn.val.addpoi(a);
//						c.addpoi(a);
//						a.addpoi(c);
					}
				}
				else {
//					pointtri.insert(b.toString(), b);
//					a.addpoi(b);
//					b.addpoi(a);
					if(cn!=null) {
						c = cn.val;
//						cn.val.addpoi(b);
//						cn.val.addpoi(a);
//						b.addpoi(cn.val);
//						a.addpoi(cn.val);
					}
					else {
//						pointtri.insert(c.toString(), c);
//						pointtri.insert(c.toString(), c);
//						b.addpoi(c);
//						c.addpoi(b);
//						c.addpoi(a);
//						a.addpoi(c);
					}
				}
			}
			*/
//			Triangle tria = new Triangle(a, b, c);
			
			
			
			// i have to sort point i haven't done it yet;
//			Point u;
//			System.out.println("hello");
			if(a.compareTo(b)<0) {
				if(b.compareTo(c)<0) {
					
				}
				else {
					Point u = b;
					b = c;
					c = u;
					if(a.compareTo(b)<0) {
						
					}
					else {
						Point y = b;
						b = a;
						a = y;
					}
				}
			}
			else {
				Point u = b;
				b = a;
				a = u;
				if(b.compareTo(c)<0) {
					
				}
				else {
					Point y = b;
					b = c;
					c = y;
					if(a.compareTo(b)<0) {
						
					}
					else {
						Point e = b;
						b = a;
						a = e;
					}
				}
			}
//			System.out.println("hello");
			Edge ab = new Edge(a, b);
			Edge bc = new Edge(b, c);
			Edge ac = new Edge(a, c);
			TrieNode<Edge> abn = edgetri.search(ab.toString());
			TrieNode<Edge> bcn = edgetri.search(bc.toString());
			TrieNode<Edge> acn = edgetri.search(ac.toString());
			edgetri.insert(ac.toString(), ac);
			edgetri.insert(bc.toString(), bc);
			edgetri.insert(ab.toString(), ab);
			if(abn!=null) {
				ab = abn.val;
			}
			else {
				edgelist.add(ab);
				a.addpoi(b);
				b.addpoi(a);
			}
			if(bcn!=null) {
				bc = bcn.val;
			}
			else {
				edgelist.add(bc);
				b.addpoi(c);
				c.addpoi(b);
			}
			if(acn!=null) {
				ac = acn.val;
			}
			else {
				a.addpoi(c);
				c.addpoi(a);
				edgelist.add(ac);
			}
//			System.out.println("hello");
			/*if(abn!=null) {
				ab = abn.val;
//				comp = ab.component;
				abn.val.anothtria(c);
				edgelist.add(bc);
				edgelist.add(ac);
//				edgetri.insert(ac.toString(), ac);
//				edgetri.insert(bc.toString(), bc);
			}
			else {
//				edgetri.insert(ab.toString(), ab);
				edgelist.add(ab);
				a.addpoi(b);
//				b.addpoi(c);
//				a.addpoi(c);
				b.addpoi(a);
				pointtri.insert(a.toString(), a);
				pointtri.insert(b.toString(), b);
				if(bcn!=null) {
					bc = bcn.val;
//					comp = bc.component;
					bcn.val.anothtria(a);
					c.addpoi(a);
					a.addpoi(c);
					edgelist.add(ac);
//					edgetri.insert(ac.toString(), ac);
				}
				else {
//					edgetri.insert(bc.toString(), bc);
					edgelist.add(bc);
					b.addpoi(c);
					c.addpoi(b);
					if(acn!=null) {
//						comp = ac.component;
						ac = acn.val;
//						comp = ac.component;
						acn.val.anothtria(b);
					}
					else {
//						edgetri.insert(ac.toString(), ac);
						edgelist.add(ac);
						c.addpoi(a);
						a.addpoi(c);
					}
				}
			}*/
//			System.out.println("hello");
			Triangle tria = new Triangle(a, b, c, ab, bc, ac, time);
			ab.time = time;
			bc.time = time;
			ac.time = time;
			a.addtrian(tria);
			b.addtrian(tria);
			c.addtrian(tria);
			a.addedg(ab);
			b.addedg(bc);
			c.addedg(ac);
			a.addedg(ac);
			b.addedg(ab);
			c.addedg(bc);
			trianglelist.add(tria);
			ab.addtriang(tria);
			bc.addtriang(tria);
			ac.addtriang(tria);
			if(ab.si==1) {
				mes1++;
			}
			else {
				if(ab.si==2) {
//					mes2++;
					mes1--;
				}
				else {
					mes3++;
//					mes2--;
				}
			}
			if(bc.si==1) {
				mes1++;
			}
			else {
				if(bc.si==2) {
//					mes2++;
					mes1--;
				}
				else {
					mes3++;
//					mes2--;
				}
			}
			if(ac.si==1) {
				mes1++;
			}
			else {
				if(ac.si==2) {
//					mes2++;
					mes1--;
				}
				else {
					mes3++;
//					mes2--;
				}
			}
			triangtri.insert(tria.toString(), tria);
//			if(comp==0) {
//				comp = allcomponent;
//				allcomponent++;
//			}
//			ab.component = comp;
//			bc.component = comp;
//			ca.component = comp;
//			edgelist.add(ab);
//			edgelist.add(bc);
//			edgelist.add(ca);
//			edgetri.insert(ab.toString(), ab);
//			edgetri.insert(bc.toString(), bc);
//			edgetri.insert(ca.toString(), ca);
//			System.out.println("hello");
		}
		return true;
	}

	@Override
	public int TYPE_MESH() {
		/*Node<Edge> nedg = edgelist.head;
		int mess = 1;
		while(true) {
			if(nedg==null) {
				return mess;
			}
			else {
				int o = nedg.value.totaltriangle();
				if(o>2) {
					return 3;
				}
//				if(o<1)
			}
		}*/
		if(mes3!=0) {
			return 3;
		}
		if(mes1>0) {
			return 2;
		}
		return 1;
//		return ShapeInterface.super.TYPE_MESH();
	}

	@Override
	public EdgeInterface[] BOUNDARY_EDGES() {
		Node<Edge> ed = edgelist.head;
		LinkedList<Edge> edli = new LinkedList();
		while(ed!=null) {
			if(ed.value.si==1) {
				edli.add(ed.value);
			}
			ed = ed.next;
		}
		
		Edge[] edg = new Edge[edli.size];
		Node<Edge> edl = edli.head;
		for(int i =0;i<edli.size;i++) {
			edg[i] = edl.value;
			edl = edl.next;
		}
		if(edg.length==0) {
			return null;
		}
		Edge[] edg1 = new Edge[edg.length];
		for(int i=0;i<edg.length;i++) {
			edg1[i] = edg[i];
		}
		mersrt1(edg, edg1, 0, edli.size);
		return edg;
	}
	
	private void mersrt1(Edge[] a, Edge[] b, int l, int r) {
//		if (r - l < MARGIN) {
//			insertionsort(a, l, r);
//			return;
//		}
		if(l<r) {
			int med = (l + r) / 2;
			mersrt1(b, a, l, med);
			mersrt1(b, a, med + 1, r);
			int i=l,j=med,k=l;
			while((i<med)&&(j<r)) {
				if(b[i].length()<b[j].length()) {
					a[k] = b[i];
					k++;
					i++;
				}
				else {
					a[k] = b[j];
					k++;
					j++;
				}
			}
			while(i<med) {
				a[k] = b[i];
				k++;
				i++;
			}
			while(j<r) {
				a[k] = b[j];
				k++;
				j++;
			}
		}
		
	}

	@Override
	public int COUNT_CONNECTED_COMPONENTS() {
//		benefitint = 1;
		Node<Triangle> pr = trianglelist.head;
		int y = 0;
		while(pr!=null) {
			Triangle p = pr.value;
			if(p.visited==0) {
				y++;
//				p.visited = 1;
				dfs(p);
			}
			pr = pr.next;
		}
		pr = trianglelist.head;
		while(pr!=null) {
			pr.value.visited = 0;
			pr = pr.next;
		}
		return y;
//		return ShapeInterface.super.COUNT_CONNECTED_COMPONENTS();
	}

	private void dfs(Triangle p) {
		p.visited = 1;
		Node<Triangle> rg = p.ab.triang.head;
		while(rg!=null) {
			if(rg.value.visited==0) {
				dfs(rg.value);
//				rg = rg.next;
			}
			rg = rg.next;
		}
		Node<Triangle> rg1 = p.bc.triang.head;
		while(rg1!=null) {
			if(rg1.value.visited==0) {
				dfs(rg1.value);
			}
			rg1 = rg1.next;
		}
		Node<Triangle> rg2 = p.ac.triang.head;
		while(rg2!=null) {
			if(rg2.value.visited==0) {
				dfs(rg2.value);
			}
			rg2 = rg2.next;
		}
	}

	@Override
	public TriangleInterface[] NEIGHBORS_OF_TRIANGLE(float[] triangle_coord) {
//		Edge
//		Triangle[] tri = new Triangle[];
//		Point a = new Point(triangle_coord[0], triangle_coord[1], triangle_coord[2]);
//		Point b = new Point(triangle_coord[3], triangle_coord[4], triangle_coord[5]);
//		Point c = new Point(triangle_coord[6], triangle_coord[7], triangle_coord[8]);
		
		
		// abhi incomplete h agar same triangle aagayi to;
		
		TrieNode<Point> an = pointtri.search(String.valueOf(triangle_coord[0]) + String.valueOf(triangle_coord[1]) + String.valueOf(triangle_coord[2]));
		TrieNode<Point> bn = pointtri.search(String.valueOf(triangle_coord[3]) + String.valueOf(triangle_coord[4]) + String.valueOf(triangle_coord[5]));
		TrieNode<Point> cn = pointtri.search(String.valueOf(triangle_coord[6]) + String.valueOf(triangle_coord[7]) + String.valueOf(triangle_coord[8]));
		if(an==null||bn==null||cn==null) {
			return null;
		}
		Point a = an.val;
		Point b = bn.val;
		Point c = cn.val;
		if(a.compareTo(b)<0) {
			if(b.compareTo(c)<0) {
				
			}
			else {
				Point u = b;
				b = c;
				c = u;
				if(a.compareTo(c)<0) {
					
				}
				else {
					Point y = c;
					c = a;
					a = y;
				}
			}
		}
		else {
			Point u = b;
			b = a;
			a = u;
			if(b.compareTo(c)<0) {
				
			}
			else {
				Point y = b;
				b = c;
				c = y;
				if(a.compareTo(b)<0) {
					
				}
				else {
					Point e = b;
					b = a;
					a = e;
				}
			}
		}
		
		Edge ab = new Edge(a, b);
		Edge bc = new Edge(b, c);
		Edge ac = new Edge(a, c);
		TrieNode<Edge> abn = edgetri.search(ab.toString());
		TrieNode<Edge> bcn = edgetri.search(bc.toString());
		TrieNode<Edge> acn = edgetri.search(ac.toString());
		if(abn==null||bcn==null||acn==null) {
			return null;
		}
		TrieNode<Triangle> tri = triangtri.search(a.toString() + b.toString() + c.toString());//TODO
		if(tri==null) {
			return null;
		}
		Triangle tr = tri.val;
		ab = abn.val;
		bc = bcn.val;
		ac = acn.val;
		LinkedList<Triangle> abl = ab.triang;
		LinkedList<Triangle> bcl = bc.triang;
		LinkedList<Triangle> acl = ac.triang;
		TriangleInterface[] tre = new TriangleInterface[abl.size + bcl.size + acl.size - 3];
		LinkedList<Triangle> ans = new LinkedList<Triangle>();
		Node<Triangle> na = abl.head;
		Node<Triangle> nb = bcl.head;
		Node<Triangle> nc = acl.head;
		if(na!=null&&na.value==tr) {
			na = na.next;
		}
		if(nb!=null&&nb.value==tr) {
			nb = nb.next;
		}
		if(nc!=null&&nc.value==tr) {
			nc = nc.next;
		}
		int y =0;
		for(int i=0;i<tre.length;i++) {
//			Triangle r;
			if(na!=null&&nb!=null&&nc!=null) {
				if(na.value.compareTo(nb.value)<0) {
					if(na.value.compareTo(nc.value)<0) {
						tre[y] = na.value;
						y++;
						na = na.next;
						if(na!=null&&na.value==tr) {
							na = na.next;
						}
					}
					else {
						tre[y] = nc.value;
						y++;
						nc = nc.next;
						if(nc!=null&&nc.value==tr) {
							nc = nc.next;
						}
					}
				}
				else {
					if(nb.value.compareTo(nc.value)<0) {
						tre[y] = nb.value;
						y++;
						nb = nb.next;
						if(nb!=null&&nb.value==tr) {
							nb = nb.next;
						}
					}
					else {
						tre[y] = nc.value;
						y++;
						nc = nc.next;
						if(nc!=null&&nc.value==tr) {
							nc = nc.next;
						}
					}
				}
			}
			else {
				if(na==null) {
					if(nb==null) {
						tre[y] = nc.value;
						y++;
						nc = nc.next;
						if(nc!=null&&nc.value==tr) {
							nc = nc.next;
						}
					}
					else {
						if(nc==null) {
							tre[y] = nb.value;
							y++;
							nb = nb.next;
							if(nb!=null&&nb.value==tr) {
								nb = nb.next;
							}
						}
						else {
							if(nb.value.compareTo(nc.value)<0) {
								tre[y] = nb.value;
								y++;
								nb = nb.next;
								if(nb!=null&&nb.value==tr) {
									nb = nb.next;
								}
							}
							else {
								tre[y] = nc.value;
								y++;
								nc = nc.next;
								if(nc!=null&&nc.value==tr) {
									nc = nc.next;
								}
							}
						}
					}
				}
				else {
					if(nb==null) {
						if(nc==null) {
							tre[y] = na.value;
							y++;
							na = na.next;
							if(na!=null&&na.value==tr) {
								na = na.next;
							}
						}
						else {
							if(na.value.compareTo(nc.value)<0) {
								tre[y] = na.value;
								y++;
								na = na.next;
								if(na!=null&&na.value==tr) {
									na = na.next;
								}
							}
							else {
								tre[y] = nc.value;
								y++;
								nc = nc.next;
								if(nc!=null&&nc.value==tr) {
									nc = nc.next;
								}
							}
						}
					}
					else {
						if(na.value.compareTo(nb.value)<0) {
							tre[y] = na.value;
							y++;
							na = na.next;
							if(na!=null&&na.value==tr) {
								na = na.next;
							}
						}
						else {
							tre[y] = nb.value;
							y++;
							nb = nb.next;
							if(nb!=null&&nb.value==tr) {
								nb = nb.next;
							}
						}
					}
				}
			}
		}
//		r = bcl.head;
		
//		System.out.println(y);
//		System.out.println(tre.length);
		if(tre.length==0) {
			return null;
		}
		return tre;
	}

	@Override
	public EdgeInterface[] EDGE_NEIGHBOR_TRIANGLE(float[] triangle_coord) {
		Edge[] ed = new Edge[3];
		
		TrieNode<Point> an = pointtri.search(String.valueOf(triangle_coord[0]) + String.valueOf(triangle_coord[1]) + String.valueOf(triangle_coord[2]));
		TrieNode<Point> bn = pointtri.search(String.valueOf(triangle_coord[3]) + String.valueOf(triangle_coord[4]) + String.valueOf(triangle_coord[5]));
		TrieNode<Point> cn = pointtri.search(String.valueOf(triangle_coord[6]) + String.valueOf(triangle_coord[7]) + String.valueOf(triangle_coord[8]));
		if(an==null||bn==null||cn==null) {
			return null;
		}
		Point a = an.val;
		Point b = bn.val;
		Point c = cn.val;
		if(a.compareTo(b)<0) {
			if(b.compareTo(c)<0) {
				
			}
			else {
				Point u = b;
				b = c;
				c = u;
				if(a.compareTo(c)<0) {
					
				}
				else {
					Point y = c;
					c = a;
					a = y;
				}
			}
		}
		else {
			Point u = b;
			b = a;
			a = u;
			if(b.compareTo(c)<0) {
				
			}
			else {
				Point y = b;
				b = c;
				c = y;
				if(a.compareTo(b)<0) {
					
				}
				else {
					Point e = b;
					b = a;
					a = e;
				}
			}
		}
		TrieNode tr = triangtri.search(a.toString() + b.toString() + c.toString());
//		if(tr==null) {
//			return null;
//		}
		
		Edge ab = new Edge(a, b);
		Edge bc = new Edge(b, c);
		Edge ac = new Edge(a, c);
		TrieNode<Edge> abn = edgetri.search(ab.toString());
		TrieNode<Edge> bcn = edgetri.search(bc.toString());
		TrieNode<Edge> acn = edgetri.search(ac.toString());
		if(abn==null||bcn==null||acn==null) {
			return null;
		}
		ab = abn.val;
		bc = bcn.val;
		ac = acn.val;
	    ed[0] = ab;
	    ed[1] = bc;
	    ed[2] = ac;
	    return ed;
//		return ShapeInterface.super.EDGE_NEIGHBOR_TRIANGLE(triangle_coord);
	}

	@Override
	public PointInterface[] VERTEX_NEIGHBOR_TRIANGLE(float[] triangle_coord) {
		
		Point[] ed = new Point[3];
		
		TrieNode<Point> an = pointtri.search(String.valueOf(triangle_coord[0]) + String.valueOf(triangle_coord[1]) + String.valueOf(triangle_coord[2]));
		TrieNode<Point> bn = pointtri.search(String.valueOf(triangle_coord[3]) + String.valueOf(triangle_coord[4]) + String.valueOf(triangle_coord[5]));
		TrieNode<Point> cn = pointtri.search(String.valueOf(triangle_coord[6]) + String.valueOf(triangle_coord[7]) + String.valueOf(triangle_coord[8]));
		if(an==null||bn==null||cn==null) {
//			System.out.println("hh");
			return null;
		}
		Point a = an.val;
		Point b = bn.val;
		Point c = cn.val;
		if(a.compareTo(b)<0) {
			if(b.compareTo(c)<0) {
				
			}
			else {
				Point u = b;
				b = c;
				c = u;
				if(a.compareTo(c)<0) {
					
				}
				else {
					Point y = c;
					c = a;
					a = y;
				}
			}
		}
		else {
			Point u = b;
			b = a;
			a = u;
			if(b.compareTo(c)<0) {
				
			}
			else {
				Point y = b;
				b = c;
				c = y;
				if(a.compareTo(b)<0) {
					
				}
				else {
					Point e = b;
					b = a;
					a = e;
				}
			}
		}
		TrieNode tr = triangtri.search(a.toString() + b.toString() + c.toString());
//		if(tr==null) {
//			return null;
//		}
		ed[0] = a;
		ed[1] = b;
		ed[2] = c;
		
		return ed;
	}

	@Override
	public TriangleInterface[] EXTENDED_NEIGHBOR_TRIANGLE(float[] triangle_coord) {
		
		
		TrieNode<Point> an = pointtri.search(String.valueOf(triangle_coord[0]) + String.valueOf(triangle_coord[1]) + String.valueOf(triangle_coord[2]));
		TrieNode<Point> bn = pointtri.search(String.valueOf(triangle_coord[3]) + String.valueOf(triangle_coord[4]) + String.valueOf(triangle_coord[5]));
		TrieNode<Point> cn = pointtri.search(String.valueOf(triangle_coord[6]) + String.valueOf(triangle_coord[7]) + String.valueOf(triangle_coord[8]));
		if(an==null||bn==null||cn==null) {
			return null;
		}
		Point a = an.val;
		Point b = bn.val;
		Point c = cn.val;
		if(a.compareTo(b)<0) {
			if(b.compareTo(c)<0) {
				
			}
			else {
				Point u = b;
				b = c;
				c = u;
				if(a.compareTo(c)<0) {
					
				}
				else {
					Point y = c;
					c = a;
					a = y;
				}
			}
		}
		else {
			Point u = b;
			b = a;
			a = u;
			if(b.compareTo(c)<0) {
				
			}
			else {
				Point y = b;
				b = c;
				c = y;
				if(a.compareTo(b)<0) {
					
				}
				else {
					Point e = b;
					b = a;
					a = e;
				}
			}
		}
		TrieNode<Triangle> tr = triangtri.search(a.toString() + b.toString() + c.toString());
		if(tr==null) {
			return null;
		}
		
		Edge ab = new Edge(a, b);
		Edge bc = new Edge(b, c);
		Edge ac = new Edge(a, c);
		TrieNode<Edge> abn = edgetri.search(ab.toString());
		TrieNode<Edge> bcn = edgetri.search(bc.toString());
		TrieNode<Edge> acn = edgetri.search(ac.toString());
		if(abn==null||bcn==null||acn==null) {
			return null;
		}
		ab = abn.val;
		bc = bcn.val;
		ac = acn.val;
//		LinkedList<Triangle> lk = new LinkedList();
		Triangle[] tri = new Triangle[a.trl.size() + b.trl.size() + c.trl.size() - 3];
		Node<Triangle> tr1 = a.trl.head;
		int y = 0;
		for(int i=0;i<a.trl.size;i++) {
			if(tr1.value.compareTo(tr.val)!=0) {
				tri[y] = tr1.value;
//				lk.add(tr1.value);
				y++;
//				tr1 = tr1.next;
			}
			tr1 = tr1.next;
		}
		tr1 = b.trl.head;
		for(int i=0;i<b.trl.size;i++) {
			if(tr1.value.compareTo(tr.val)!=0) {
				tri[y] = tr1.value;
				y++;
				
//				tr1 = tr1.next;
			}
			tr1 = tr1.next;
		}
		tr1 = c.trl.head;
		for(int i=0;i<c.trl.size;i++) {
			if(tr1.value.compareTo(tr.val)!=0) {
				tri[y] = tr1.value;
				y++;
//				tr1 = tr1.next;
			}
			tr1 = tr1.next;
		}
		Triangle[] ty = new Triangle[tri.length];
		for(int i=0;i<ty.length;i++) {
			ty[i] = tri[i];
		}
		mersrt1(tri, ty, 0, y);
		LinkedList<Triangle> p12 = new LinkedList();
		for(int i=0;i<y-1;i++) {
			if(tri[i]!=null&&tri[i]!=tri[i+1]) {
				p12.add(tri[i]);
			}
		}
		if(tri.length!=0) {
			p12.add(tri[y-1]);
		}
		tri = new Triangle[p12.size];
		Node<Triangle> pr = p12.head;
		for(int i=0;i<p12.size;i++) {
			tri[i] = pr.value;
			pr = pr.next;
		}
		if(tri.length==0) {
			return null;
		}
		return tri;
	}
	
	private void mersrt1(Triangle[] a, Triangle[] b, int l, int r) {
//		if (r - l < MARGIN) {
//			insertionsort(a, l, r);
//			return;
//		}
		if(l<r) {
			int med = (l + r) / 2;
			mersrt1(b, a, l, med);
			mersrt1(b, a, med + 1, r);
			int i=l,j=med,k=l;
			while((i<med)&&(j<r)) {
				if(b[i].compareTo(b[j])>0) {
					a[k] = b[i];
					k++;
					i++;
				}
				else {
					a[k] = b[j];
					k++;
					j++;
				}
			}
			while(i<med) {
				a[k] = b[i];
				k++;
				i++;
			}
			while(j<r) {
				a[k] = b[j];
				k++;
				j++;
			}
		}
		
	}

	@Override
	public TriangleInterface[] INCIDENT_TRIANGLES(float[] point_coordinates) {
		
		TrieNode<Point> an = pointtri.search(String.valueOf(point_coordinates[0]) + String.valueOf(point_coordinates[1]) + String.valueOf(point_coordinates[2]));
		if(an==null) {
			return null;
		}
		Triangle[] tr = new Triangle[an.val.trl.size];
		Node<Triangle> nl = an.val.trl.head;
		for(int i=0;i<tr.length;i++) {
			tr[i] = nl.value;
			nl = nl.next;
		}
		if(tr.length==0) {
			return null;
		}
		return tr;
//		return ShapeInterface.super.INCIDENT_TRIANGLES(point_coordinates);
	}

	@Override
	public PointInterface[] NEIGHBORS_OF_POINT(float[] point_coordinates) {
		
		TrieNode<Point> an = pointtri.search(String.valueOf(point_coordinates[0]) + String.valueOf(point_coordinates[1]) + String.valueOf(point_coordinates[2]));
		if(an==null) {
			return null;
		}
		Point[] tr = new Point[an.val.l.size];
		Node<Point> nl = an.val.l.head;
		for(int i=0;i<tr.length;i++) {
			tr[i] = nl.value;
			nl = nl.next;
		}
		if(tr.length==0) {
			return null;
		}
		return tr;
//		return ShapeInterface.super.NEIGHBORS_OF_POINT(point_coordinates);
	}

	@Override
	public EdgeInterface[] EDGE_NEIGHBORS_OF_POINT(float[] point_coordinates) {
		
		TrieNode<Point> an = pointtri.search(String.valueOf(point_coordinates[0]) + String.valueOf(point_coordinates[1]) + String.valueOf(point_coordinates[2]));
		if(an==null) {
			return null;
		}
		Edge[] tr = new Edge[an.val.edl.size];
		Node<Edge> nl = an.val.edl.head;
		for(int i=0;i<tr.length;i++) {
			tr[i] = nl.value;
			nl = nl.next;
		}
		if(tr.length==0) {
			return null;
		}
		return tr;
//		return ShapeInterface.super.EDGE_NEIGHBORS_OF_POINT(point_coordinates);
	}

	@Override
	public TriangleInterface[] FACE_NEIGHBORS_OF_POINT(float[] point_coordinates) {
		TrieNode<Point> an = pointtri.search(String.valueOf(point_coordinates[0]) + String.valueOf(point_coordinates[1]) + String.valueOf(point_coordinates[2]));
		
		if(an==null) {
			return null;
		}
		Triangle[] tr = new Triangle[an.val.trl.size];
		Node<Triangle> nl = an.val.trl.head;
		for(int i=0;i<tr.length;i++) {
			tr[i] = nl.value;
			nl = nl.next;
		}
		if(tr.length==0) {
			return null;
		}
		return tr;
		
//		return ShapeInterface.super.FACE_NEIGHBORS_OF_POINT(point_coordinates);
	}

	@Override
	public boolean IS_CONNECTED(float[] triangle_coord_1, float[] triangle_coord_2) {
		TrieNode<Point> an = pointtri.search(String.valueOf(triangle_coord_1[0]) + String.valueOf(triangle_coord_1[1]) + String.valueOf(triangle_coord_1[2]));
		TrieNode<Point> bn = pointtri.search(String.valueOf(triangle_coord_1[3]) + String.valueOf(triangle_coord_1[4]) + String.valueOf(triangle_coord_1[5]));
		TrieNode<Point> cn = pointtri.search(String.valueOf(triangle_coord_1[6]) + String.valueOf(triangle_coord_1[7]) + String.valueOf(triangle_coord_1[8]));
		if(an==null||bn==null||cn==null) {
//			System.out.println("hiu");
			return false;
		}
		Point a = an.val;
		Point b = bn.val;
		Point c = cn.val;
		if(a.compareTo(b)<0) {
			if(b.compareTo(c)<0) {
				
			}
			else {
				Point u = b;
				b = c;
				c = u;
				if(a.compareTo(c)<0) {
					
				}
				else {
					Point y = c;
					c = a;
					a = y;
				}
			}
		}
		else {
			Point u = b;
			b = a;
			a = u;
			if(b.compareTo(c)<0) {
				
			}
			else {
				Point y = b;
				b = c;
				c = y;
				if(a.compareTo(b)<0) {
					
				}
				else {
					Point e = b;
					b = a;
					a = e;
				}
			}
		}
		
		Edge ab = new Edge(a, b);
		Edge bc = new Edge(b, c);
		Edge ac = new Edge(a, c);
		TrieNode<Edge> abn = edgetri.search(ab.toString());
		TrieNode<Edge> bcn = edgetri.search(bc.toString());
		TrieNode<Edge> acn = edgetri.search(ac.toString());
		if(abn==null||bcn==null||acn==null) {
//			System.out.println("hiu");
			return false;
		}
		TrieNode<Triangle> tr = triangtri.search(a.toString() + b.toString() + c.toString());
		if(tr==null) {
//			System.out.println("hiu");
			return false;
		}
		
		TrieNode<Point> an2 = pointtri.search(String.valueOf(triangle_coord_2[0]) + String.valueOf(triangle_coord_2[1]) + String.valueOf(triangle_coord_2[2]));
		TrieNode<Point> bn2 = pointtri.search(String.valueOf(triangle_coord_2[3]) + String.valueOf(triangle_coord_2[4]) + String.valueOf(triangle_coord_2[5]));
		TrieNode<Point> cn2 = pointtri.search(String.valueOf(triangle_coord_2[6]) + String.valueOf(triangle_coord_2[7]) + String.valueOf(triangle_coord_2[8]));
		if(an2==null||bn2==null||cn2==null) {
			return false;
		}
		Point a2 = an2.val;
		Point b2 = bn2.val;
		Point c2 = cn2.val;
		if(a2.compareTo(b2)<0) {
			if(b2.compareTo(c2)<0) {
				
			}
			else {
				Point u = b2;
				b2 = c2;
				c2 = u;
				if(a2.compareTo(c2)<0) {
					
				}
				else {
					Point y = c2;
					c2 = a2;
					a2 = y;
				}
			}
		}
		else {
			Point u = b;
			b2 = a2;
			a2 = u;
			if(b2.compareTo(c2)<0) {
				
			}
			else {
				Point y = b2;
				b2 = c2;
				c2 = y;
				if(a2.compareTo(b2)<0) {
					
				}
				else {
					Point e = b2;
					b2 = a2;
					a2 = e;
				}
			}
		}
		
		Edge ab2 = new Edge(a2, b2);
		Edge bc2 = new Edge(b2, c2);
		Edge ac2 = new Edge(a2, c2);
		TrieNode<Edge> abn2 = edgetri.search(ab2.toString());
		TrieNode<Edge> bcn2 = edgetri.search(bc2.toString());
		TrieNode<Edge> acn2 = edgetri.search(ac2.toString());
		if(abn==null||bcn==null||acn==null) {
			return false;
		}
		TrieNode<Triangle> tr2 = triangtri.search(a2.toString() + b2.toString() + c2.toString());
		if(tr2==null) {
			return false;
		}
//		System.out.println("hiu");
		boolean bo = dfs1(tr.val, tr2.val);
		Node<Triangle> pr = trianglelist.head;
		while(pr!=null) {
			pr.value.visited = 0;
			pr = pr.next;
		}
		
		return bo;
		
//		return ShapeInterface.super.IS_CONNECTED(triangle_coord_1, triangle_coord_2);
	}

	private boolean dfs1(Triangle p, Triangle tr2) {
		p.visited = 1;
		if(p.compareTo(tr2)==0) {
			return true;
		}
		Node<Triangle> rg = p.ab.triang.head;
		while(rg!=null) {
			if(rg.value.visited==0) {
				if(rg.value.compareTo(tr2)==0) {
					return true;
				}
				if(dfs1(rg.value, tr2)) {
					return true;
				}
//				rg = rg.next;
			}
			rg = rg.next;
		}
		Node<Triangle> rg1 = p.bc.triang.head;
		while(rg1!=null) {
			if(rg1.value.visited==0) {
				if(rg1.value.compareTo(tr2)==0) {
					return true;
				}
				if(dfs1(rg1.value, tr2)) {
					return true;
				}
//				rg1 = rg1.next;
			}
			rg1 = rg1.next;
		}
		Node<Triangle> rg2 = p.ac.triang.head;
		while(rg2!=null) {
			if(rg2.value.visited==0) {
				if(rg2.value.compareTo(tr2)==0) {
					return true;
				}
				if(dfs1(rg2.value, tr2)) {
					return true;
				}
//				rg2 = rg2.next;
			}
			rg2 = rg2.next;
		}
		return false;
	}

	@Override
	public TriangleInterface[] TRIANGLE_NEIGHBOR_OF_EDGE(float[] edge_coordinates) {
		
		TrieNode<Point> an = pointtri.search(String.valueOf(edge_coordinates[0]) + String.valueOf(edge_coordinates[1]) + String.valueOf(edge_coordinates[2]));
		TrieNode<Point> bn = pointtri.search(String.valueOf(edge_coordinates[3]) + String.valueOf(edge_coordinates[4]) + String.valueOf(edge_coordinates[5]));
		if(an==null||bn==null) {
			return null;
		}
		Point a = an.val;
		Point b = bn.val;
		if(a.compareTo(b)>0) {
			Point u = b;
			b = a;
			a = u;
		}
		TrieNode<Edge> abn = edgetri.search(a.toString() + b.toString());
		if(abn==null) {
			return null;
		}
		Triangle[] trili = new Triangle[abn.val.triang.size];
		Node<Triangle> nr = abn.val.triang.head;
		int i = 0;
		while(nr!=null) {
			trili[i] = nr.value;
			nr = nr.next;
			i++;
		}
		if(trili.length==0) {
			return null;
		}
		return trili;
	}

	@Override
	public int MAXIMUM_DIAMETER() {
//		int ans = 0;
		
		Node<Triangle> pr1 = trianglelist.head;
		
		int y = 0;
		LinkedList<Triangle> tr2 = new LinkedList();
		while(pr1!=null) {
			LinkedList<Triangle> tr = new LinkedList();
			Triangle p = pr1.value;
			if(p.visited==0) {
				y++;
//				p.visited = 1;
				dfs10(tr, p);
			}
			if(tr.size>tr2.size) {
				tr2 = tr;
			}
			pr1 = pr1.next;
		}
//		System.out.println("ken" + tr2.size);
		
		Node<Triangle> pr = tr2.head;
		while(pr!=null) {
			pr.value.visited = 0;
			pr = pr.next;
		}
		pr = tr2.head;
		int dia = 0;
		while(pr!=null) {
			Triangle tr = pr.value;
			Node<Triangle> pr2 = tr2.head;
			while(pr2!=null) {
				pr2.value.visited = 0;
				pr2 = pr2.next;
			}
			int depth=-1;
			tr.visited = 1;
			Queue<Triangle> queu = new Queue<Triangle>();
			queu.enqueue(tr);
			while(!queu.isEmpty()) {
				Queue<Triangle> queu2 = new Queue<Triangle>();
				
				while(!queu.isEmpty()) {
					Triangle tr1 = queu.dequeue();
					Edge[] edges = new Edge[] {tr1.ab,tr1.bc,tr1.ac};
					for (int i = 0; i < edges.length; i++) {
						Node<Triangle> rg = edges[i].triang.head;
						while(rg!=null) {
							if(rg.value.visited==0) {
								rg.value.visited = 1;
								queu2.enqueue(rg.value);
							}
							rg = rg.next;
						}
					}
				}
				queu=queu2;
				
				depth++;
			}
			if(depth>dia) {
				dia=depth;
			}
			pr=pr.next;
		}
		return dia;
	}
	private void dfs10(LinkedList<Triangle> tr, Triangle p) {
		p.visited = 1;
		tr.add(p);
//		System.out.println(tr.size);
		Node<Triangle> rg = p.ab.triang.head;
		while(rg!=null) {
			if(rg.value.visited==0) {
				dfs10(tr, rg.value);
//				rg = rg.next;
			}
			rg = rg.next;
		}
		Node<Triangle> rg1 = p.bc.triang.head;
		while(rg1!=null) {
			if(rg1.value.visited==0) {
				dfs10(tr, rg1.value);
			}
			rg1 = rg1.next;
		}
		Node<Triangle> rg2 = p.ac.triang.head;
		while(rg2!=null) {
			if(rg2.value.visited==0) {
				dfs10(tr, rg2.value);
			}
			rg2 = rg2.next;
		}
	}
//	private int dfs5(Triangle value, Triangle value2) {
//		
//		return 0;
//	}
//
//	private void dfs4(Triangle p, LinkedList<Triangle> tr2) {
//		tr2.add(p);
//		p.visited = 1;
//		Node<Triangle> rg = p.ab.triang.head;
//		while(rg!=null) {
//			if(rg.value.visited==0) {
//				dfs4(rg.value, tr2);
////				rg = rg.next;
//			}
//			rg = rg.next;
//		}
//		Node<Triangle> rg1 = p.bc.triang.head;
//		while(rg1!=null) {
//			if(rg1.value.visited==0) {
//				dfs4(rg1.value, tr2);
//			}
//			rg1 = rg1.next;
//		}
//		Node<Triangle> rg2 = p.ac.triang.head;
//		while(rg2!=null) {
//			if(rg2.value.visited==0) {
//				dfs4(rg2.value, tr2);
//			}
//			rg2 = rg2.next;
//		}
//	}
	

	@Override
	public PointInterface[] CENTROID() {
		
		Node<Triangle> pr = trianglelist.head;
		while(pr!=null) {
			pr.value.visited = 0;
			pr = pr.next;
		}
		pr = trianglelist.head;
		int y = 0;
		LinkedList<Float[]> list = new LinkedList();
		while(pr!=null) {
			Triangle p = pr.value;
			if(p.visited==0) {
				Float[] cen = new Float[3];
				Float si[] = new Float[1];
				cen[0] = (float) 0;
				cen[1] = (float) 0;
				cen[2] = (float) 0;
				si[0] = (float) 0;
				y++;
//				p.visited = 1;
				cen[0] += p.a.x + p.b.x + p.c.x;
				cen[1] += p.a.y + p.b.y + p.c.y;
				cen[2] += p.a.z + p.b.z + p.c.z;
				si[0] += 3;
//				System.out.println(cen[0]);
				dfs3(p, cen, si);
				cen[0] = cen[0]/si[0];
				cen[1] = cen[1]/si[0];
				cen[2] = cen[2]/si[0];
				list.add(cen);
			}
			pr = pr.next;
		}
		pr = trianglelist.head;
		while(pr!=null) {
			pr.value.visited = 0;
			pr = pr.next;
		}
		Point[] lis = new Point[list.size()];
		Node<Float[]> fr = list.head;
		for(int i=0;i<list.size;i++) {
			Point r = new Point(fr.value[0], fr.value[1], fr.value[2]);
			lis[i] = r;
			fr = fr.next;
		}
		Point[] lis1 = new Point[lis.length];
		for(int i=0;i<lis.length;i++) {
			lis1[i] = lis[i];
		}
		if(lis.length==0) {
			return null;
		}
		mersrt2(lis, lis1, 0, lis.length);
		return lis;
	}
	
	private void mersrt2(Point[] a, Point[] b, int l, int r) {
//		if (r - l < MARGIN) {
//			insertionsort(a, l, r);
//			return;
//		}
		if(l<r) {
			int med = (l + r) / 2;
			mersrt2(b, a, l, med);
			mersrt2(b, a, med + 1, r);
			int i=l,j=med,k=l;
			while((i<med)&&(j<r)) {
				if(b[i].compareTo(b[j])<0) {
					a[k] = b[i];
					k++;
					i++;
				}
				else {
					a[k] = b[j];
					k++;
					j++;
				}
			}
			while(i<med) {
				a[k] = b[i];
				k++;
				i++;
			}
			while(j<r) {
				a[k] = b[j];
				k++;
				j++;
			}
		}
		
	}
	
	private void dfs3(Triangle p, Float[] cen, Float[] si) {
		p.visited = 1;
//		cen[0] += p.a.x + p.b.x + p.c.x;
//		cen[1] += p.a.y + p.b.y + p.c.y;
//		cen[2] += p.a.z + p.b.z + p.c.z;
//		si[0]++;
		Node<Triangle> rg = p.ab.triang.head;
		while(rg!=null) {
			if(rg.value.visited==0) {
				cen[0] += rg.value.a.x + rg.value.b.x + rg.value.c.x;
				cen[1] += rg.value.a.y + rg.value.b.y + rg.value.c.y;
				cen[2] += rg.value.a.z + rg.value.b.z + rg.value.c.z;
				si[0] += 3;
				dfs3(rg.value, cen, si);
//				rg = rg.next;
			}
			rg = rg.next;
		}
		Node<Triangle> rg1 = p.bc.triang.head;
		while(rg1!=null) {
			if(rg1.value.visited==0) {
				cen[0] += rg1.value.a.x + rg1.value.b.x + rg1.value.c.x;
				cen[1] += rg1.value.a.y + rg1.value.b.y + rg1.value.c.y;
				cen[2] += rg1.value.a.z + rg1.value.b.z + rg1.value.c.z;
				si[0] += 3;
				dfs3(rg1.value, cen, si);
			}
			rg1 = rg1.next;
		}
		Node<Triangle> rg2 = p.ac.triang.head;
		while(rg2!=null) {
			if(rg2.value.visited==0) {
				cen[0] += rg2.value.a.x + rg2.value.b.x + rg2.value.c.x;
				cen[1] += rg2.value.a.y + rg2.value.b.y + rg2.value.c.y;
				cen[2] += rg2.value.a.z + rg2.value.b.z + rg2.value.c.z;
				si[0] += 3;
				dfs3(rg2.value, cen, si);
			}
			rg2 = rg2.next;
		}
	}
	
	
	@Override
	public PointInterface CENTROID_OF_COMPONENT(float[] point_coordinates) {
		
		TrieNode<Point> an = pointtri.search(String.valueOf(point_coordinates[0]) + String.valueOf(point_coordinates[1]) + String.valueOf(point_coordinates[2]));
		if(an==null) {
			return null;
		}
		Triangle tr = an.val.trl.head.value;
		
		Float[] cen = new Float[3];
		Float[] si = new Float[1];
		cen[0] = (float) 0;
		cen[1] = (float) 0;
		cen[2] = (float) 0;
		si[0] = (float) 0;
		cen[0] += tr.a.x + tr.b.x + tr.c.x;
		cen[1] += tr.a.y + tr.b.y + tr.c.y;
		cen[2] += tr.a.z + tr.b.z + tr.c.z;
		si[0] += 3;
//		p.visited = 1;
		dfs3(tr, cen, si);
		cen[0] = cen[0]/si[0];
		cen[1] = cen[1]/si[0];
		cen[2] = cen[2]/si[0];
		Point a = new Point(cen[0], cen[1], cen[2]);
		Node<Triangle> tr1 = an.val.trl.head;
		while(tr1!=null) {
			tr1.value.visited = 0;
			tr1 = tr1.next;
		}
		return a;
	}

	@Override
	public PointInterface[] CLOSEST_COMPONENTS() {
		Node<Point> pr1 = pointlist.head;
		int u = 0;
		Point qw = null;
		Point qwe = null;
		float p = -1;
		while(pr1!=null) {
			Node<Point> pr2 = pointlist.head;
			while(pr2!=null) {
				Node<Triangle> nodpr1 = pr1.value.trl.head;
				while(nodpr1!=null) {
					Node<Triangle> nodpr2 = pr2.value.trl.head;
					while(nodpr2!=null) {
						if(!dfs1(nodpr1.value, nodpr2.value)) {
							float x = pr1.value.length(pr2.value);
							if(p>x||p==-1) {
								p = x;
								qw = pr1.value;
								qwe = pr2.value;
							}
							if(p==0) {
								Point[] pol = new Point[2];
								pol[0] = qw;
								pol[1] = qwe;
								return pol;
							}
						}
						nodpr2 = nodpr2.next;
					}
					nodpr1 = nodpr1.next;
				}
				pr2 = pr2.next;
			}
			pr1 = pr1.next;
		}
		Point[] pol1 = new Point[2];
		pol1[0] = qw;
		pol1[1] = qwe;
		return pol1;
	}
	

}

