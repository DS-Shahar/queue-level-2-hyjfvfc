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
    
    
        public static boolean isEven(BinNode<Integer> T)
{
        if (T == null)
            return true;


        if (!T.hasRight()&&!T.hasLeft()&& T.getValue()%2==1){
            return false;}
        else{    
            return isEven(T.getLeft())&&isEven(T.getRight());}
    }

}
 
 
