// --------------------------- Explanation 1 ---------------------------------

// When you sort an array with .sort(), it assumes that you are sorting strings. 
// When sorting numbers, the default behavior will not sort them properly.

// The function that you pass tells how to sort the elements. 
// It takes two parameters (a and b) that represent any two elements from the array. 
// How the elements will be sorted depends on the function’s return value:

// 1) if it returns a negative value, the value in a will be ordered before b.
// 2) if it returns 0, the ordering of a and b won’t change.
// 3) if it returns a positive value, the value in b will be ordered before a.

// When you pass the function (a, b) => a - b, you’re telling the .sort() function to sort the numbers in ascending order.

// ------------------------------- Explanation 2 ---------------------------------

// (a, b) => a - b is a shortcut notation for:
// function (a, b){
//   return a - b;
// }
// Function sort takes a comparison function as a parameter. This is what the sorting algorithm uses repeatedly 
// to compare two elements in the array and decide which one goes to the left of the array and which goes to the right.
// If you’re sorting numbers in ascending order, the smallest goes to the left. If you’re sorting in descending order, 
// the biggest goes to the left.

// The function needs to return -1 for a to be sorted to the left of b, 
// 1 to be sorted to the right of b and 0 to be considered equal.

// In this case a - b returns
// 1) a negative number if a is smaller than b – so a will be sorted to the left of b
// 2) a positive number if a is bigger than b – so a will be sorted to the right of b
// 3) zero if they are equal – so it doesn’t matter which one comes first
// 4) If you wanted to sort in descending order, i.e. bigger numbers first, 
//    you’d need your function to return b - a to invert the logic.

// Using a comparison function also allows you to sort your numbers in a completely different way to serve your purpose. 
// You could for instance sort all the odd numbers first then the even numbers 
// (the example doesn’t care about the internal order within odd and even numbers):

// function compare(a, b){
//   let mod_a = a % 2;
//   let mod_b = b % 2;
//   return mod_b - mod_a;
// }
// And of course, this is not limited to numbers. You can sort just about any data with your own arbitrary criteria. 
// For instance you can sort strings based on their lowercase value instead of the default Unicode, or ignore ‘a’ and ‘the’ 
// at the beginning. You can sort an array of objects representing your music collection by artist, or by album name, 
// or by date, or all of the above.

public class Java_Comparator {
    
}
