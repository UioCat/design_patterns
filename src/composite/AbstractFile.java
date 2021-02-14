package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象构建
 */
public interface AbstractFile {
    void killVirus();
}

class Folder implements AbstractFile {

    /**
     * 用于存下面的叶子节点
     */
    private List<AbstractFile> list = new ArrayList<>();

    @Override
    public void killVirus() {
        System.out.println("查杀文件夹");
        for(AbstractFile file : list) {
            // 文件夹内还有文件夹或文件夹下还有目录
            file.killVirus();
        }
    }
}

/**
 * 叶子
 */
class ImageFile implements AbstractFile {

    @Override
    public void killVirus() {
        System.out.println("查杀图像文件");
    }
}

/**
 * 叶子
 */
class TextFile implements AbstractFile {

    @Override
    public void killVirus() {
        System.out.println("查杀文本文件");
    }
}
