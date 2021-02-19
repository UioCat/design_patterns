package iterator;


public interface MyIterator {

    /**
     * 将游标指向第一个
     */
    void first();

    /**
     * 将游标指向下一个
     */
    void next();

    /**
     * 判断游标是否为最后一个
     */
    boolean hasNext();

    boolean isFirst();
    boolean isLast();

    /**
     * 获取当前游标指向的对象
     */
    Object getCurrentObj();
}
