package data65;
//哈希表的插入、查找、删除方法;链表解决hash冲突
public class MyHashTable {
    private HashNode[] array = new HashNode[10];
    private int size;

    public boolean insert(Integer key) {
        int hashValue = key.hashCode();
        int index = hashValue % array.length;
        HashNode current = array[index];
        while (current != null) {
            if (key.equals(current.key)) {
                return false;
            }
            current = current.next;
        }
        HashNode node = new HashNode(key);//key放入节点node中，并头插进去
        node.next = array[index];
        array[index] = node;
        size++;

        if (size / array.length * 100 >= 75) {
            expansion();//冲突率，扩容
        }
        return true;
    }

    public boolean search(Integer key) {
        int hashValue = key.hashCode();
        int index = hashValue % array.length;
        HashNode current = array[index];
        while (current != null) {
            if (key.equals(current.key)) {
                return true;
            }
            current=current.next;
        }
        return false;
    }

    public boolean remove(Integer key){
        int hashValue = key.hashCode();
        int index = hashValue % array.length;
        HashNode prev=null;
        HashNode current = array[index];
        while (current != null) {
            if (key.equals(current.key)){
                //删除
                if(prev!=null){
                    prev.next=current.next;
                }else{
                    array[index]=current.next;
                }
                size--;
                return true;
            }
            prev=current;
            current=current.next;
        }
        return false;
    }

    // O(n)
    private void  expansion() {
        HashNode[] newArray = new HashNode[array.length * 2];
        //下标和长度有关系，所以不能直接搬运
        // 遍历整个数组
        for (int i = 0; i < array.length; i++) {
            // 遍历每条链表
            HashNode current = array[i];
            while (current != null) {
                //复制节点，简单一点
                Integer key = current.key;
                int hashValue = key.hashCode();
                int index = hashValue % newArray.length;
                // 头插
                HashNode node = new HashNode(key);
                node.next = newArray[index];
                newArray[index] = node;

                current = current.next;
            }
        }
        array = newArray;
    }
}
