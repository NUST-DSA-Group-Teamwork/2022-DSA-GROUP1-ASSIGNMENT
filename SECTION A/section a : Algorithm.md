SECTION A - ALGORITHM DESIGN


# initialise doublyNode class with the three parts of a doubly Linked List: node, next address, previous address
doublyNode CLASS 

  declare public string variable song
  
  declare public doublyNode next
  
  declare public doublyNode prev
  
END CLASS

# initialise the doublyLinkedList class with all the functions/methods needed for the functionalities: create doubly linked list for playlist, add song, remove song, search song, traverse song
doublyLinkedList CLASS 

  declare doublyNode head

  declare doublyNode tail

  declare integer size variable to be used functions such as traversing, searching, inserting and deleting of nodes

  # function to create a doubly linked list playlist
  function createDoublyLinkedList (declare String nodeValue)
  
    head := new doublyNode()
    
    doublyNode newNode := new doublyNode()
    
    newNode.song := nodeValue
    
    newNode.next := null
    
    newNode.prev := null

    head := newNode
    
    tail := newNode
    
    size := 1
    
    return head value
  
  END FUNCTION
  
  # function to insert a song into the doubly linked playlist
  function insertSong (declare string nodeValue, declare integer locationOfNode)
    
    doublyNode newNode := new doublyNode()
    
    newNode.song := nodeValue

  IF head is equal to null then
  
       createDoublyLL(nodeValue)
       
       RETURN value
       
  ELSE IF location is equal to 0 THEN # inserting at the beginning
  
        newNode.next := head
        
        newNode.prev := null
        
        head.prev := newNode
        
        head := newNode
        
    ELSE IF locationOfNode is greater than or equal to size THEN ### inserting at the end
    
        newNode.next := null
        
        tail.next := newNode
        
        newNode.prev := tail
        
        tail := newNode
        
    ELSE ### inserting at a specified location
    
        doublyNode tempNode := head
        
        integer index := 0
        
        WHILE index is less than locationOfNode minus 1 DO
        
            tempNode := tempNode.next
            
            INCREMENT index variable
            
        END WHILE
        
        newNode.prev := tempNode
        
        newNode.next := tempNode.next
        
        tempNode.next := newNode
        
        newNode.next.prev := newNode
        
    END IF
    
    INCREMENT size ### increase size every time a song is added
    
  END FUNCTION
  
  # function to playing songs
  function playSong ()
    
    IF head does not equal null THEN ### we can traverse through the playlist
    
        doublyNode tempNode := head
        
        FOR integer i := 0 to less than size DO
        
            PLAY tempNode.song

            tempNode := tempNode.next ### goes to next song
            
        END FOR
        
    ELSE
    
        PRINT "Playlist does not exist!"
        
    END IF
    
  END FUNCTION
  
  # function to search for a song
  function searchSong (declare string nodeValue)
    
    IF head does not equal null THEN ### playlist is not empty so we can look for a song
    
      doublyNode tempNode := head

      FOR integer i := 0 to less than size DO
      
          IF tempNode.song is equal to nodeValue THEN
          
              DISPLAY tempNode.song
              
              RETURN true
              
          END IF
          
          tempNode := tempNode.next # if song is not found, go to next node
          
      END FOR
      
     END IF
     
     PRINT "Song does not exist!"
     
     return false;
     
  END FUNCTION
    
  END FUNCTION

END CLASS
