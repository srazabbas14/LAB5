object lab5 {
  def main(args:Array[String]){
    
    println ("Sieze of Eratosthenes")
    println()
    println("Enter a number n: ")
    val n=readInt(); //read number n from user
    
    
    val myList = List.range(2,n+1); //list is created of size n-1 , with elements from 2 to n
    
    println()
    println("Elements in our list:")
    println(myList) //display our newly created list with all elements from 2 to n
    
    val resultList = seiveOfEratosthenes(myList,n,0)
    
     println()
     println("All prime numbers 2 and "+n+ " are :")
     println(resultList)
     
  }
  
  //seive of Eratosthenes function
    def seiveOfEratosthenes(list:List[Int],n:Int,c:Int):List[Int]={ //n is number entered by user, c is index
      
      val size = list.length-1 //get size of list 
      if (c<size) //we are still in the list
      {
        val p=list(c) //takes the next index of list , initially index is 0, at c=0 we have 2, at c=1 we have 3. at c=2 we have 5  
        val newList = removeElements(list,p,c) //we get the modified list 
        seiveOfEratosthenes(newList,n,c+1) //tail recursion call
      }
      else //all multiples have been removed 
      {
       
        return list
      }
    }
    
    //remove the multiples from the list
    def removeElements(list:List[Int],p:Int,acc:Int):List[Int]={ //p is the prime number, acc is our accumulator to traverse the list 
      
    val size = list.length; //get size of the list 
   
      if(acc<size) // if our accumulator is less than the size of the list
     {
       if(list(acc)%p == 0 && list(acc)!=p) //checks that a number is multiple of p and the number is not itself p
       {
        val newList = list.filter(_ != list(acc)) //removes the multiple of p 
        removeElements(newList,p,acc+1) //tail recursion call
       }
       else //not a multiple of p 
         removeElements(list,p,acc+1)  //tail recursion call
    }
     else 
       return list //returns list 
    }
  
}

