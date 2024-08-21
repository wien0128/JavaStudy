package thisIsJava.streamEx.sec07;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// 파일로부터 스트림 얻기

public class StreamFileMain {
    public static void main(String[] args) throws URISyntaxException, IOException {
        Path path = Paths.get(StreamFileMain.class.getResource("data.txt").toURI());
        Stream<String> stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(line -> System.out.println(line));
        stream.close();
    }
}
