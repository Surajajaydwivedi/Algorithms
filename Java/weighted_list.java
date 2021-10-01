import java.util.*;
class weighted_list
{
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }
    static private int V;
    static private LinkedList <Edge> adj[];
    void addEdge(int s, int d, int w) {
        Edge edge = new Edge(s, d, w);
        Edge edge1=new Edge(d,s,w);
        adj[s].addFirst(edge); 
        adj[d].addFirst(edge1);
    }

    weighted_list(int v)
    {

        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<V;i++)
            adj[i]=new LinkedList();

    }

    static int dfs(int v,boolean visited[])
    {
        Iterator <Edge> i=adj[v].listIterator();
        int n,min;
        min=Integer.MAX_VALUE;
        Edge e;
        while(i.hasNext())
        {
            e=i.next();
            if(visited[e.destination]!=true)
            {
                n=e.weight;
                if(n<min)
                    min=n;
            }
        }
        return min;
    }

    public static void main(String args[])
    {
        Scanner d=new Scanner(System.in);
        int n,m,k,u,v,l,i;
        n=17;//d.nextInt();
        //m=d.nextInt();
        k=d.nextInt();
        weighted_list g=new weighted_list(n);
        //for(i=0;i<m;i++)
        //{
            //u=d.nextInt();
            //v=d.nextInt();
            //l=d.nextInt();
            //g.addEdge(u,v,l);
            //g.addEdge(v,u,l);
            g.addEdge(1,2,8);
            g.addEdge(2,3,5);
            g.addEdge(3,4,4);
            g.addEdge(4,5,5);
            g.addEdge(5,6,2);
            g.addEdge(1,6,3);
            g.addEdge(2,4,1);
            g.addEdge(1,5,15);
            g.addEdge(6,7,4);
            g.addEdge(7,8,3);
            g.addEdge(8,9,5);
            g.addEdge(9,10,8);
            g.addEdge(3,10,9);
            g.addEdge(4,9,6);
            g.addEdge(5,9,7);
            g.addEdge(5,8,7);
            g.addEdge(10,14,2);
            g.addEdge(8,11,1);
            g.addEdge(7,11,12);
            g.addEdge(7,12,1);
            g.addEdge(11,12,6);
            g.addEdge(13,14,1);
            g.addEdge(9,13,3);
            g.addEdge(11,13,2);
            g.addEdge(12,15,3);
            g.addEdge(15,16,2);
            g.addEdge(16,17,1);
            g.addEdge(14,17,6);
            g.addEdge(11,16,12);
            g.addEdge(13,16,4);
            g.addEdge(13,17,2);
        //}
        if(k==0)
            System.out.println(-1);
        else
        {
            int c[]=new int[k];
            for(i=0;i<k;i++)
                c[i]=d.nextInt()-1;
            boolean visited[]=new boolean[V];
            for(i=0;i<k;i++)
                visited[c[i]]=true;
            int x,min;
            min=Integer.MAX_VALUE;
            for(i=0;i<k;i++)
            {
                x=dfs(c[i],visited);
                if(x<min)
                    min=x;
            }
            if(min==Integer.MAX_VALUE)
                System.out.println(-1);
            else
                System.out.println(min);
        }
    }
}
