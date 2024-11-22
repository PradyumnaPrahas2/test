package dsa_java;

public class TrieImplementation {
    public static void main(String... args){
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));   
        System.out.println(trie.search("app"));     
        System.out.println(trie.startsWith("app"));  
        trie.insert("app");
        System.out.println(trie.search("app"));      
    }
}
class TrieNode{
    TrieNode[] children;
    boolean islast;
    TrieNode(){
        children= new TrieNode[26];
        islast=false;
    }
}
class Trie{
    TrieNode root;
    Trie(){
        root=new TrieNode();
    }

    public void insert(String word){
        TrieNode current=root;

        for(char c:word.toCharArray()){
            int idx=c-'a';

            if(current.children[idx]==null){
                current.children[idx]=new TrieNode();
            }
            current=current.children[idx];
        }
        current.islast=true;
    }

    public boolean search(String word){
        TrieNode current=root;

        for(char c:word.toCharArray()){
            int idx=c-'a';

            if(current.children[idx]==null){
                return false;
            }
            current=current.children[idx];
        }
        return current.islast;
    }

    public boolean startsWith(String prefix){
        TrieNode current=root;

        for(char c:prefix.toCharArray()){
            int idx=c-'a';

            if(current.children[idx]==null){
                return false;
            }
            current=current.children[idx];
        }
        return true;

    }
}