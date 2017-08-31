# Sleep Sort
## The Stupidest sorting algorithm ever devised.


The way it works is by creating new threads for every item in an iterable and printing the content of that item after a certain delay. So in an array [1,2,3] it would print "1" after 1ms, "2" after 2ms and "3" after 3ms. It does this by spinning up a new thread for each item and running `Thread.sleep(i)` where "i" is the int or item in the iterable.
