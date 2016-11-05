package hard;

public class Prob146_LRU_Cache {
    
    class ListNode {
        int key;
        int val;
        ListNode pre;
        ListNode nxt;
        
        public ListNode(int key, int val) {
            this.key = key;
            this.val = val;
            pre = null;
            nxt = null;
        }
    }
    
    private ListNode head, tail;
    private Map<Integer, ListNode> map;
    final int capacity;
    private int count;
    
    public LRUCache(int capacity) {
        map = new HashMap<>(capacity);
        head = new ListNode(-10, -10);
        tail = new ListNode(-10, -10);
        head.pre = head;
        head.nxt = tail;
        tail.pre = head;
        tail.nxt = tail;
        this.capacity = capacity;
        this.count = 0;
    }
    
    public int get(int key) {
        ListNode cur = map.get(key);
        if (cur != null) {
            update(cur);
            return cur.val;
        } else {
            return -1;
        }
    }
    
    public void set(int key, int value) {
        if (map.containsKey(key)) {
            // move it towards the tail to make it the most recently used one
            ListNode cur = map.get(key);
            cur.val = value;
            update(cur);
        } else {
            // insert new key into the cache
            ListNode cur = new ListNode(key, value);
            map.put(key, cur);
            add(cur);
            if (count < capacity) {
                count++;
            } else {
                // The cache is full. Remove the head one and insert the new one into the tail
                ListNode first = head.nxt;
                head.nxt = first.nxt;
                map.remove(first.key);
                remove(first);
            }
        }
    }
    
    private void add(ListNode cur) {
        cur.pre = tail.pre;
        cur.nxt = tail;
        cur.pre.nxt = cur;
        tail.pre = cur;
    }
    
    private void remove(ListNode cur) {
        cur.pre.nxt = cur.nxt;
        cur.nxt.pre = cur.pre;
    }
    
    private void update(ListNode cur) {
        remove(cur);
        add(cur);
    }
    
}
