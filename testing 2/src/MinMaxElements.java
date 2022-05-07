public class MinMaxElements
{ public int Max(int[] m){
    int maxElement=m[0];
    for(int i=0; i<m.length; i++)
    { if(m[i]>maxElement){
        maxElement=m[i];}
    }
    return maxElement;
}
    public int Min(int[]n )
    { int minElement=n[0];
      for(int i=0; i<n.length; i++)
        { if(n[i]<minElement){
            minElement=n[i];}
        }
        return minElement;
    }
}
