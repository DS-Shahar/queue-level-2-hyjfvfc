    public static int ex12(BinNode<Integer> T)
{
        if (T == null)
            return 0;


        if (10<=T.getValue()&&T.getValue()<100&&T.hasRight()&&T.hasLeft()){
            return ex12(T.getLeft()) + ex12(T.getRight())+1;}
        else{    
            return ex12(T.getLeft()) + ex12(T.getRight());}
    }


    public static int ex14(BinNode<Integer> T)
{
        if (T == null)
            return 0;


        if (!T.hasRight()&&!T.hasLeft()){
            return ex14(T.getLeft()) + ex14(T.getRight())+1;}
        else{    
            return ex14(T.getLeft()) + ex14(T.getRight());}
    }
    
    
     public static int ex16(BinNode<Integer> T)
{
        if (T == null)
            return 0;


        if (T.hasRight()&&T.hasLeft()){
            return ex16(T.getLeft()) + ex16(T.getRight())+T.getValue();}
        else{    
            return ex16(T.getLeft()) + ex16(T.getRight());}
    }
    
    
     public static int ex17(BinNode<Integer> T)
{
        if (T == null)
            return 0;
        
        int Count = 0;

      if (T.hasRight()&&T.hasLeft()){

       boolean leftOk =T.getLeft().hasRight()||T.getLeft().hasLeft();
       boolean rightOk=T.getRight().hasRight()||T.getRight().hasLeft();
       
        if (leftOk&&rightOk){
            Count=1;}}
         
           
    return Count+ex17(T.getLeft()) + ex17(T.getRight());}
    
       
    public static boolean ex18(BinNode<Integer> T1, BinNode<Integer> T2){
        if(T1==null&&T2==null){
            return true;}
        
         if (T1 == null || T2 == null) {
        return false;}
        
        if(T1.getValue()!=T2.getValue()){
            return false;
    }
    return ex18(T1.getLeft(), T2.getLeft()) && ex18(T1.getRight(), T2.getRight());}
    
      
    public static int count(BinNode<Integer> T) {
    if (T == null)
    return 0;
    return 1 + count(T.getLeft()) + count(T.getRight());
}

public static int findMax(BinNode<Integer> T) {
    int max = T.getValue(); 

    if (T.hasLeft()) {
        int leftMax = findMax(T.getLeft());
        if (leftMax > max) {
            max = leftMax;
        }
    }

    if (T.hasRight()) {
        int rightMax = findMax(T.getRight());
        if (rightMax > max) {
            max = rightMax;
        }
    }

    return max;
}
   public static int sum(BinNode<Integer> T) {
    if (T == null)
    return 0;
    return T.getValue() + sum(T.getLeft()) + sum(T.getRight());
}

   
  public static boolean ex20(BinNode<Integer> T, int num){
      if (T == null)
            return true;
            
     int count = count(T);
    int max = findMax(T);
    int sum = sum(T);
    
    if(!(count==num&&max==num&&sum==(num*(num+1)/2))){
        
           return false;}
           
   else{
       return true;
   }
    }
