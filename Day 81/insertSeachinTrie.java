/*Complete the Insert and Search functions for a Trie Data Structure. 

Insert: Accepts the Trie's root and a string, modifies the root in-place, and returns nothing.
Search: Takes the Trie's root and a string, returns true if the string is in the Trie, otherwise false.
Note: To test the correctness of your code, the code-judge will be inserting a list of N strings called into the Trie, and then will search for the string key in the Trie. The code-judge will generate 1 if the key is present in the Trie, else 0.

Example 1:

Input:
n = 8
list[] = {the, a, there, answer, any, by, bye, their}
key = the
Output: 1
Explanation: 
"the" is present in the given set of strings. */
static void insert(TrieNode root, String key) 
{
    // Your code here
    TrieNode curr = root;
    for(int level=0; level<key.length(); level++){
        int idx = key.charAt(level)-'a';
        if(curr.children[idx] == null){
            curr.children[idx] = new TrieNode();
        }
        curr = curr.children[idx];
    }
    curr.isEndOfWord = true;
}

static boolean search(TrieNode root, String key)
{
    
    TrieNode curr = root;
    for(int level=0; level<key.length(); level++){
        int idx = key.charAt(level)-'a';
        if(curr.children[idx] == null){
            return false;
        }
        curr = curr.children[idx];
    }
    return curr.isEndOfWord == true;
}
