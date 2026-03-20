class TrieNode{
    TrieNode[] links = new TrieNode[26];
    boolean end = false;
}
class Trie {
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode temp = root;
        for(int i = 0; i < word.length(); i++){
            int index = word.charAt(i) - 'a';
            if(temp.links[index] == null){
                temp.links[index] = new TrieNode();
            }
            temp = temp.links[index];
        }
        temp.end = true;
    }
    
    public boolean search(String word) {
        TrieNode temp = root;
        for(int i = 0; i < word.length(); i++){
            int index = word.charAt(i) - 'a';
            if(temp.links[index] == null){
                return false;
            }
            temp = temp.links[index];
        }
        return temp.end;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode temp = root;
        for(int i = 0; i < prefix.length(); i++){
            int index = prefix.charAt(i) - 'a';
            if(temp.links[index] == null){
                return false;
            }
            temp = temp.links[index];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */