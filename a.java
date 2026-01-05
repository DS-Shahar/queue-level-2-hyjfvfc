import java.util.*;
public class Main
{
    public static Queue <Integer> copyQ(Queue <Integer> q){
    Queue <Integer> h= new Queue<Integer>();
    Queue <Integer> p= new Queue<Integer>();
        while(!q.isEmpty()){
            p.insert(q.head());
            h.insert(q.remove());}
            
            while (!p.isEmpty()) {
             q.insert(p.remove());   }
                
         return h; } 

public static int max(Queue <Integer> q){
    Queue <Integer> q2=copyQ(q);
    int max=0;
    
    while(!q2.isEmpty()){
         int a=q2.remove();
         if(a>max){
             max=a;
         }
    }
return max;}

public static int log( int x){
int num = (int)Math.log10(x) + 1;

return num; }

public static int loction(int num, int x){
    
int count=0;
int digit=0;
while(num!=0){
     count++;
    if(count==x+1){
        digit= num%10;
        
    }
num=num/10;
}
 if(x+1>count){
    return 0;
 }
return digit;}

public static Queue <Integer>  sort(Queue <Integer> q) {
 Queue <Integer> []a=new Queue [10];
 for(int i=0;i<10;i++){
     a[i]= new Queue<>();
 }
 int x=log(max(q));
 
  for(int i=0;i<x;i++){
      
    while(!q.isEmpty()){
     
        int num=q.remove();
        a[loction(num,i)].insert(num);}
        
      for(int j=0;j<10;j++){
          while(!a[j].isEmpty()){
              q.insert(a[j].remove());}
        
      }
  }
  return q;}

static Scanner reader = new Scanner(System.in);
public static void main(String []args){
    Queue <Integer> q= new Queue<Integer>();
    q.insert(3);
    q.insert(3);
    q.insert(6);
    q.insert(11);
    q.insert(2);
System.out.println(loction(567,2));  
