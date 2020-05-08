public class find {

    private int[] id;
    public find(int N){
        id = new int[N];
        for (int i = 0; i< N; i++)
            id[i] = i;
    }
    public boolean connection(int q, int r){
        return id[r] == id[q] ;
    }
    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for ( int i = 0; i < id.length; i++)
            if(id[i] == pid) id[i] = qid;
    }
    public int root( int i){
        while(i != id[i] ) i = id[i];
            return i;
    }
    public boolean connection_check_by_root( int a , int b){
        return root(a) == root(b);

    }
    public void union_by_root( int a , int b){
        int root_a = root(a);
        int root_b = root(b);
        id[a] = root_b;

    }
    public static void main( String[] args)
    {

        System.out.println("maksdj");
         find xx = new find(999);
         System.out.println(xx.connection(33,44));
         xx.union(33,44);
        System.out.println(xx.connection(33,44));
    }
}
