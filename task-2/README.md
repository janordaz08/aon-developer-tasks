# Task 2 - Find Arrays

I created a maven project to make my life easier when adding dependencies for the unit tests.

Basically, what I did is I created a separate ```ArrayChecker``` class that has a ```subArrayIndexFinder``` method inside. This method accepts 2 arrays (haystack and the needle) as parameters. I made it so that the method arrays with generic types so I can use it in a more generic way.

The way I'm doing it is to navigate the haystack array index-wise and check if the current index of the haystack matches the value in the 1st index of the needle. Then in the next loop, check again if the next index of the haystack matches the 2nd index of the needle (up to the needle's max length).

If I get to the needle's length with everything matched, that means that the starting point of where I started the loop is the index of where the subarray started and I break the loop to return the value.

If at some point the value of the current index of the haystack doesn't match the succeeding values of the needle, I then reset checking of the needle back to the 1st index.

I have created unit tests and tested different scenarios which all passed.



