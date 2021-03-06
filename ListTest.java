public class ListTest {
	
    public static void main(String[] args) {   
        LinkedIntList list = new LinkedIntList();
        processList(list);
    }

    public static void processList(LinkedIntList list) {
        list.add(20);
        list.add(11);
        list.add(73);
        list.add(111);
        System.out.print(list);        
        System.out.println(" ----> Is the list in sorted? " + list.isSorted());
        list.remove(1);        
        System.out.print(list);         
        System.out.println(" ----> Is the list in sorted? " + list.isSorted());
        System.out.println(""); 
        
        //check empty list
        list.remove(0);
        list.remove(0);
        list.remove(0);          
        System.out.print(list);         
        System.out.println(" ----> Is An empty list considered to be sorted. " + list.isSorted());
        System.out.println("");
        
        list.add(20);
        list.add(73);
        list.add(11);
        list.add(111);
        System.out.print(list);        
        System.out.println(" ----> Is the list in sorted? " + list.isSorted());       
        list.remove(1);
        System.out.print(list);        
        System.out.println(" ----> Is the list in sorted? " + list.isSorted());
        
    }
}