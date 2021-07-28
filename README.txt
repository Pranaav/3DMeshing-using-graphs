CLASS POINT -
	- Point is created using the given coordinates and it has methods like compareTo().
	-distance()- calculates the distance betwen two points.

CLASS EDGE-
	- An edge is created using the given two points.
	- length() - returns the length of the edge.
	- neighbour(Point p) - returns the other point of which the edge is made up of.
	- hasPoint()- checks whether the given point is presentg in edge or not.

CLASS TRIANGLE-
	- it creates a triangle using three points and three edges.
	- it has a neighbour array which stores all its neighbours.
	-hasEdge() and hasVertex() return boolean values corresspondingly.


sortPoint(), sortEdge() and sortTriangle() function for sorting the respective arrays. - O(nlogn);

ADD_TRIANGLE()-adds valid triangles to an array. Also adds corresponding points and edges to different arrays - O(stringlength).

BOUNDARY_EDGES()-Each edge has a count variable which checks number of times the edge appears. if count is 1, boundary edges are returned.O(n).

TYPE_MESH()- returns an nteger according to given mesh type. Worst case - O(1).

VERTEX_NEIGHBOR_TRIANGLE()- returns the points of which triangle is made of. O(1).

EDGE_NEIGHBOR_TRIANGLE() - returns the three edges of triangle. O(1).

NEIGHBORS_OF_TRIANGLE() - returns an array of neighbours of the given triangle. Worst case- O(n).

EXTENDED_NEIGHBOR_TRIANGLE() - returns all the triangles having common vertex with the given triangle. Worst case- O(n)

NEIGHBOURS_OF_POINT() - returns all the points sharing common edge. Worst case - O(n)

EDGE_NEIGHBORS_OF_POINT() - returns all the edges of which the given point is part of. Worst case - O(n).

INCIDENT_TRIANGLES() - returns all the triangles having one point as the given point. Worst case - O(n).

FACE_NEIGHBOURS_OF_POINT() - same as INCIDENT_TRIANGLES

TRIANGLE_NEIGHBOUR_OF_EDGE() - returns all the triangles of which the given edge is part of. Worst case - O(n^2).

IS_CONNECTED() - uses dfs functions created above.Worst case - O(n^4).

COUNT_CONNECTED_COMPONENTS - counts the number of componenets using dfs.

CENTROID_OF_COMPONENT - uses dfs functions. Worst case - O(n^3).

CENTROID - returns an array of centroids of all the components. Worst case - O(n^3).

MAXIMUM_DIAMETER - uses bfs functions to calculate diameters of all the components and returns the component with maximum triangles. Worst case - O(n^4).

CLOSEST_COMPONENTS - uses bfs and brute force algorithm. Worst case - O(n^4)