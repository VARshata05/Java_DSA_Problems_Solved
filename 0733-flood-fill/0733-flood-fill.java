class Solution {
    int oldColor,newColor;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {
        oldColor=image[sr][sc];
        newColor=color;
        if(oldColor==newColor) return image;
        dfs(image,sr,sc);
        return image;
    }
    private void dfs(int[][]image,int r,int c)
    {
        if(r<0||c<0||r>=image.length||c>=image[0].length)
        {
            return;
        }
        if(image[r][c]!=oldColor)
        {
            return;
        }
        image[r][c]=newColor;
        dfs(image,r+1,c);
        dfs(image,r-1,c);
        dfs(image,r,c+1);
        dfs(image,r,c-1);
    }
}