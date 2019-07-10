package ultil;

public class LinkedList {
	Node headOfList;

	public static LinkedList add(LinkedList list, int element) {
		// Create a new node with given element
		Node node = new Node(element);
		
		// If the Linked List is empty,
		// then make the new node as head
		if (list.headOfList == null) {
			list.headOfList = node;
		} else {
			// Else traverse till the last node
			// and insert the new_node there
			Node elementLast = list.headOfList;
			while (elementLast.next != null) {
				elementLast = elementLast.next;
			}
			// Insert the new_node at last node
			elementLast.next = node;
		}
		// Return the list by head
		return list;
	}

	public static void toString(LinkedList list) {
		Node currNode = list.headOfList;

		System.out.print("LinkedList: ");

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.element + " ");

			// Go to next node
			currNode = currNode.next;
		}
	}
	
	  // Method to delete a node in the LinkedList by POSITION 
    public static LinkedList deletePosition(LinkedList list, int index) 
    { 
        // Store head node 
        Node currNode = list.headOfList;
        Node nodePrevious = null; 
  
        // 
        // CASE 1: 
        // If index is 0, then head node itself is to be deleted 
  
        if (index == 0 && currNode != null) { 
            list.headOfList = currNode.next; // Changed head 
  
            // Display the message 
            System.out.println(index + " position element deleted"); 
  
            // Return the updated List 
            return list; 
        } 
  
        // 
        // CASE 2: 
        // If the index is greater than 0 but less than the size of LinkedList 
        // 
        // The counter 
        int counter = 0; 
  
        // Count for the index to be deleted, 
        // keep track of the previous node 
        // as it is needed to change currNode.next 
        while (currNode != null) { 
  
            if (counter == index) { 
                // Since the currNode is the required position 
                // Unlink currNode from linked list 
            	nodePrevious.next = currNode.next; 
  
                // Display the message 
                System.out.println(index + " position element deleted"); 
                break; 
            } 
            else { 
                // If current position is not the index 
                // continue to next node 
            	nodePrevious = currNode; 
                currNode = currNode.next; 
                counter++; 
            } 
        } 
  
        // If the position element was found, it should be at currNode 
        // Therefore the currNode shall not be null 
        // 
        // CASE 3: The index is greater than the size of the LinkedList 
        // 
        // In this case, the currNode should be null 
        if (currNode == null) { 
            // Display the message 
            System.out.println(index + " position element not found"); 
        } 
  
        // return the List 
        return list; 
    } 
    
 // Method to delete a node in the LinkedList by KEY 
    public static LinkedList deleteByKey(LinkedList list, int key) 
    { 
        // Store head node 
        Node currNode = list.headOfList;
        Node nodePrevious = null; 
  
        // 
        // CASE 1: 
        // If head node itself holds the key to be deleted 
  
        if (currNode != null && currNode.element == key) { 
            list.headOfList = currNode.next; // Changed head 
  
            // Display the message 
            System.out.println("deleted"); 
  
            // Return the updated List 
            return list; 
        } 
  
        // 
        // CASE 2: 
        // If the key is somewhere other than at head 
        // 
  
        // Search for the key to be deleted, 
        // keep track of the previous node 
        // as it is needed to change currNode.next 
        while (currNode != null && currNode.element != key) { 
            // If currNode does not hold key 
            // continue to next node 
        	nodePrevious = currNode; 
            currNode = currNode.next; 
        } 
  
        // If the key was present, it should be at currNode 
        // Therefore the currNode shall not be null 
        if (currNode != null) { 
            // Since the key is at currNode 
            // Unlink currNode from linked list 
        	nodePrevious.next = currNode.next; 
  
            // Display the message 
            System.out.println(key + " found and deleted"); 
        } 
  
        // 
        // CASE 3: The key is not present 
        // 
  
        // If key was not present in linked list 
        // currNode should be null 
        if (currNode == null) { 
            // Display the message 
            System.out.println(" not found"); 
        } 
  
        // return the List 
        return list; 
    } 
    
    //method clear element 
    public static void clear(LinkedList linkedList){
    	if (linkedList != null) {
    		linkedList.headOfList = null;
    		System.out.println("all element have been cleared");
		}
    }
}
