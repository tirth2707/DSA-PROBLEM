class Solution {
    
    static ArrayList<String> res=new ArrayList<>();
    static int len;
    static int[][] visited;
    
    public static boolean isSafe(int[][] m,int x,int y)
    {
        if(x<0 || y<0 || x>len-1 || y>len-1 ||m[x][y]==0)
        {
            return false;
        }
        return true;
    }
    
    static void solveMaze(int[][] m,int x,int y,String str)
    {
        if(x==len-1 && y==len-1 && m[x][y]==1)
        {
            res.add(str);
            return;
            
        }
        
        if(isSafe(m,x,y) && visited[x][y]!=1)
        {
            visited[x][y]=1;
            solveMaze(m,x+1,y,str+"D");
            solveMaze(m,x-1,y,str+"U");
            solveMaze(m,x,y+1,str+"R");
            solveMaze(m,x,y-1,str+"L");
            
            
            
            visited[x][y]=0;
            
        }
    }
    
    
    
    
    
    public static ArrayList<String> findPath(int[][] m, int n) {
        
        len = n;
        res.clear();
        visited = new int[n][n];
        solveMaze(m,0,0,"");
        Collections.sort(res);
        return res;
    }
}