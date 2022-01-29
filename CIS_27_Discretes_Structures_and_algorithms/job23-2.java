import java.util.ArrayList;

class ass15 {

	static class node implements Comparable<node>{
		private char data;
		ArrayList<node> neighbors;
		ArrayList<Integer> distances;
		private boolean visited;
		private int distance;

		node(char data)
		{
			this.data=data;
			this.neighbors=new ArrayList<>();
			this.distances=new ArrayList<>();
			this.visited=false;
			this.distance=Integer.MAX_VALUE;
		}

		public char getData() {
			return data;
		}

		public void setData(char data) {
			this.data = data;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return Character.toString(data)+" "+getDistance()+" ";
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			if(obj==null)
				return false;
			node n=(node) obj;
			return n.getData()==this.data;
		}

		@Override
		public int compareTo(ass14.node arg0) {
			// TODO Auto-generated method stub
			return Character.compare(this.data, arg0.getData());
		}

		public boolean addEdge(node n,int distance)
		{
			if(!neighbors.contains(n)){
				neighbors.add(n);
				distances.add(distance);
				return true;
			}
			else
				return false;		
		}

		public boolean isVisited() {
			return visited;
		}

		public void setVisited(boolean visited) {
			this.visited = visited;
		}

		public void setDistance(int distance) {
			this.distance = distance;
		}

		public int getDistance() {
			return distance;
		}

	}
	
	public static node[] dijkstra(node nodes[],int index,node...parents)
	{
		nodes[index].setVisited(true);
		for (int i = 0; i < parents.length; i++)
			System.out.print(nodes[i]+" |");
		System.out.println();
		for (int i = 0; i < nodes[index].neighbors.size(); i++)
			if(nodes[index].neighbors.get(i).getDistance()>nodes[index].distances.get(i)+nodes[index].getDistance()){
				nodes[index].neighbors.get(i).setDistance(nodes[index].distances.get(i)+nodes[index].getDistance());
				parents[nodes[index].neighbors.get(i).getData()-'A']=nodes[index];
			}
		for (node n : nodes[index].neighbors)
			dijkstra(nodes, n.getData()-'A', parents);
		return parents;
	}

	public static node[] bellmanFord(node nodes[])
	{
		node[] parents=new node[10];
		parents[0]=nodes[0];
		for (int k = 0; k < parents.length-1; k++){
			for (int i = 0; i < nodes.length; i++) {
				for (int j = 0; j < nodes[i].distances.size(); j++)
					if( nodes[i].getDistance()!=Integer.MAX_VALUE && nodes[i].getDistance()+nodes[i].distances.get(j) < nodes[nodes[i].neighbors.get(j).getData()-'A'].getDistance()){
						nodes[nodes[i].neighbors.get(j).getData()-'A'].setDistance(nodes[i].getDistance()+nodes[i].distances.get(j));
						parents[nodes[i].neighbors.get(j).getData()-'A']=nodes[i];
					}
					for (int j = 0; j < parents.length; j++)
						System.out.print(nodes[j]+" |");
					System.out.println();
			}
			System.out.println();
		}
		return parents;
	}

	public static void main(String[] args) {
		node[] nodes=new node[10];
		for (int i = 0; i < 10; i++)
			nodes[i]=new node((char)('A'+i));
		nodes[0].setDistance(0);
		
		nodes[0].addEdge(nodes[1], 4);
		nodes[0].addEdge(nodes[2], -2);
		nodes[1].addEdge(nodes[8], -4);
		nodes[1].addEdge(nodes[6], -2);
		nodes[2].addEdge(nodes[3], 2);
		nodes[2].addEdge(nodes[5], 1);
		nodes[4].addEdge(nodes[5], -2);
		nodes[4].addEdge(nodes[8], 3);
		nodes[5].addEdge(nodes[3], 3);
		nodes[6].addEdge(nodes[7], -1);
		nodes[7].addEdge(nodes[8], 1);
		nodes[8].addEdge(nodes[6], 1);
		nodes[9].addEdge(nodes[0], 7);
		nodes[9].addEdge(nodes[2], 6);
		nodes[9].addEdge(nodes[5], 5);
		nodes[9].addEdge(nodes[4], 6);

		/*
		node[] parents=dijkstra(nodes, 0,nodes[0],null,null,null,null,null,null,null,null,null,null,null);
		int sum=0;
		for (int i = 0; i < parents.length; i++) {
			System.out.println("Child: "+nodes[i].getData()+"\tParent: "+parents[i].getData());
			nodes[i].setVisited(false);
		}
		for (int i = 1; i < parents.length; i++) {
			sum+=parents[i].distances.get(parents[i].neighbors.indexOf(nodes[i]));
		}
		System.out.println("Total Cost: "+sum);*/
		node[] parents=bellmanFord(nodes);
		//nodes[8].setData('H');
		//nodes[9].setData('S');
		int sum=0;
		for (int i = 0; i < parents.length; i++) {
			System.out.println("Child: "+nodes[i].getData()+"\tParent: "+ ((parents[i]==null)? null:parents[i].getData()) );
			nodes[i].setVisited(false);
			if(i!=0 && parents[i]!=null)
				sum+=parents[i].distances.get(parents[i].neighbors.indexOf(nodes[i]));
		}
		System.out.println("Total Cost: "+sum);
	}
}