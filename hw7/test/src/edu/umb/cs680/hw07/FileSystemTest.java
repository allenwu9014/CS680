package edu.umb.cs680.hw07;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.LinkedList;
public class FileSystemTest {

    private LocalDateTime localdatetime1 = LocalDateTime.now();


    private Directory[] LinkedListToArray(LinkedList<Directory> rootDirs) {
        Directory[] roots = new Directory[rootDirs.size()];
        int i = 0;
        for (Directory root : rootDirs) {
            roots[i++] = root;
        }
        return roots;
    }

    @Test
    public void addgetRootDirectotyTest() {
        Directory root = new Directory(null, "Root", 0, localdatetime1);
        FileSystem filesystem = FileSystem.getFileSystem();
        filesystem.addRootDir(root);
        LinkedList<Directory> roots = filesystem.getRootDirs();
        Directory[] actual = LinkedListToArray(roots);
        Directory[] expected = {root};
        assertArrayEquals(actual, expected);
    }


}
