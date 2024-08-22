import java.util.*;
class col{

    public static void main(String[] arg){
    //Array 
    
    int []a={1,2,3,4,5};
    System.out.println(Arrays.toString(a));


    //ArrayList
    ArrayList<Integer> al = new ArrayList<>();
    al.add(5);
    al.add(4);
    al.add(3);


    System.out.println("Original List: "+al);


    //LinkedList
     LinkedList<Integer> l = new LinkedList<>();
      l.add(1);
      l.addFirst(2);
      l.addLast(3);
      System.out.println(l);
      String list= l.toString();
      System.out.println(list.length());
    
     
     //Stack
     Stack<Character> stack=new Stack<>();
     stack.push('h');
     System.out.println("After popping: "+stack);
     System.out.println(stack.peek());



     //set
     HashSet<Integer> set= new HashSet<>();
     set.add(1);
     set.add(2);
     set.add(3);
    
     System.out.println("Original Set: "+set);


     //map
     HashMap<Integer,String> map= new HashMap<>();
     map.put(1, "one");
     map.put(2, "two");
     map.put(3, "three");
     Set<Integer> setNew= map.keySet();
     for(Integer key : setNew){
         System.out.println("Key: "+key+" Value: "+map.get(key));
     }



    }
}