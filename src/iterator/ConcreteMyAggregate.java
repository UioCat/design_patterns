package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义聚合容器
 */
public class ConcreteMyAggregate {
    private List<Object> list = new ArrayList<Object>();

    public void addObject(Object ele) {
        this.list.add(ele);
    }

    public void removeObject(Object ele) {
        this.list.remove(ele);
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    // 获得迭代器
    public MyIterator createIterator() {
        return new ConcreteIterator();
    }

    // 使用内部类定义迭代器，可以直接使用外部类的属性
    private class ConcreteIterator implements MyIterator {

        private int cursor; // 定义游标，用于记录遍历时的位置

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if(cursor < list.size()) {
                cursor++;
            }
        }

        @Override
        public boolean hasNext() {
            if(cursor < list.size()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public boolean isFirst() {
            return cursor == 0;
        }

        @Override
        public boolean isLast() {
            return cursor == (list.size() - 1);
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }

}
