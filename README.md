Custom-DSA 📚✨
==============

Welcome to the **Custom-DSA** repository! This project features custom implementations of various **Data Structures** and **Algorithms**, focusing on how they work internally. I'll be adding more implementations over time, so keep an eye out for updates!

📂 **Contents**
---------------

*   [Implemented Data Structures](#implemented-data-structures)
    
    *   [📚 Stack](#stack)
        
    *   [🔄 Queue](#queue)
        
    *   [🌀 Dynamic Queue](#dynamic-queue)
        
    *   [🔗 Linked List](#linked-list)
        
*   [⚙️ Algorithm](#algorithm)
    
    *   [🚩 Dutch National Flag Problem](#dutch-national-flag-problem)
        
*   [📄 File Handling](#file-handling)
    
    *   [🛠️ File Reader with Try-Catch](#file-reader-with-try-catch)
        
*   [🔜 Upcoming Features](#upcoming-features)
    
    *   Binary Trees 🌳
        
    *   Heaps 🏔️
        
    *   Graphs 🖧
        
    *   Hash Tables 📊
        
    *   Sorting/Searching Algorithms 🔍
        

Implemented Data Structures
---------------------------

### **Stack 📚**

The **Stack** is a linear data structure that follows the **Last In, First Out (LIFO)** principle. Here’s a look at how this implementation works internally:

*   **Push**: Add an element to the top of the stack.
    
*   **Pop**: Remove the top element from the stack.
    
*   **Peek**: View the top element without removing it.
    

### **Queue 🔄**

A **Queue** is a linear structure following the **First In, First Out (FIFO)** principle. It allows:

*   **add:** Insert' s the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
    
*   **offer:** Insert' s the specified element into this queue if it is possible to do so immediately without violating capacity restrictions. When using a capacity-restricted queue, this method is generally preferable to [add(E)](https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html#add-E-), which can fail to insert an element only by throwing an exception.
    
*   **remove:** Retrieves and removes the head of this queue. This method differs from [poll](https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html#poll--) only in that it throws an exception if this queue is empty.
    
*   **poll:** Retrieves and removes the head of this queue, or returns null if this queue is empty.
    
*   **peek:** Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
    

### **Dynamic Queue 🌀**

This is an enhanced version of the standard queue, where the queue dynamically resizes based on the elements being added or removed. It is especially useful when the number of elements is unpredictable.

### **Linked List 🔗**

The **Linked List** is a collection of nodes where each node contains a reference (or link) to the next node. This implementation supports:

*   **Insert**: Add a new node to the list.
    
*   **Delete**: Remove an existing node.
    
*   **Traverse**: Navigate through the linked list.
    
*   **InsertFirst:** Insert the item at the beginning of LL.
    
*   **InsertLast:** Insert the item at the end tail.
    
*   **InsertatPosition:** Inserts at the specified position in the linked list.
    
*   **etc…..**
    

Algorithm
---------

### Dutch National Flag Algorithm 🚩

This algorithm solves the problem of sorting an array containing three types of elements (e.g., 0s, 1s, and 2s) in linear time, using constant space.

File Handling
-------------

### File Reader with Try-Catch 📄

This is an implementation of a file reader that safely reads files using **try-with-resources** to handle exceptions and ensure that resources are closed automatically.

Upcoming Features 🔜
--------------------

*   Binary Trees 🌲
    
*   Heaps 🏔️
    
*   Graphs 🖧
    
*   Hash Tables 📊
    
*   Sorting/Searching Algorithms 📈
    

Stay tuned for more updates!
