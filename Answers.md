## Reinforcement  
**R-5.2** - Explain how to modify the recursive binary search algorithm so that it returns the index of the targe in the sequence or -1 (if the target is not found).  
Assuming the binary search algorithm is implemented to simply say "found", the changes I would make include when the element is found I would take that index, which is likely computed
using the upper and lower bounds of the chunk we are searching, and simply return it. As for the when to know to return -1 if a element is not found, I would probably do something similar to checking if whether
the difference between the right and left bounds is zero or is negative. Alternatively, if the left and right bound cross, -1 could be returned. These checks would tell me that there are no more elements between the upper and lower bound meaning the element was not found.

**R-5.3** - Draw the recursion trace for the computation of power(2,5), using the traditional algorithm, as implemented in Code Fragment 5.8.

	Calling Power Method 1 time: Main.power(2, 5)
		Calling Power Method 2 time: Main.power(2, 4)
			Calling Power Method 3 time: Main.power(2, 3)
				Calling Power Method 4 time: Main.power(2, 2)
					Calling Power Method 5 time: Main.power(2, 1)
						Calling Power Method 6 time: Main.power(2, 0)

						Leaving 6 Power method call. End of chain reached!
					Leaving 5 Power method call: Main.power(2, 1)
				Leaving 4 Power method call: Main.power(2, 2)
			Leaving 3 Power method call: Main.power(2, 3)
		Leaving 2 Power method call: Main.power(2, 4)
	Leaving 1 Power method call: Main.power(2, 5)

**R-5.4** - Draw the recursion trace for the computation of power(2,18), using the repeated squaring algorithm as implemented in Code Fragment 5.9.  

	Calling Power Method 1 time: Main.power(2, 5)
		Calling Power Method 2 time: Main.power(2, 2)
			Calling Power Method 3 time: Main.power(2, 1)
				Calling Power Method 4 time: Main.power(2, 0)

				Leaving 4 Power method call. End of chain reached!
			Leaving 3 Power method call: Main.power(2, 1)
		Leaving 2 Power method call: Main.power(2, 2)
	Leaving 1 Power method call: Main.power(2, 5)

**R-5.5** - Draw the recursion trace for the execution of reverseArray(data,0,4), from Code Fragment 5.7, on array data = 4, 3, 6, 2, 6.  

	Calling reverseArray Method 1 time: Main.reverseArray(data, 0, 4)
		Calling reverseArray Method 2 time: Main.reverseArray(data, 1, 3)
			Calling reverseArray Method 3 time: Main.reverseArray(data, 2, 2)
			Leaving 3 reverseArray method call: Main.reverseArray(data, 2, 2)
		Leaving 2 reverseArray method call: Main.reverseArray(data, 1, 3)
	Leaving 1 reverseArray method call: Main.reverseArray(data, 0, 4)

**R-5.9** - Develop a nonrecursive implementation of the version of the power method from Code Fragment 5.9 that uses repeated squaring.  

Code is located in R-5.9Answer Folder.

## Creativity  
**C-5.17** - Write a short recursive Java method that takes a character string s and outputs its revers.  For example the reverse of 'pots&pans' would be 'snap&stop'.  

Code is located in C-5.17Answer Folder.

**C-5.20** - Write a short recursive java method that rearranges an array of integer values so that all the even values appear before the odd values.  

Code is located in C-5.20Answer Folder
